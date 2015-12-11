
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

class jobcategory extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Boolean,String,List[JobCategory],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginStatus: Boolean)(username: String)(allList: List[JobCategory]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.70*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Resumate: Job Category</title>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*8.51*/routes/*8.57*/.Assets.versioned("stylesheets/jobcategory.css")),format.raw/*8.105*/("""">
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
        <h1 id="title">Pick A Job Category to Start</h1>
        <div id="channel">
            """),_display_(/*29.14*/for(p <- allList) yield /*29.31*/ {_display_(Seq[Any](format.raw/*29.33*/("""
                """),format.raw/*30.17*/("""<form action="/resumelist" method="POST">
                    <button>"""),_display_(/*31.30*/p/*31.31*/.jobCategoryName),format.raw/*31.47*/("""</button>
                    <input type="hidden" name="checked" value=""""),_display_(/*32.65*/p/*32.66*/.jobCategoryID),format.raw/*32.80*/("""">
                </form>
            """)))}),format.raw/*34.14*/("""
        """),format.raw/*35.9*/("""</div>
    </div>
</body>
</html>"""))
      }
    }
  }

  def render(loginStatus:Boolean,username:String,allList:List[JobCategory]): play.twirl.api.HtmlFormat.Appendable = apply(loginStatus)(username)(allList)

  def f:((Boolean) => (String) => (List[JobCategory]) => play.twirl.api.HtmlFormat.Appendable) = (loginStatus) => (username) => (allList) => apply(loginStatus)(username)(allList)

  def ref: this.type = this

}


}

/**/
object jobcategory extends jobcategory_Scope0.jobcategory
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 19:30:36 EST 2015
                  SOURCE: /Users/MichaelAWYu/Documents/UnloadingYard/WorldKing/ResuMate/app/views/jobcategory.scala.html
                  HASH: e598be966a4315030bc19d3748a70f1d06dfb37b
                  MATRIX: 783->1|946->69|974->71|1159->230|1173->236|1242->284|1340->355|1355->361|1412->397|1749->707|1774->723|1814->725|1855->738|2052->917|2065->922|2104->923|2145->936|2222->986|2251->994|2384->1096|2420->1105|2581->1239|2614->1256|2654->1258|2699->1275|2797->1346|2807->1347|2844->1363|2945->1437|2955->1438|2990->1452|3061->1492|3097->1501
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|43->12|43->12|43->12|48->17|48->17|48->17|49->18|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24|60->29|60->29|60->29|61->30|62->31|62->31|62->31|63->32|63->32|63->32|65->34|66->35
                  -- GENERATED --
              */
          