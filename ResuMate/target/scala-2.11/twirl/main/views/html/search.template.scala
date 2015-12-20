
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
            <li id="About"><a class="headerlink" href="/about">About</a></li>
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
                  DATE: Sun Dec 20 11:10:38 EST 2015
                  SOURCE: /Users/MichaelAWYu/Documents/UnloadingYard/WorldKing/ResuMate/app/views/search.scala.html
                  HASH: 1505b38c883f480d40e8f587cf8ebcd9cbd09225
                  MATRIX: 789->1|984->100|1012->102|1191->255|1205->261|1269->304|1367->375|1382->381|1439->417|1776->727|1801->743|1841->745|1882->758|2079->937|2092->942|2131->943|2172->956|2249->1006|2278->1014|2411->1116|2447->1125|2569->1220|2584->1226|2643->1264|2984->1578|3017->1595|3056->1596|3097->1609|3311->1796|3321->1797|3357->1812|3386->1813|3478->1878|3488->1879|3525->1895|3554->1896|3659->1974|3669->1975|3701->1986|3771->2029|3781->2030|3810->2038|3901->2098|3937->2107|4072->2215|4105->2232|4145->2234|4190->2251|4288->2322|4298->2323|4330->2334|4431->2408|4441->2409|4477->2424|4548->2464|4584->2473
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|43->12|43->12|43->12|48->17|48->17|48->17|49->18|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24|59->28|59->28|59->28|70->39|70->39|70->39|71->40|74->43|74->43|74->43|74->43|76->45|76->45|76->45|76->45|78->47|78->47|78->47|79->48|79->48|79->48|82->51|83->52|87->56|87->56|87->56|88->57|89->58|89->58|89->58|90->59|90->59|90->59|92->61|93->62
                  -- GENERATED --
              */
          