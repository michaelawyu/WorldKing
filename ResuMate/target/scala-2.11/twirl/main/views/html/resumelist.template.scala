
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object resumelist_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class resumelist extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[ResumeList],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(allList: List[ResumeList]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.29*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Resumate: Resume List</title>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*8.51*/routes/*8.57*/.Assets.versioned("stylesheets/resumelist.css")),format.raw/*8.104*/("""">
</head>
<body>
    <div id="header">
        <img src=""""),_display_(/*12.20*/routes/*12.26*/.Assets.versioned("images/logo.png")),format.raw/*12.62*/("""" class="logo" alt="Resumate">
        <ul>
            <li id="Discover"><a class="headerlink" href="/jobcategory">Discover</a></li>
            <li id="Create"><a class="headerlink" href="/genRes">Create</a></li>
            <li id="About"><a class="headerlink" href="/about">About</a></li>
        </ul>
    </div>
    <div id="body">
        <h1 id="title">Pick A Resume File to Start</h1>
        <div id="channel">
            """),_display_(/*22.14*/for(p <- allList) yield /*22.31*/ {_display_(Seq[Any](format.raw/*22.33*/("""
                """),format.raw/*23.17*/("""<form action="/viewresume" method="POST">
                    <button>"""),_display_(/*24.30*/p/*24.31*/.resumeName),format.raw/*24.42*/("""</button>
                    <input type="hidden" name="checked" value=""""),_display_(/*25.65*/p/*25.66*/.resumeUniqueID),format.raw/*25.81*/("""">
                </form>
            """)))}),format.raw/*27.14*/("""
        """),format.raw/*28.9*/("""</div>
    </div>
</body>
</html>"""))
      }
    }
  }

  def render(allList:List[ResumeList]): play.twirl.api.HtmlFormat.Appendable = apply(allList)

  def f:((List[ResumeList]) => play.twirl.api.HtmlFormat.Appendable) = (allList) => apply(allList)

  def ref: this.type = this

}


}

/**/
object resumelist extends resumelist_Scope0.resumelist
              /*
                  -- GENERATED --
                  DATE: Mon Nov 16 17:21:58 EST 2015
                  SOURCE: /Users/MichaelAWYu/Documents/UnloadingYard/WorldKing/ResuMate/app/views/resumelist.scala.html
                  HASH: 0a18f22490d88394d2a2098035b2c52f962b119f
                  MATRIX: 765->1|887->28|915->30|1099->188|1113->194|1181->241|1267->300|1282->306|1339->342|1800->776|1833->793|1873->795|1918->812|2016->883|2026->884|2058->895|2159->969|2169->970|2205->985|2276->1025|2312->1034
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|43->12|43->12|43->12|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|56->25|56->25|58->27|59->28
                  -- GENERATED --
              */
          