
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object search_Scope0 {
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

class search extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Boolean,String,List[ResumeList],List[ResumeList],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginStatus: Boolean)(username: String)(categoryList: List[ResumeList])(allList: List[ResumeList]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.101*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Resumate: Search</title>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*8.51*/routes/*8.57*/.Assets.versioned("stylesheets/search.css")),format.raw/*8.100*/("""">
</head>
<body>
    <div id="header">
        <a href="/"><img src=""""),_display_(/*12.32*/routes/*12.38*/.Assets.versioned("images/logo.png")),format.raw/*12.74*/("""" class="logo" alt="Resumate"></a>
        <ul>
            <li id="Discover"><a class="headerlink" href="/jobcategory">Discover</a></li>
            <li id="Create"><a class="headerlink" href="/genRes">Create</a></li>
            <!--<li id="About"><a class="headerlink" href="/about">About</a></li>-->
            """),_display_(/*17.14*/if(!loginStatus)/*17.30*/ {_display_(Seq[Any](format.raw/*17.32*/("""
            """),format.raw/*18.13*/("""<li id="Login"><a class="headerlink" href="/login">Login</a></li>
            <li id="Registration"><a class="headerlink" href="/registration">Registration</a></li>
            """)))}/*20.15*/else/*20.20*/{_display_(Seq[Any](format.raw/*20.21*/("""
            """),format.raw/*21.13*/("""<li id="Username"><a class="headerlink" href="/">"""),_display_(/*21.63*/username),format.raw/*21.71*/("""</a></li>
            <li id="Logoff"><a class="headerlink" href="/off">Log Off</a></li>
            """)))}),format.raw/*23.14*/("""
        """),format.raw/*24.9*/("""</ul>
    </div>
    <div id="body">
        <div id="theme">
            <img id="icon" src=""""),_display_(/*28.34*/routes/*28.40*/.Assets.versioned("images/search.png")),format.raw/*28.78*/(""""/>
            <div id="categoryLabel">
                <p id="subtitle">current category</p>
                <p id="title">SEARCH RESULT</p>
            </div>
        </div>

        <div id="searchlabela">
            <p id="searchlabela">Global</p>
        </div>
        <div id="searchpanela">
            """),_display_(/*39.14*/for(p <- allList) yield /*39.31*/{_display_(Seq[Any](format.raw/*39.32*/("""
            """),format.raw/*40.13*/("""<div id="resume">
                <form action="/viewresume" method="POST">
                    <button id="open"></button>
                    <input type="hidden" name="checked" value="""),_display_(/*43.64*/p/*43.65*/.resumeUniqueID),format.raw/*43.80*/(""" """),format.raw/*43.81*/(""">
                </form>
                <img id="preview" src="""),_display_(/*45.40*/p/*45.41*/.previewLocation),format.raw/*45.57*/(""" """),format.raw/*45.58*/("""/>
                <div id="caption">
                    <p id="resumename">"""),_display_(/*47.41*/p/*47.42*/.resumeName),format.raw/*47.53*/("""</p>
                    <p id="author">☮ """),_display_(/*48.39*/p/*48.40*/.creator),format.raw/*48.48*/("""</p>
                </div>
            </div>
            """)))}),format.raw/*51.14*/("""
        """),format.raw/*52.9*/("""</div>

        <!--<h1 id="title">Pick A Resume File to Start</h1>
        <div id="channel">
            """),_display_(/*56.14*/for(p <- allList) yield /*56.31*/ {_display_(Seq[Any](format.raw/*56.33*/("""
                """),format.raw/*57.17*/("""<form action="/viewresume" method="POST">
                    <button>"""),_display_(/*58.30*/p/*58.31*/.resumeName),format.raw/*58.42*/("""</button>
                    <input type="hidden" name="checked" value=""""),_display_(/*59.65*/p/*59.66*/.resumeUniqueID),format.raw/*59.81*/("""">
                </form>
            """)))}),format.raw/*61.14*/("""
        """),format.raw/*62.9*/("""</div>-->
    </div>
</body>
</html>"""))
      }
    }
  }

  def render(loginStatus:Boolean,username:String,categoryList:List[ResumeList],allList:List[ResumeList]): play.twirl.api.HtmlFormat.Appendable = apply(loginStatus)(username)(categoryList)(allList)

  def f:((Boolean) => (String) => (List[ResumeList]) => (List[ResumeList]) => play.twirl.api.HtmlFormat.Appendable) = (loginStatus) => (username) => (categoryList) => (allList) => apply(loginStatus)(username)(categoryList)(allList)

  def ref: this.type = this

}


}

/**/
object search extends search_Scope0.search
              /*
                  -- GENERATED --
                  DATE: Sun Dec 20 12:29:16 EST 2015
                  SOURCE: /Users/ydrtc/ase_final/WorldKing/WorldKing/ResuMate/app/views/search.scala.html
                  HASH: aeeab4bef81359956bd8f501d21ca2e6399d0bf9
                  MATRIX: 789->1|984->100|1012->102|1191->255|1205->261|1269->304|1367->375|1382->381|1439->417|1783->734|1808->750|1848->752|1889->765|2086->944|2099->949|2138->950|2179->963|2256->1013|2285->1021|2418->1123|2454->1132|2576->1227|2591->1233|2650->1271|2991->1585|3024->1602|3063->1603|3104->1616|3318->1803|3328->1804|3364->1819|3393->1820|3485->1885|3495->1886|3532->1902|3561->1903|3666->1981|3676->1982|3708->1993|3778->2036|3788->2037|3817->2045|3908->2105|3944->2114|4079->2222|4112->2239|4152->2241|4197->2258|4295->2329|4305->2330|4337->2341|4438->2415|4448->2416|4484->2431|4555->2471|4591->2480
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|43->12|43->12|43->12|48->17|48->17|48->17|49->18|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24|59->28|59->28|59->28|70->39|70->39|70->39|71->40|74->43|74->43|74->43|74->43|76->45|76->45|76->45|76->45|78->47|78->47|78->47|79->48|79->48|79->48|82->51|83->52|87->56|87->56|87->56|88->57|89->58|89->58|89->58|90->59|90->59|90->59|92->61|93->62
                  -- GENERATED --
              */
          