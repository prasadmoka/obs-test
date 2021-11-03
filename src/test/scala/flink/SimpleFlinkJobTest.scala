package flink


import function.SimpleFunction
import org.apache.flink.streaming.util.ProcessFunctionTestHarnesses
import org.scalatest.{FlatSpec, Matchers}


class SimpleFlinkJobTest extends  FlatSpec with Matchers{

  //instantiate created user defined function
  val processFunction = new SimpleFunction

  // wrap user defined function into a the corresponding operator
  val harness = ProcessFunctionTestHarnesses.forProcessFunction(processFunction)

}
