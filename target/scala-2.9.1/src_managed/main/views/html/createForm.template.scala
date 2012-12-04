
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
object createForm extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Form[Record],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(recordForm: Form[Record]):play.api.templates.Html = {
        _display_ {import helper._

implicit def /*5.2*/implicitFieldConstructor/*5.26*/ = {{ FieldConstructor(twitterBootstrapInput.render) }};
Seq(format.raw/*1.28*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*5.80*/(""" 

"""),_display_(Seq(/*7.2*/main/*7.6*/ {_display_(Seq(format.raw/*7.8*/("""
    
    <h1>Start recording</h1>
    
    """),_display_(Seq(/*11.6*/form(routes.RecordController.start())/*11.43*/ {_display_(Seq(format.raw/*11.45*/("""

        <fieldset>
            """),_display_(Seq(/*14.14*/select(
                recordForm("category.id"), 
                options(Category.options), 
                '_label -> "Category", '_default -> "-- Choose a category --"
            ))),format.raw/*18.14*/("""
            """),_display_(Seq(/*19.14*/inputText(recordForm("item"), '_label -> "Item"))),format.raw/*19.62*/("""
        </fieldset>
        
        <div class="actions">
            <input type="submit" value="Start" class="btn primary"> or 
            <a href=""""),_display_(Seq(/*24.23*/routes/*24.29*/.RecordController.list())),format.raw/*24.53*/("""" class="btn">Cancel</a> 
        </div>
        
    """)))})),format.raw/*27.6*/("""
    
""")))})),format.raw/*29.2*/("""
"""))}
    }
    
    def render(recordForm:Form[Record]) = apply(recordForm)
    
    def f:((Form[Record]) => play.api.templates.Html) = (recordForm) => apply(recordForm)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 15 15:58:54 JST 2012
                    SOURCE: /Users/miyabetaiji/work/WorkingRecords/app/views/createForm.scala.html
                    HASH: 122602cf2ef263d8aeb8957035c4dbfc9a0d4376
                    MATRIX: 766->1|877->48|909->72|988->27|1016->46|1044->126|1077->130|1088->134|1121->136|1196->181|1242->218|1277->220|1342->254|1551->441|1596->455|1666->503|1851->657|1866->663|1912->687|1998->742|2036->749
                    LINES: 27->1|30->5|30->5|31->1|33->4|34->5|36->7|36->7|36->7|40->11|40->11|40->11|43->14|47->18|48->19|48->19|53->24|53->24|53->24|56->27|58->29
                    -- GENERATED --
                */
            