
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

class resumelist extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[Boolean,String,List[ResumeList],String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginStatus: Boolean)(username: String)(allList: List[ResumeList])(Location: String)(upperCategoryName: String)(iconLocation: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.136*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Resumate: Resume List</title>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*8.51*/routes/*8.57*/.Assets.versioned("stylesheets/resumelist.css")),format.raw/*8.104*/("""">
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
            <img id="icon" src="""),_display_(/*28.33*/iconLocation),format.raw/*28.45*/(""" """),format.raw/*28.46*/("""/>
            <div id="categoryLabel">
                <p id="subtitle">current category</p>
                <p id="title">"""),_display_(/*31.32*/upperCategoryName),format.raw/*31.49*/("""</p>
            </div>
        </div>
        <div id="search">
            <div id="searchbox">
                <form action="/search" method="post">
                    <input id="searchbox" type="text" name="searchparam" maxlength="30"/>
                    <input type="hidden" name="Location" value="""),_display_(/*38.65*/Location),format.raw/*38.73*/(""" """),format.raw/*38.74*/(""">
                    <input id="switch" type="image" src=""""),_display_(/*39.59*/routes/*39.65*/.Assets.versioned("images/searchswitch.png")),format.raw/*39.109*/(""""/>
                </form>
            </div>
        </div>
        <div id="resumepanel">
            """),_display_(/*44.14*/for(p <- allList) yield /*44.31*/{_display_(Seq[Any](format.raw/*44.32*/("""
                """),format.raw/*45.17*/("""<div id="resume">
                    <form action="/viewresume" method="POST">
                        <button id="open"></button>
                        <input type="hidden" name="checked" value="""),_display_(/*48.68*/p/*48.69*/.resumeUniqueID),format.raw/*48.84*/(""" """),format.raw/*48.85*/(""">
                    </form>
                    <img id="preview" src="""),_display_(/*50.44*/p/*50.45*/.previewLocation),format.raw/*50.61*/(""" """),format.raw/*50.62*/("""/>
                    <div id="caption">
                        <p id="resumename">"""),_display_(/*52.45*/p/*52.46*/.resumeName),format.raw/*52.57*/("""</p>
                        <p id="author">☮ """),_display_(/*53.43*/p/*53.44*/.creator),format.raw/*53.52*/("""</p>
                    </div>
                 </div>
            """)))}),format.raw/*56.14*/("""
        """),format.raw/*57.9*/("""</div>
        <!--<h1 id="title">Pick A Resume File to Start</h1>
        <div id="channel">
            """),_display_(/*60.14*/for(p <- allList) yield /*60.31*/ {_display_(Seq[Any](format.raw/*60.33*/("""
                """),format.raw/*61.17*/("""<form action="/viewresume" method="POST">
                    <button>"""),_display_(/*62.30*/p/*62.31*/.resumeName),format.raw/*62.42*/("""</button>
                    <input type="hidden" name="checked" value=""""),_display_(/*63.65*/p/*63.66*/.resumeUniqueID),format.raw/*63.81*/("""">
                </form>
            """)))}),format.raw/*65.14*/("""
        """),format.raw/*66.9*/("""</div>-->
    </div>
</body>
</html>"""))
      }
    }
  }

  def render(loginStatus:Boolean,username:String,allList:List[ResumeList],Location:String,upperCategoryName:String,iconLocation:String): play.twirl.api.HtmlFormat.Appendable = apply(loginStatus)(username)(allList)(Location)(upperCategoryName)(iconLocation)

  def f:((Boolean) => (String) => (List[ResumeList]) => (String) => (String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (loginStatus) => (username) => (allList) => (Location) => (upperCategoryName) => (iconLocation) => apply(loginStatus)(username)(allList)(Location)(upperCategoryName)(iconLocation)

  def ref: this.type = this

}


}

/**/
object resumelist extends resumelist_Scope0.resumelist
              /*
                  -- GENERATED --
                  DATE: Sun Dec 20 11:03:23 EST 2015
                  SOURCE: /Users/MichaelAWYu/Documents/UnloadingYard/WorldKing/ResuMate/app/views/resumelist.scala.html
                  HASH: af135659accc40725982cb16a684c3afa459a405
                  MATRIX: 801->1|1031->135|1059->137|1243->295|1257->301|1325->348|1423->419|1438->425|1495->461|1832->771|1857->787|1897->789|1938->802|2135->981|2148->986|2187->987|2228->1000|2305->1050|2334->1058|2467->1160|2503->1169|2624->1263|2657->1275|2686->1276|2838->1401|2876->1418|3209->1724|3238->1732|3267->1733|3354->1793|3369->1799|3435->1843|3568->1949|3601->1966|3640->1967|3685->1984|3911->2183|3921->2184|3957->2199|3986->2200|4086->2273|4096->2274|4133->2290|4162->2291|4275->2377|4285->2378|4317->2389|4391->2436|4401->2437|4430->2445|4530->2514|4566->2523|4700->2630|4733->2647|4773->2649|4818->2666|4916->2737|4926->2738|4958->2749|5059->2823|5069->2824|5105->2839|5176->2879|5212->2888
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|43->12|43->12|43->12|48->17|48->17|48->17|49->18|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24|59->28|59->28|59->28|62->31|62->31|69->38|69->38|69->38|70->39|70->39|70->39|75->44|75->44|75->44|76->45|79->48|79->48|79->48|79->48|81->50|81->50|81->50|81->50|83->52|83->52|83->52|84->53|84->53|84->53|87->56|88->57|91->60|91->60|91->60|92->61|93->62|93->62|93->62|94->63|94->63|94->63|96->65|97->66
                  -- GENERATED --
              */
          