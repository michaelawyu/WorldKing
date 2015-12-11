
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

class resumelist extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Boolean,String,List[ResumeList],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginStatus: Boolean)(username: String)(allList: List[ResumeList]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.69*/("""

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
        <h1 id="title">Pick A Resume File to Start</h1>
        <div id="channel">
            """),_display_(/*29.14*/for(p <- allList) yield /*29.31*/ {_display_(Seq[Any](format.raw/*29.33*/("""
                """),format.raw/*30.17*/("""<form action="/viewresume" method="POST">
                    <button>"""),_display_(/*31.30*/p/*31.31*/.resumeName),format.raw/*31.42*/("""</button>
                    <input type="hidden" name="checked" value=""""),_display_(/*32.65*/p/*32.66*/.resumeUniqueID),format.raw/*32.81*/("""">
                </form>
            """)))}),format.raw/*34.14*/("""
        """),format.raw/*35.9*/("""</div>
    </div>
</body>
</html>"""))
      }
    }
  }

  def render(loginStatus:Boolean,username:String,allList:List[ResumeList]): play.twirl.api.HtmlFormat.Appendable = apply(loginStatus)(username)(allList)

  def f:((Boolean) => (String) => (List[ResumeList]) => play.twirl.api.HtmlFormat.Appendable) = (loginStatus) => (username) => (allList) => apply(loginStatus)(username)(allList)

  def ref: this.type = this

}


}

/**/
object resumelist extends resumelist_Scope0.resumelist
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 19:37:12 EST 2015
                  SOURCE: /Users/MichaelAWYu/Documents/UnloadingYard/WorldKing/ResuMate/app/views/resumelist.scala.html
                  HASH: 3ec1307c9e39a5ea9fab43ad9e7921ee79db0699
                  MATRIX: 780->1|942->68|970->70|1154->228|1168->234|1236->281|1334->352|1349->358|1406->394|1743->704|1768->720|1808->722|1849->735|2046->914|2059->919|2098->920|2139->933|2216->983|2245->991|2378->1093|2414->1102|2574->1235|2607->1252|2647->1254|2692->1271|2790->1342|2800->1343|2832->1354|2933->1428|2943->1429|2979->1444|3050->1484|3086->1493
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|43->12|43->12|43->12|48->17|48->17|48->17|49->18|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|63->32|63->32|65->34|66->35
                  -- GENERATED --
              */
          