// @SOURCE:/Users/miyabetaiji/work/WorkingRecords/conf/routes
// @HASH:2eda242ec2423538ecb5a97eef41a9c756de8a23
// @DATE:Fri Jun 15 16:09:04 JST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {


// @LINE:6
val controllers_RecordController_index0 = Route("GET", PathPattern(List(StaticPart("/"))))
                    

// @LINE:9
val controllers_RecordController_list1 = Route("GET", PathPattern(List(StaticPart("/records"))))
                    

// @LINE:12
val controllers_RecordController_create2 = Route("GET", PathPattern(List(StaticPart("/records/new"))))
                    

// @LINE:13
val controllers_RecordController_start3 = Route("POST", PathPattern(List(StaticPart("/records"))))
                    

// @LINE:14
val controllers_RecordController_stop4 = Route("POST", PathPattern(List(StaticPart("/records/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:17
val controllers_RecordController_edit5 = Route("GET", PathPattern(List(StaticPart("/records/"),DynamicPart("id", """[^/]+"""))))
                    

// @LINE:18
val controllers_RecordController_update6 = Route("POST", PathPattern(List(StaticPart("/records/"),DynamicPart("id", """[^/]+"""),StaticPart("/update"))))
                    

// @LINE:21
val controllers_RecordController_delete7 = Route("POST", PathPattern(List(StaticPart("/records/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
                    

// @LINE:24
val controllers_Assets_at8 = Route("GET", PathPattern(List(StaticPart("/assets/"),DynamicPart("file", """.+"""))))
                    

// @LINE:28
val controllers_CategoryController_index9 = Route("GET", PathPattern(List(StaticPart("/categories"))))
                    

// @LINE:29
val controllers_CategoryController__new10 = Route("GET", PathPattern(List(StaticPart("/categories/new"))))
                    

// @LINE:30
val controllers_CategoryController_create11 = Route("POST", PathPattern(List(StaticPart("/categories/save"))))
                    

// @LINE:31
val controllers_CategoryController_delete12 = Route("POST", PathPattern(List(StaticPart("/categories/"),DynamicPart("id", """[^/]+"""),StaticPart("/delete"))))
                    
def documentation = List(("""GET""","""/""","""controllers.RecordController.index()"""),("""GET""","""/records""","""controllers.RecordController.list(p:Int ?= 0, s:String ?= "id", o:String ?= "asc")"""),("""GET""","""/records/new""","""controllers.RecordController.create()"""),("""POST""","""/records""","""controllers.RecordController.start()"""),("""POST""","""/records/$id<[^/]+>""","""controllers.RecordController.stop(id:Long)"""),("""GET""","""/records/$id<[^/]+>""","""controllers.RecordController.edit(id:Long)"""),("""POST""","""/records/$id<[^/]+>/update""","""controllers.RecordController.update(id:Long)"""),("""POST""","""/records/$id<[^/]+>/delete""","""controllers.RecordController.delete(id:Long)"""),("""GET""","""/assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""GET""","""/categories""","""controllers.CategoryController.index()"""),("""GET""","""/categories/new""","""controllers.CategoryController._new()"""),("""POST""","""/categories/save""","""controllers.CategoryController.create()"""),("""POST""","""/categories/$id<[^/]+>/delete""","""controllers.CategoryController.delete(id:Long)"""))
             
    
def routes:PartialFunction[RequestHeader,Handler] = {        

// @LINE:6
case controllers_RecordController_index0(params) => {
   call { 
        invokeHandler(_root_.controllers.RecordController.index(), HandlerDef(this, "controllers.RecordController", "index", Nil))
   }
}
                    

// @LINE:9
case controllers_RecordController_list1(params) => {
   call(params.fromQuery[Int]("p", Some(0)), params.fromQuery[String]("s", Some("id")), params.fromQuery[String]("o", Some("asc"))) { (p, s, o) =>
        invokeHandler(_root_.controllers.RecordController.list(p, s, o), HandlerDef(this, "controllers.RecordController", "list", Seq(classOf[Int], classOf[String], classOf[String])))
   }
}
                    

// @LINE:12
case controllers_RecordController_create2(params) => {
   call { 
        invokeHandler(_root_.controllers.RecordController.create(), HandlerDef(this, "controllers.RecordController", "create", Nil))
   }
}
                    

// @LINE:13
case controllers_RecordController_start3(params) => {
   call { 
        invokeHandler(_root_.controllers.RecordController.start(), HandlerDef(this, "controllers.RecordController", "start", Nil))
   }
}
                    

// @LINE:14
case controllers_RecordController_stop4(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.RecordController.stop(id), HandlerDef(this, "controllers.RecordController", "stop", Seq(classOf[Long])))
   }
}
                    

// @LINE:17
case controllers_RecordController_edit5(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.RecordController.edit(id), HandlerDef(this, "controllers.RecordController", "edit", Seq(classOf[Long])))
   }
}
                    

// @LINE:18
case controllers_RecordController_update6(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.RecordController.update(id), HandlerDef(this, "controllers.RecordController", "update", Seq(classOf[Long])))
   }
}
                    

// @LINE:21
case controllers_RecordController_delete7(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.RecordController.delete(id), HandlerDef(this, "controllers.RecordController", "delete", Seq(classOf[Long])))
   }
}
                    

// @LINE:24
case controllers_Assets_at8(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(_root_.controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String])))
   }
}
                    

// @LINE:28
case controllers_CategoryController_index9(params) => {
   call { 
        invokeHandler(_root_.controllers.CategoryController.index(), HandlerDef(this, "controllers.CategoryController", "index", Nil))
   }
}
                    

// @LINE:29
case controllers_CategoryController__new10(params) => {
   call { 
        invokeHandler(_root_.controllers.CategoryController._new(), HandlerDef(this, "controllers.CategoryController", "_new", Nil))
   }
}
                    

// @LINE:30
case controllers_CategoryController_create11(params) => {
   call { 
        invokeHandler(_root_.controllers.CategoryController.create(), HandlerDef(this, "controllers.CategoryController", "create", Nil))
   }
}
                    

// @LINE:31
case controllers_CategoryController_delete12(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        invokeHandler(_root_.controllers.CategoryController.delete(id), HandlerDef(this, "controllers.CategoryController", "delete", Seq(classOf[Long])))
   }
}
                    
}
    
}
                