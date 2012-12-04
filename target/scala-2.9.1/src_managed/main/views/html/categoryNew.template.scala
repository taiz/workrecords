
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.api.templates.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import com.avaje.ebean._
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object categoryNew extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Category],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(cateForm: Form[Category]):play.api.templates.Html = {
        _display_ {import helper._


Seq(format.raw/*1.28*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq(/*5.2*/categoryMain("Category List")/*5.31*/ {_display_(Seq(format.raw/*5.33*/("""
    <h1>Add new item</h1>
    <div id="actions">
   		"""),_display_(Seq(/*8.7*/form(routes.CategoryController.create())/*8.47*/ {_display_(Seq(format.raw/*8.49*/("""
   			"""),_display_(Seq(/*9.8*/inputText(cateForm("name")))),format.raw/*9.35*/("""
   			<input type="submit" value="add">
   		""")))})),format.raw/*11.7*/("""
    </div>
""")))})))}
    }
    
    def render(cateForm:Form[Category]) = apply(cateForm)
    
    def f:((Form[Category]) => play.api.templates.Html) = (cateForm) => apply(cateForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jun 14 20:42:49 JST 2012
                    SOURCE: /Users/miyabetaiji/work/WorkingRecords/app/views/categoryNew.scala.html
                    HASH: 89c8f70955fbcfc9c19287e0ece0d1c99f817a25
                    MATRIX: 769->1|883->27|911->46|942->48|979->77|1013->79|1098->135|1146->175|1180->177|1217->185|1265->212|1343->259
                    LINES: 27->1|31->1|33->4|34->5|34->5|34->5|37->8|37->8|37->8|38->9|38->9|40->11
                    -- GENERATED --
                */
            