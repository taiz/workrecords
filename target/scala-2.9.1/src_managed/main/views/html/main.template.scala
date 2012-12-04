
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
object main extends BaseScalaTemplate[play.api.templates.Html,Format[play.api.templates.Html]](play.api.templates.HtmlFormat) with play.api.templates.Template1[Html,play.api.templates.Html] {

    /**/
    def apply/*1.2*/(content: Html):play.api.templates.Html = {
        _display_ {

Seq(format.raw/*1.17*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>Play! Framework sample applicatoin</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq(/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        <link rel="stylesheet" type="text/css" media="screen" href=""""),_display_(Seq(/*9.70*/routes/*9.76*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*9.119*/("""">
        <script src=""""),_display_(Seq(/*10.23*/routes/*10.29*/.Assets.at("javascripts/jquery-1.7.1.min.js"))),format.raw/*10.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        <header class="topbar">
            <h1 class="fill">
                <a href=""""),_display_(Seq(/*15.27*/routes/*15.33*/.RecordController.index())),format.raw/*15.58*/("""">
                    Play! sample application &mdash; Work Records
                </a>
            </h1>
        </header>
        
        <section id="main">
            """),_display_(Seq(/*22.14*/content)),format.raw/*22.21*/("""
        </section>
    </body>
</html>
"""))}
    }
    
    def render(content:Html) = apply(content)
    
    def f:((Html) => play.api.templates.Html) = (content) => apply(content)
    
    def ref = this

}
                /*
                    -- GENERATED --
                    DATE: Fri Jun 15 16:13:02 JST 2012
                    SOURCE: /Users/miyabetaiji/work/WorkingRecords/app/views/main.scala.html
                    HASH: 1a86b9c7b8c4228cab338f40661ccd40e892b96f
                    MATRIX: 752->1|839->16|1017->164|1031->170|1086->204|1188->276|1202->282|1267->325|1323->350|1338->356|1405->401|1582->547|1597->553|1644->578|1851->754|1880->761
                    LINES: 27->1|30->1|37->8|37->8|37->8|38->9|38->9|38->9|39->10|39->10|39->10|44->15|44->15|44->15|51->22|51->22
                    -- GENERATED --
                */
            