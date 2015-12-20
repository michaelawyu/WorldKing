
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
                  DATE: Sun Dec 20 12:29:16 EST 2015
                  SOURCE: /Users/ydrtc/ase_final/WorldKing/WorldKing/ResuMate/app/views/resumelist.scala.html
                  HASH: 9ce164a25745f71300281f33040028f4c785e3aa
                  MATRIX: 801->1|1031->135|1059->137|1243->295|1257->301|1325->348|1423->419|1438->425|1495->461|1839->778|1864->794|1904->796|1945->809|2142->988|2155->993|2194->994|2235->1007|2312->1057|2341->1065|2474->1167|2510->1176|2631->1270|2664->1282|2693->1283|2845->1408|2883->1425|3216->1731|3245->1739|3274->1740|3361->1800|3376->1806|3442->1850|3575->1956|3608->1973|3647->1974|3692->1991|3918->2190|3928->2191|3964->2206|3993->2207|4093->2280|4103->2281|4140->2297|4169->2298|4282->2384|4292->2385|4324->2396|4398->2443|4408->2444|4437->2452|4537->2521|4573->2530|4707->2637|4740->2654|4780->2656|4825->2673|4923->2744|4933->2745|4965->2756|5066->2830|5076->2831|5112->2846|5183->2886|5219->2895
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|43->12|43->12|43->12|48->17|48->17|48->17|49->18|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24|59->28|59->28|59->28|62->31|62->31|69->38|69->38|69->38|70->39|70->39|70->39|75->44|75->44|75->44|76->45|79->48|79->48|79->48|79->48|81->50|81->50|81->50|81->50|83->52|83->52|83->52|84->53|84->53|84->53|87->56|88->57|91->60|91->60|91->60|92->61|93->62|93->62|93->62|94->63|94->63|94->63|96->65|97->66
                  -- GENERATED --
              */
          