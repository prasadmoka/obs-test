package job

object BatchData {

  val LOG_EVENT: String =
    """
      |{"id":"test.event","ver":"3.0","ets":1529500243591,"params":{"msgid":"3fc11963-04e7-4251-83de-18e0dbb5a684",
      |"requesterId":"","did":"a3e487025d29f5b2cd599a8817ac16b8f3776a63","key":""},"events":[{"eid":"LOG","ets":1529499971358,
      |"ver":"3.0","mid":"LOG:5f3c177f90bd5833deade577cc28cbb6","actor":{"id":"159e93d1-da0c-4231-be94-e75b0c226d7c",
      |"type":"user"},"context":{"channel":"b00bc992ef25f1a9a8d63291e20efc8d","pdata":{"id":"local.sunbird.portal",
      |"ver":"0.0.1"},"env":"content-service","sid":"PCNHgbKZvh6Yis8F7BxiaJ1EGw0N3L9B","did":"cab2a0b55c79d12c8f0575d6397e5678",
      |"cdata":[],"rollup":{"l1":"ORG_001","l2":"0123673542904299520","l3":"0123673689120112640",
      |"l4":"b00bc992ef25f1a9a8d63291e20efc8d"}},"object":{},"tags":["b00bc992ef25f1a9a8d63291e20efc8d"],
      |"edata":{"type":"api_access","level":"INFO","message":"","params":[{"url":"/content/composite/v1/search"},
      |{"protocol":"https"},{"method":"POST"},{}]}}],"mid":"56c0c430-748b-11e8-ae77-cd19397ca6b0","syncts":1529500243955}
      |""".stripMargin

  val OUT_EVENT: String =
    """{"id":"api.sunbird.telemetry","ver":"3.0","params":{"msgid":"bb952b6c2c04389127621801020ff7d2"},
      |"ets":1634804015457,"events":[{"eid":"INTERACT","ets":1634804015446,"ver":"3.0",
      |"mid":"INTERACT:06e0edd5d6b0e5a19d2ef7fbbf42de45","actor":{"id":"f0f164da-5b4c-4e1c-8360-082e8f1211bc","type":"User"},
      |"context":{"channel":"0126796199493140480","pdata":{"id":"staging.sunbird.portal","ver":"4.4.0","pid":"sunbird-portal"},
      |"env":"home","sid":"7JnMr6Kymlvf2re6_0iMiMgegFCkr2i9","did":"22c369fe3830c9dc4bfc3e9dafebb22c",
      |"cdata":[{"id":"7JnMr6Kymlvf2re6_0iMiMgegFCkr2i9","type":"UserSession"},{"id":"Desktop","type":"Device"},
      |{"id":"default","type":"Theme"}],"rollup":{"l1":"0126796199493140480"},"uid":"f0f164da-5b4c-4e1c-8360-082e8f1211bc"},
      |"object":{},"tags":["0126796199493140480"],"edata":{"id":"logout","type":"click",
      |"pageid":"resources?board=State%20(Karnataka)&gradeLevel=Class%204&medium=English&id=ka_k-12&selectedTab=home"}}],
      |"did":"22c369fe3830c9dc4bfc3e9dafebb22c","channel":"0126796199493140480","pid":"staging.sunbird.portal",
      |"mid":"caa54110-3246-11ec-886a-6d52956d430b","syncts":1634804017057}""".stripMargin

  val OUT_LOG_EVENT: String =
    """{"id":"api.sunbird.telemetry","ver":"3.0","params":{"msgid":"bb952b6c2c04389127621801020ff7d2"},
      |"ets":1634804015457,"events":[{"eid":"INTERACT","ets":1634804015446,"ver":"3.0",
      |"mid":"INTERACT:06e0edd5d6b0e5a19d2ef7fbbf42de45","actor":{"id":"f0f164da-5b4c-4e1c-8360-082e8f1211bc","type":"User"},
      |"context":{"channel":"0126796199493140480","pdata":{"id":"staging.sunbird.portal","ver":"4.4.0","pid":"sunbird-portal"},
      |"env":"home","sid":"7JnMr6Kymlvf2re6_0iMiMgegFCkr2i9","did":"22c369fe3830c9dc4bfc3e9dafebb22c",
      |"cdata":[{"id":"7JnMr6Kymlvf2re6_0iMiMgegFCkr2i9","type":"UserSession"},{"id":"Desktop","type":"Device"},
      |{"id":"default","type":"Theme"}],"rollup":{"l1":"0126796199493140480"},"uid":"f0f164da-5b4c-4e1c-8360-082e8f1211bc"},
      |"object":{},"tags":["0126796199493140480"],"edata":{"id":"logout","type":"click",
      |"pageid":"resources?board=State%20(Karnataka)&gradeLevel=Class%204&medium=English&id=ka_k-12&selectedTab=home"}},{"eid":"LOG","ets":1529499971358,
      |"ver":"3.0","mid":"LOG:5f3c177f90bd5833deade577cc28cbb6","actor":{"id":"159e93d1-da0c-4231-be94-e75b0c226d7c",
      |"type":"user"},"context":{"channel":"b00bc992ef25f1a9a8d63291e20efc8d","pdata":{"id":"local.sunbird.portal",
      |"ver":"0.0.1"},"env":"content-service","sid":"PCNHgbKZvh6Yis8F7BxiaJ1EGw0N3L9B","did":"cab2a0b55c79d12c8f0575d6397e5678",
      |"cdata":[],"rollup":{"l1":"ORG_001","l2":"0123673542904299520","l3":"0123673689120112640",
      |"l4":"b00bc992ef25f1a9a8d63291e20efc8d"}},"object":{},"tags":["b00bc992ef25f1a9a8d63291e20efc8d"],
      |"edata":{"type":"api_access","level":"INFO","message":"","params":[{"url":"/content/composite/v1/search"},
      |{"protocol":"https"},{"method":"POST"},{}]}}],
      |"did":"22c369fe3830c9dc4bfc3e9dafebb22c","channel":"0126796199493140480","pid":"staging.sunbird.portal",
      |"mid":"caa54110-3246-11ec-886a-6d52956d430b","syncts":1634804017057}""".stripMargin

  val NO_EVENTS: String =
    """
      |{"id":"test.event","ver":"3.0","ets":1529500243591,"params":{"msgid":"3fc11963-04e7-4251-83de-18e0dbb5a684",
      |"requesterId":"","did":"a3e487025d29f5b2cd599a8817ac16b8f3776a63","key":""},
      |"mid":"56c0c430-748b-11e8-ae77-cd19397ca6b0","syncts":1529500243955}
      |""".stripMargin

}
