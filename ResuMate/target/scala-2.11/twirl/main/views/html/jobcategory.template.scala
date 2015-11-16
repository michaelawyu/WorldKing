
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object jobcategory_Scope0 {
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

class jobcategory extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[List[JobCategory],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(allList: List[JobCategory]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.30*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Resumate: Job Category</title>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*8.51*/routes/*8.57*/.Assets.versioned("stylesheets/jobcategory.css")),format.raw/*8.105*/("""">
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
        <h1 id="title">Pick A Job Category to Start</h1>
        <div id="channel">
            """),_display_(/*22.14*/for(p <- allList) yield /*22.31*/ {_display_(Seq[Any](format.raw/*22.33*/("""
                """),format.raw/*23.17*/("""<form action="/resumelist" method="POST">
                    <button>"""),_display_(/*24.30*/p/*24.31*/.jobCategoryName),format.raw/*24.47*/("""</button>
                    <input type="hidden" name="checked" value=""""),_display_(/*25.65*/p/*25.66*/.jobCategoryID),format.raw/*25.80*/("""">
                </form>
            """)))}),format.raw/*27.14*/("""
        """),format.raw/*28.9*/("""</div>
    </div>
</body>
</html>"""))
      }
    }
  }

  def render(allList:List[JobCategory]): play.twirl.api.HtmlFormat.Appendable = apply(allList)

  def f:((List[JobCategory]) => play.twirl.api.HtmlFormat.Appendable) = (allList) => apply(allList)

  def ref: this.type = this

}


}

/**/
object jobcategory extends jobcategory_Scope0.jobcategory
              /*
                  -- GENERATED --
                  DATE: Mon Nov 16 17:21:58 EST 2015
                  SOURCE: /Users/MichaelAWYu/Documents/UnloadingYard/WorldKing/ResuMate/app/views/jobcategory.scala.html
                  HASH: d012d7043ab910a3dc887c09e3ca445d54cba3e0
                  MATRIX: 768->1|891->29|919->31|1104->190|1118->196|1187->244|1273->303|1288->309|1345->345|1807->780|1840->797|1880->799|1925->816|2023->887|2033->888|2070->904|2171->978|2181->979|2216->993|2287->1033|2323->1042
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|43->12|43->12|43->12|53->22|53->22|53->22|54->23|55->24|55->24|55->24|56->25|56->25|56->25|58->27|59->28
                  -- GENERATED --
              */
          