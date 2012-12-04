// @SOURCE:/Users/miyabetaiji/work/WorkingRecords/conf/routes
// @HASH:2eda242ec2423538ecb5a97eef41a9c756de8a23
// @DATE:Fri Jun 15 16:09:04 JST 2012

import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers {

// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
class ReverseCategoryController {
    


 
// @LINE:29
def _new() = {
   Call("GET", "/categories/new")
}
                                                        
 
// @LINE:31
def delete(id:Long) = {
   Call("POST", "/categories/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                        
 
// @LINE:28
def index() = {
   Call("GET", "/categories")
}
                                                        
 
// @LINE:30
def create() = {
   Call("POST", "/categories/save")
}
                                                        

                      
    
}
                            

// @LINE:24
class ReverseAssets {
    


 
// @LINE:24
def at(file:String) = {
   Call("GET", "/assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                        

                      
    
}
                            

// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseRecordController {
    


 
// @LINE:9
def list(p:Int = 0, s:String = "id", o:String = "asc") = {
   Call("GET", "/records" + queryString(List(if(p == 0) None else Some(implicitly[QueryStringBindable[Int]].unbind("p", p)), if(s == "id") None else Some(implicitly[QueryStringBindable[String]].unbind("s", s)), if(o == "asc") None else Some(implicitly[QueryStringBindable[String]].unbind("o", o)))))
}
                                                        
 
// @LINE:21
def delete(id:Long) = {
   Call("POST", "/records/" + implicitly[PathBindable[Long]].unbind("id", id) + "/delete")
}
                                                        
 
// @LINE:12
def create() = {
   Call("GET", "/records/new")
}
                                                        
 
// @LINE:18
def update(id:Long) = {
   Call("POST", "/records/" + implicitly[PathBindable[Long]].unbind("id", id) + "/update")
}
                                                        
 
// @LINE:6
def index() = {
   Call("GET", "/")
}
                                                        
 
// @LINE:13
def start() = {
   Call("POST", "/records")
}
                                                        
 
// @LINE:17
def edit(id:Long) = {
   Call("GET", "/records/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        
 
// @LINE:14
def stop(id:Long) = {
   Call("POST", "/records/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                                                        

                      
    
}
                            
}
                    


// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
class ReverseCategoryController {
    


 
// @LINE:29
def _new = JavascriptReverseRoute(
   "controllers.CategoryController._new",
   """
      function() {
      return _wA({method:"GET", url:"/categories/new"})
      }
   """
)
                                                        
 
// @LINE:31
def delete = JavascriptReverseRoute(
   "controllers.CategoryController.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"/categories/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                                                        
 
// @LINE:28
def index = JavascriptReverseRoute(
   "controllers.CategoryController.index",
   """
      function() {
      return _wA({method:"GET", url:"/categories"})
      }
   """
)
                                                        
 
// @LINE:30
def create = JavascriptReverseRoute(
   "controllers.CategoryController.create",
   """
      function() {
      return _wA({method:"POST", url:"/categories/save"})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:24
class ReverseAssets {
    


 
// @LINE:24
def at = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"/assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                                                        

                      
    
}
                            

// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseRecordController {
    


 
// @LINE:9
def list = JavascriptReverseRoute(
   "controllers.RecordController.list",
   """
      function(p,s,o) {
      return _wA({method:"GET", url:"/records" + _qS([(p == """ +  implicitly[JavascriptLitteral[Int]].to(0) + """ ? null : (""" + implicitly[QueryStringBindable[Int]].javascriptUnbind + """)("p", p)), (s == """ +  implicitly[JavascriptLitteral[String]].to("id") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("s", s)), (o == """ +  implicitly[JavascriptLitteral[String]].to("asc") + """ ? null : (""" + implicitly[QueryStringBindable[String]].javascriptUnbind + """)("o", o))])})
      }
   """
)
                                                        
 
// @LINE:21
def delete = JavascriptReverseRoute(
   "controllers.RecordController.delete",
   """
      function(id) {
      return _wA({method:"POST", url:"/records/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/delete"})
      }
   """
)
                                                        
 
// @LINE:12
def create = JavascriptReverseRoute(
   "controllers.RecordController.create",
   """
      function() {
      return _wA({method:"GET", url:"/records/new"})
      }
   """
)
                                                        
 
// @LINE:18
def update = JavascriptReverseRoute(
   "controllers.RecordController.update",
   """
      function(id) {
      return _wA({method:"POST", url:"/records/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id) + "/update"})
      }
   """
)
                                                        
 
// @LINE:6
def index = JavascriptReverseRoute(
   "controllers.RecordController.index",
   """
      function() {
      return _wA({method:"GET", url:"/"})
      }
   """
)
                                                        
 
// @LINE:13
def start = JavascriptReverseRoute(
   "controllers.RecordController.start",
   """
      function() {
      return _wA({method:"POST", url:"/records"})
      }
   """
)
                                                        
 
// @LINE:17
def edit = JavascriptReverseRoute(
   "controllers.RecordController.edit",
   """
      function(id) {
      return _wA({method:"GET", url:"/records/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        
 
// @LINE:14
def stop = JavascriptReverseRoute(
   "controllers.RecordController.stop",
   """
      function(id) {
      return _wA({method:"POST", url:"/records/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                                                        

                      
    
}
                            
}
                    


// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
// @LINE:24
// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
package controllers.ref {

// @LINE:31
// @LINE:30
// @LINE:29
// @LINE:28
class ReverseCategoryController {
    


 
// @LINE:29
def _new() = new play.api.mvc.HandlerRef(
   controllers.CategoryController._new(), HandlerDef(this, "controllers.CategoryController", "_new", Seq())
)
                              
 
// @LINE:31
def delete(id:Long) = new play.api.mvc.HandlerRef(
   controllers.CategoryController.delete(id), HandlerDef(this, "controllers.CategoryController", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:28
def index() = new play.api.mvc.HandlerRef(
   controllers.CategoryController.index(), HandlerDef(this, "controllers.CategoryController", "index", Seq())
)
                              
 
// @LINE:30
def create() = new play.api.mvc.HandlerRef(
   controllers.CategoryController.create(), HandlerDef(this, "controllers.CategoryController", "create", Seq())
)
                              

                      
    
}
                            

// @LINE:24
class ReverseAssets {
    


 
// @LINE:24
def at(path:String, file:String) = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]))
)
                              

                      
    
}
                            

// @LINE:21
// @LINE:18
// @LINE:17
// @LINE:14
// @LINE:13
// @LINE:12
// @LINE:9
// @LINE:6
class ReverseRecordController {
    


 
// @LINE:9
def list(p:Int, s:String, o:String) = new play.api.mvc.HandlerRef(
   controllers.RecordController.list(p, s, o), HandlerDef(this, "controllers.RecordController", "list", Seq(classOf[Int], classOf[String], classOf[String]))
)
                              
 
// @LINE:21
def delete(id:Long) = new play.api.mvc.HandlerRef(
   controllers.RecordController.delete(id), HandlerDef(this, "controllers.RecordController", "delete", Seq(classOf[Long]))
)
                              
 
// @LINE:12
def create() = new play.api.mvc.HandlerRef(
   controllers.RecordController.create(), HandlerDef(this, "controllers.RecordController", "create", Seq())
)
                              
 
// @LINE:18
def update(id:Long) = new play.api.mvc.HandlerRef(
   controllers.RecordController.update(id), HandlerDef(this, "controllers.RecordController", "update", Seq(classOf[Long]))
)
                              
 
// @LINE:6
def index() = new play.api.mvc.HandlerRef(
   controllers.RecordController.index(), HandlerDef(this, "controllers.RecordController", "index", Seq())
)
                              
 
// @LINE:13
def start() = new play.api.mvc.HandlerRef(
   controllers.RecordController.start(), HandlerDef(this, "controllers.RecordController", "start", Seq())
)
                              
 
// @LINE:17
def edit(id:Long) = new play.api.mvc.HandlerRef(
   controllers.RecordController.edit(id), HandlerDef(this, "controllers.RecordController", "edit", Seq(classOf[Long]))
)
                              
 
// @LINE:14
def stop(id:Long) = new play.api.mvc.HandlerRef(
   controllers.RecordController.stop(id), HandlerDef(this, "controllers.RecordController", "stop", Seq(classOf[Long]))
)
                              

                      
    
}
                            
}
                    
                