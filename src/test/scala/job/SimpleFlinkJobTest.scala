package job

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.module.scala.DefaultScalaModule
import config.ObservationProcessConfig
import function.SimpleFunction
import org.apache.flink.streaming.runtime.streamrecord.StreamRecord
import org.apache.flink.streaming.util.{OneInputStreamOperatorTestHarness, ProcessFunctionTestHarnesses}
import org.scalatest.{FlatSpec, Matchers}


class SimpleFlinkJobTest extends  FlatSpec with Matchers{

  //instantiate created user defined function
  val processFunction = new SimpleFunction

  val objMapper = new ObjectMapper

  "SimpleFunction" should "write data into both log and output topics" in {
    // wrap user defined function into a the corresponding operator
    val harness = ProcessFunctionTestHarnesses.forProcessFunction(processFunction)


    //StreamRecord object with the sample data
    val testData: StreamRecord[String] = new StreamRecord[String](BatchData.LOG_EVENT)
    harness.processElement(testData)

    harness.getSideOutput(ObservationProcessConfig.eventsLogTag) should have size 1
    harness.getSideOutput(ObservationProcessConfig.eventsOutputTag) should have size 1

    objMapper.registerModule(DefaultScalaModule)

    //Check the data from the log topic
    harness.getSideOutput(ObservationProcessConfig.eventsLogTag).forEach(data =>{
      val eventMap = objMapper.readValue(data.getValue.asInstanceOf[String], classOf[Map[String,AnyRef]])
      assert(eventMap.get("mid").get.asInstanceOf[String] == "LOG:5f3c177f90bd5833deade577cc28cbb6");
    })
    //Check whether the same data is being written to output topic as well
    harness.getSideOutput(ObservationProcessConfig.eventsOutputTag).forEach(data =>{
      val eventMap = objMapper.readValue(data.getValue.asInstanceOf[String], classOf[Map[String,AnyRef]])
      assert(eventMap.get("mid").get.asInstanceOf[String] == "LOG:5f3c177f90bd5833deade577cc28cbb6");
    })


    harness.close()
  }

  "SimpleFunction" should "write data into output event topic" in {
    // wrap user defined function into a the corresponding operator
    val harness: OneInputStreamOperatorTestHarness[String, String] = ProcessFunctionTestHarnesses.forProcessFunction(processFunction)


    //StreamRecord object with the sample data
    val testData: StreamRecord[String] = new StreamRecord[String](BatchData.OUT_EVENT)
    harness.processElement(testData)

    harness.getSideOutput(ObservationProcessConfig.eventsOutputTag) should have size 1
    harness.close()
  }

  "SimpleFunction" should "write multiple events into output and log topic" in {
    // wrap user defined function into a the corresponding operator
    val harness: OneInputStreamOperatorTestHarness[String, String] = ProcessFunctionTestHarnesses.forProcessFunction(processFunction)


    //StreamRecord object with the sample data
    val testData: StreamRecord[String] = new StreamRecord[String](BatchData.OUT_LOG_EVENT)
    harness.processElement(testData)

    harness.getSideOutput(ObservationProcessConfig.eventsLogTag) should have size 1
    harness.getSideOutput(ObservationProcessConfig.eventsOutputTag) should have size 2
    harness.close()
  }


  "SimpleFunction" should "throw exception when there are no events in the input" in {
    // wrap user defined function into a the corresponding operator
    val harness: OneInputStreamOperatorTestHarness[String, String] = ProcessFunctionTestHarnesses.forProcessFunction(processFunction)


    //StreamRecord object with the sample data
    val testData: StreamRecord[String] = new StreamRecord[String](BatchData.NO_EVENTS)
    an [NoSuchElementException] should be thrownBy harness.processElement(testData)

  }
}
