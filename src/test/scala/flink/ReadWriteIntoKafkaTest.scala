package flink

class ReadWriteIntoKafkaTest  {

  val LOG_EVENT: String =
    """
      |{"id":"sunbird.telemetry","ver":"3.0","ets":1529500243591,"params":{"msgid":"3fc11963-04e7-4251-83de-18e0dbb5a684",
      |"requesterId":"","did":"a3e487025d29f5b2cd599a8817ac16b8f3776a63","key":""},"events":[{"eid":"LOG","ets":1529499971358,
      |"ver":"3.0","mid":"LOG:5f3c177f90bd5833deade577cc28cbb6","actor":{"id":"159e93d1-da0c-4231-be94-e75b0c226d7c",
      |"type":"user"},"context":{"channel":"b00bc992ef25f1a9a8d63291e20efc8d","pdata":{"id":"local.sunbird.portal",
      |"ver":"0.0.1"},"env":"content-service","sid":"PCNHgbKZvh6Yis8F7BxiaJ1EGw0N3L9B","did":"cab2a0b55c79d12c8f0575d6397e5678",
      |"cdata":[],"rollup":{"l1":"ORG_001","l2":"0123673542904299520","l3":"0123673689120112640",
      |"l4":"b00bc992ef25f1a9a8d63291e20efc8d"}},"object":{},"tags":["b00bc992ef25f1a9a8d63291e20efc8d"],
      |"edata":{"type":"api_access","level":"INFO","message":"","params":[{"url":"/content/composite/v1/search"},
      |{"protocol":"https"},{"method":"POST"},{}]}}],"mid":"56c0c430-748b-11e8-ae77-cd19397ca6b0","syncts":1529500243955}
      |""".stripMargin

}
