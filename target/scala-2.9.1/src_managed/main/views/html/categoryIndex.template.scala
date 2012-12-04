
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
object categoryIndex extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[List[Category],play.api.templates.Html] {

    /**/
    def apply/*1.2*/(categories: List[Category]):play.api.templates.Html = {
        _display_ {import helper._


Seq(format.raw/*1.30*/("""

"""),format.raw/*4.1*/("""
"""),_display_(Seq(/*5.2*/categoryMain("Category List")/*5.31*/ {_display_(Seq(format.raw/*5.33*/("""
    <h1>"""),_display_(Seq(/*6.10*/categories/*6.20*/.size())),format.raw/*6.27*/(""" item(s)</h1>
    <table>
    	<tr>
	    	<th>category</th>
    		<th></th>
    	</tr>
	    """),_display_(Seq(/*12.7*/for(category <- categories) yield /*12.34*/ {_display_(Seq(format.raw/*12.36*/("""
	    <tr>
	    	<td>
	    		"""),_display_(Seq(/*15.9*/category/*15.17*/.name)),format.raw/*15.22*/("""
	    	</td>
	    	<td>
	    		"""),_display_(Seq(/*18.9*/form(routes.CategoryController.delete(category.id))/*18.60*/ {_display_(Seq(format.raw/*18.62*/("""
	    			<input type="submit" value="delete">
	    		""")))})),format.raw/*20.9*/("""
	    	</td>
	    </tr>
	    """)))})),format.raw/*23.7*/("""
    </table>
    <div>
    	<a href=""""),_display_(Seq(/*26.16*/routes/*26.22*/.CategoryController._new())),format.raw/*26.48*/("""">New</a> 
    </div>
""")))})))}
    }
    
    def render(categories:List[Category]) = apply(categories)
    
    def f:((List[Category]) => play.api.templates.Html) = (categories) => apply(categories)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Thu Jun 14 20:27:39 JST 2012
                    SOURCE: /Users/miyabetaiji/work/WorkingRecords/app/views/categoryIndex.scala.html
                    HASH: 9231755812be1e41cfaa7cb01788148727ad1de3
                    MATRIX: 771->1|887->29|915->48|946->50|983->79|1017->81|1057->91|1075->101|1103->108|1226->201|1269->228|1304->230|1364->260|1381->268|1408->273|1470->305|1530->356|1565->358|1650->412|1711->442|1781->481|1796->487|1844->513
                    LINES: 27->1|31->1|33->4|34->5|34->5|34->5|35->6|35->6|35->6|41->12|41->12|41->12|44->15|44->15|44->15|47->18|47->18|47->18|49->20|52->23|55->26|55->26|55->26
                    -- GENERATED --
                */
            