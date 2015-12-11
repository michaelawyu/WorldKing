
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object viewresume_Scope0 {
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

class viewresume extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template5[Boolean,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginStatus: Boolean)(username: String)(filename: String)(resumeID: String)(commentContent: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.102*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Resumate: Job Category</title>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*8.51*/routes/*8.57*/.Assets.versioned("stylesheets/viewresume.css")),format.raw/*8.104*/("""">
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
    <div id="leftbody">
        <iframe id="PDF" style="border:0px solid #666CCC" title="PDF" src="""),_display_(/*27.76*/filename),format.raw/*27.84*/(""" """),format.raw/*27.85*/("""frameborder="0" scrolling="auto" allowtransparency="true"></iframe>
    </div>
    <div id="rightbody">
        <h1 id="Rating">Rating</h1>
        <h1 id="Score">5</h1>
        <h1 id="ScoreExp">out of 5</h1>
        <div id="form">
            <form action="/viewresumex" method="POST">
                <select id="select" name="rating">
                    <option value="0" selected>Not Applicable</option>
                    <option value="1">1</option>
                    <option value="2">2</option>
                    <option value="3">3</option>
                    <option value="4">4</option>
                    <option value="5">5</option>
                </select>
                <input id="text" type="text" name="content" maxlength="50"/>
                <button id="submit"><i>submit</i></button>
                <input type="hidden" name="resumeID" value="""),_display_(/*45.61*/resumeID),format.raw/*45.69*/(""" """),format.raw/*45.70*/("""/>
                <input type="hidden" name="uniqueCommentID" value="1" />
            </form>
        </div>
        <div id="comment">
            <div id="subcomment">
                <p id="content">"""),_display_(/*51.34*/commentContent),format.raw/*51.48*/("""</p>
            </div>

        </div>


    </div>

</body>
</html>"""))
      }
    }
  }

  def render(loginStatus:Boolean,username:String,filename:String,resumeID:String,commentContent:String): play.twirl.api.HtmlFormat.Appendable = apply(loginStatus)(username)(filename)(resumeID)(commentContent)

  def f:((Boolean) => (String) => (String) => (String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (loginStatus) => (username) => (filename) => (resumeID) => (commentContent) => apply(loginStatus)(username)(filename)(resumeID)(commentContent)

  def ref: this.type = this

}


}

/**/
object viewresume extends viewresume_Scope0.viewresume
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 22:23:35 EST 2015
                  SOURCE: /Users/MichaelAWYu/Documents/UnloadingYard/WorldKing/ResuMate/app/views/viewresume.scala.html
                  HASH: 6ec29f9420af3a74bf99419f2cb43508a2f3fd48
                  MATRIX: 784->1|980->101|1008->103|1193->262|1207->268|1275->315|1373->386|1388->392|1445->428|1782->738|1807->754|1847->756|1888->769|2085->948|2098->953|2137->954|2178->967|2255->1017|2284->1025|2417->1127|2453->1136|2596->1252|2625->1260|2654->1261|3559->2139|3588->2147|3617->2148|3849->2353|3884->2367
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|43->12|43->12|43->12|48->17|48->17|48->17|49->18|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24|58->27|58->27|58->27|76->45|76->45|76->45|82->51|82->51
                  -- GENERATED --
              */
          