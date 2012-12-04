
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
object editForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template2[Long,Form[Record],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(id: Long, recordForm: Form[Record]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq(format.raw/*1.38*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq(/*7.2*/main/*7.6*/ {_display_(Seq(format.raw/*7.8*/("""
    
    <h1>Edit Record</h1>
    
    """),_display_(Seq(/*11.6*/form(routes.RecordController.update(id))/*11.46*/ {_display_(Seq(format.raw/*11.48*/("""

        <fieldset>
        	"""),_display_(Seq(/*14.11*/inputDate(recordForm("startTime"), '_label -> "Start Time"))),format.raw/*14.70*/("""
        	"""),_display_(Seq(/*15.11*/inputDate(recordForm("endTime"), '_label -> "End Time"))),format.raw/*15.66*/("""
            """),_display_(Seq(/*16.14*/select(
                recordForm("category.id"), 
                options(Category.options), 
                '_label -> "Category", '_default -> "-- Choose a category --"
            ))),format.raw/*20.14*/("""
            """),_display_(Seq(/*21.14*/inputText(recordForm("item"), '_label -> "Item"))),format.raw/*21.62*/("""
        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Save record" class="btn primary"> or 
            <a href=""""),_display_(Seq(/*26.23*/routes/*26.29*/.RecordController.list())),format.raw/*26.53*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*29.6*/("""
    
    """),_display_(Seq(/*31.6*/form(routes.RecordController.delete(id), 'class -> "topRight")/*31.68*/ {_display_(Seq(format.raw/*31.70*/("""
        <input type="submit" value="Delete this record" class="btn danger">
    """)))})),format.raw/*33.6*/("""
""")))})),format.raw/*34.2*/("""
"""))}
    }
    
    def render(id:Long,recordForm:Form[Record]) = apply(id,recordForm)
    
    def f:((Long,Form[Record]) => play.api.templates.Html) = (id,recordForm) => apply(id,recordForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 15 15:55:21 JST 2012
                    SOURCE: /Users/miyabetaiji/work/WorkingRecords/app/views/editForm.scala.html
                    HASH: 98df0880729831b004cf9ba5dc60de6c922a0789
                    MATRIX: 769->1|890->58|922->82|1001->37|1029->56|1057->136|1090->140|1101->144|1134->146|1205->187|1254->227|1289->229|1351->260|1432->319|1474->330|1551->385|1596->399|1805->586|1850->600|1920->648|2111->808|2126->814|2172->838|2258->893|2299->904|2370->966|2405->968|2518->1050|2551->1052
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|36->7|36->7|36->7|40->11|40->11|40->11|43->14|43->14|44->15|44->15|45->16|49->20|50->21|50->21|55->26|55->26|55->26|58->29|60->31|60->31|60->31|62->33|63->34
                    -- GENERATED --
                */
            