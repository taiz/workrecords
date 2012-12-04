
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
object list extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template3[Page[Record],String,String,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(currentPage: Page[Record], currentSortBy: String, currentOrder: String):play.api.templates.Html = {
        _display_ {import helper._

def /*5.2*/link/*5.6*/(newPage:Int, newSortBy:String) = {{
    
    var sortBy = currentSortBy
    var order = currentOrder
    
    if(newSortBy != null) {
        sortBy = newSortBy
        if(currentSortBy == newSortBy) {
            if(currentOrder == "asc") {
                order = "desc"
            } else {
                order = "asc"
            }
        } else {
            order = "asc"
        }
    }
    
    // Generate the link
    routes.RecordController.list(newPage, sortBy, order)
    
}};
Seq(format.raw/*1.74*/("""

"""),format.raw/*4.1*/("""
"""),format.raw/*26.2*/("""

"""),_display_(Seq(/*28.2*/main/*28.6*/ {_display_(Seq(format.raw/*28.8*/("""
   	<div id="actions">
   		<a class="btn success" id="add" href=""""),_display_(Seq(/*30.45*/routes/*30.51*/.RecordController.create())),format.raw/*30.77*/("""">Add a new record</a>
   	</div>

	<table class="records">
		<thead>
			<tr class="header">
				<th class="start">Start</th>
				<th class="end">End</th>
				<th class="time">Time</th>
				<th class="category">Category</th>
				<th class="item">Item</th>
				<th class="operation"></th>
			</tr>
		</thead>
		<tbody>
			"""),_display_(Seq(/*45.5*/for(record <- currentPage.getList) yield /*45.39*/ {_display_(Seq(format.raw/*45.41*/("""
			<tr class="record">
				<td>
					"""),_display_(Seq(/*48.7*/record/*48.13*/.startTime.format("yyyy-MM-dd hh:mm"))),format.raw/*48.50*/("""
				</td>
				<td>
				 	"""),_display_(Seq(/*51.8*/if(record.endTime == null)/*51.34*/ {_display_(Seq(format.raw/*51.36*/("""
                		<em>-</em>
	                """)))}/*53.20*/else/*53.25*/{_display_(Seq(format.raw/*53.26*/("""
	                    """),_display_(Seq(/*54.23*/record/*54.29*/.endTime.format("yyyy-MM-dd hh:mm"))),format.raw/*54.64*/("""
	                """)))})),format.raw/*55.19*/("""
				</td>
				<td>
					"""),_display_(Seq(/*58.7*/if(record.endTime == null)/*58.33*/ {_display_(Seq(format.raw/*58.35*/("""
                		<em>-</em>
	                """)))}/*60.20*/else/*60.25*/{_display_(Seq(format.raw/*60.26*/("""
	                    """),_display_(Seq(/*61.23*/record/*61.29*/.elapseTime)),format.raw/*61.40*/(""" (min)
	                """)))})),format.raw/*62.19*/("""
				</td>
				<td>
					"""),_display_(Seq(/*65.7*/record/*65.13*/.category.name)),format.raw/*65.27*/("""
				</td>
				<td>
					"""),_display_(Seq(/*68.7*/record/*68.13*/.item)),format.raw/*68.18*/("""
				</td>
				<td>
					"""),_display_(Seq(/*71.7*/if(record.endTime == null)/*71.33*/ {_display_(Seq(format.raw/*71.35*/("""
						"""),_display_(Seq(/*72.8*/form(routes.RecordController.stop(record.id))/*72.53*/ {_display_(Seq(format.raw/*72.55*/("""
		    				<input class="btn primary" type="submit" value="stop">
		    			""")))})),format.raw/*74.11*/("""
		    		""")))}/*75.11*/else/*75.16*/{_display_(Seq(format.raw/*75.17*/("""
        				<a href=""""),_display_(Seq(/*76.23*/routes/*76.29*/.RecordController.edit(record.id))),format.raw/*76.62*/("""">Edit</a><br />
		    		""")))})),format.raw/*77.10*/("""
				</td>
			</tr>
			""")))})),format.raw/*80.5*/("""
		</tbody>
	</table>

    <div id="pagination" class="pagination">
        <ul>
            """),_display_(Seq(/*86.14*/if(currentPage.hasPrev)/*86.37*/ {_display_(Seq(format.raw/*86.39*/("""
                <li class="prev">
                    <a href=""""),_display_(Seq(/*88.31*/link(currentPage.getPageIndex - 1, null))),format.raw/*88.71*/("""">&larr; Previous</a>
                </li>
            """)))}/*90.15*/else/*90.20*/{_display_(Seq(format.raw/*90.21*/("""
                <li class="prev disabled">
                    <a>&larr; Previous</a>
                </li>
            """)))})),format.raw/*94.14*/("""
            <li class="current">
                <a>Displaying """),_display_(Seq(/*96.32*/currentPage/*96.43*/.getDisplayXtoYofZ(" to "," of "))),format.raw/*96.76*/("""</a>
            </li>
            """),_display_(Seq(/*98.14*/if(currentPage.hasNext)/*98.37*/ {_display_(Seq(format.raw/*98.39*/("""
                <li class="next">
                    <a href=""""),_display_(Seq(/*100.31*/link(currentPage.getPageIndex + 1, null))),format.raw/*100.71*/("""">Next &rarr;</a>
                </li>
            """)))}/*102.15*/else/*102.20*/{_display_(Seq(format.raw/*102.21*/("""
                <li class="next disabled">
                    <a>Next &rarr;</a>
                </li>
            """)))})),format.raw/*106.14*/("""
        </ul>
    </div>
""")))})))}
    }
    
    def render(currentPage:Page[Record],currentSortBy:String,currentOrder:String) = apply(currentPage,currentSortBy,currentOrder)
    
    def f:((Page[Record],String,String) => play.api.templates.Html) = (currentPage,currentSortBy,currentOrder) => apply(currentPage,currentSortBy,currentOrder)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 15 16:09:04 JST 2012
                    SOURCE: /Users/miyabetaiji/work/WorkingRecords/app/views/list.scala.html
                    HASH: 2f907ad6bc68def756c1d4140ae34ac577c226ab
                    MATRIX: 774->1|922->94|933->98|1449->73|1477->92|1505->589|1538->592|1550->596|1584->598|1683->666|1698->672|1746->698|2098->1020|2148->1054|2183->1056|2252->1095|2267->1101|2326->1138|2383->1165|2418->1191|2453->1193|2520->1242|2533->1247|2567->1248|2621->1271|2636->1277|2693->1312|2744->1331|2800->1357|2835->1383|2870->1385|2937->1434|2950->1439|2984->1440|3038->1463|3053->1469|3086->1480|3143->1505|3199->1531|3214->1537|3250->1551|3306->1577|3321->1583|3348->1588|3404->1614|3439->1640|3474->1642|3512->1650|3566->1695|3601->1697|3709->1773|3738->1784|3751->1789|3785->1790|3839->1813|3854->1819|3909->1852|3967->1878|4022->1902|4147->1996|4179->2019|4214->2021|4310->2086|4372->2126|4448->2184|4461->2189|4495->2190|4649->2312|4745->2377|4765->2388|4820->2421|4887->2457|4919->2480|4954->2482|5051->2547|5114->2587|5187->2641|5201->2646|5236->2647|5387->2765
                    LINES: 27->1|30->5|30->5|52->1|54->4|55->26|57->28|57->28|57->28|59->30|59->30|59->30|74->45|74->45|74->45|77->48|77->48|77->48|80->51|80->51|80->51|82->53|82->53|82->53|83->54|83->54|83->54|84->55|87->58|87->58|87->58|89->60|89->60|89->60|90->61|90->61|90->61|91->62|94->65|94->65|94->65|97->68|97->68|97->68|100->71|100->71|100->71|101->72|101->72|101->72|103->74|104->75|104->75|104->75|105->76|105->76|105->76|106->77|109->80|115->86|115->86|115->86|117->88|117->88|119->90|119->90|119->90|123->94|125->96|125->96|125->96|127->98|127->98|127->98|129->100|129->100|131->102|131->102|131->102|135->106
                    -- GENERATED --
                */
            