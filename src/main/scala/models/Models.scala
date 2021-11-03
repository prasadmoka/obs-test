package models

import java.util

  case class ActorObj(id:String,`type`:String)
  case class PDataObj(id:String,ver:String,pid:String)
  case class ContextObj(channel:String,pdata:PDataObj,env:String,sid:String,did:String,cdata:util.ArrayList[CDataObj],rollup:RollUp,uid:String)
  case class EDataObj(id:String,`type`:String,pageid:String,level:String,message:String)
  //case class EDataObj(id:String,`type`:String,pageid:String)
  case class RollUp(l1:String)
  case class CDataObj(id:String,`type`:String)
  case class EventObj(eid:String,ets:Long,ver:String,mid:String, actor:ActorObj,context:ContextObj,`object`:Any,tags:util.ArrayList[String],edata:EDataObj)




