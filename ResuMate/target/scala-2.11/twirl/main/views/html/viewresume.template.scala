
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

class viewresume extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template6[Boolean,String,String,String,List[CommentAndRating],Array[String],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginStatus: Boolean)(username: String)(filename: String)(resumeID: String)(allCommentInfo: List[CommentAndRating])(scoreInfo: Array[String]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.144*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Resumate: View a Resume</title>
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
    <div id="frame">
        <div id="leftbody">
            <iframe id="PDF" style="border:0px solid #666CCC" title="PDF" src="""),_display_(/*28.80*/filename),format.raw/*28.88*/(""" """),format.raw/*28.89*/("""frameborder="0" scrolling="auto" allowtransparency="true"></iframe>
        </div>
        <div id="rightbody">
            <div id="scorepanel">
                <h1 id="score">"""),_display_(/*32.33*/scoreInfo(1)),format.raw/*32.45*/("""</h1>
                <p id="number">from """),_display_(/*33.38*/scoreInfo(2)),format.raw/*33.50*/(""" """),format.raw/*33.51*/("""ratings</p>
                <p id="best">★★★★★ """),_display_(/*34.37*/scoreInfo(3)),format.raw/*34.49*/("""</p>
                <p id="good">★★★★ """),_display_(/*35.36*/scoreInfo(4)),format.raw/*35.48*/("""</p>
                <p id="mediocre">★★★ """),_display_(/*36.39*/scoreInfo(5)),format.raw/*36.51*/("""</p>
                <p id="bad">★★ """),_display_(/*37.33*/scoreInfo(6)),format.raw/*37.45*/("""</p>
                <p id="worst">★ """),_display_(/*38.34*/scoreInfo(7)),format.raw/*38.46*/("""</p>
            </div>
            <div id="inputpanel">
                    <form action="/viewresumex" method="POST">
                        <input id="text" type="text" name="content" maxlength="50"/>
                        <fieldset id="mainset" class="rating">
                            <input type="radio" id="star5" name="rating" value="5" /><label for="star5" title="Rocks!">5 stars</label>
                            <input type="radio" id="star4" name="rating" value="4" /><label for="star4" title="Pretty good">4 stars</label>
                            <input type="radio" id="star3" name="rating" value="3" /><label for="star3" title="Meh">3 stars</label>
                            <input type="radio" id="star2" name="rating" value="2" /><label for="star2" title="Kinda bad">2 stars</label>
                            <input type="radio" id="star1" name="rating" value="1" /><label for="star1" title="Sucks big time">1 star</label>
                        </fieldset>
                        <button id="submit">submit</button>
                        <input type="hidden" name="resumeID" value="""),_display_(/*51.69*/resumeID),format.raw/*51.77*/(""" """),format.raw/*51.78*/("""/>
                    </form>
            </div>


            <div id="commentpanel">
                """),_display_(/*57.18*/for(p <- allCommentInfo) yield /*57.42*/ {_display_(Seq[Any](format.raw/*57.44*/("""
                    """),format.raw/*58.21*/("""<div id="comment">
                        <img id="profile" src=""""),_display_(/*59.49*/routes/*59.55*/.Assets.versioned("images/defaultprofile.png")),format.raw/*59.101*/(""""/>
                        <h5 id="commentpublisher">"""),_display_(/*60.52*/p/*60.53*/.userID),format.raw/*60.60*/("""</h5>
                        <h5 id="publishtime">"""),_display_(/*61.47*/p/*61.48*/.dateAndTimeTran),format.raw/*61.64*/("""</h5>
                        <h5 id="content">"""),_display_(/*62.43*/p/*62.44*/.content),format.raw/*62.52*/("""</h5>
                    </div>
                """)))}),format.raw/*64.18*/("""
            """),format.raw/*65.13*/("""</div>
        </div>
    </div>

</body>
</html>"""))
      }
    }
  }

  def render(loginStatus:Boolean,username:String,filename:String,resumeID:String,allCommentInfo:List[CommentAndRating],scoreInfo:Array[String]): play.twirl.api.HtmlFormat.Appendable = apply(loginStatus)(username)(filename)(resumeID)(allCommentInfo)(scoreInfo)

  def f:((Boolean) => (String) => (String) => (String) => (List[CommentAndRating]) => (Array[String]) => play.twirl.api.HtmlFormat.Appendable) = (loginStatus) => (username) => (filename) => (resumeID) => (allCommentInfo) => (scoreInfo) => apply(loginStatus)(username)(filename)(resumeID)(allCommentInfo)(scoreInfo)

  def ref: this.type = this

}


}

/**/
object viewresume extends viewresume_Scope0.viewresume
              /*
                  -- GENERATED --
                  DATE: Sat Dec 19 15:53:25 EST 2015
                  SOURCE: /Users/MichaelAWYu/Documents/UnloadingYard/WorldKing/ResuMate/app/views/viewresume.scala.html
                  HASH: e58315bc6341143fd2f183f5de09c0b071e03f25
                  MATRIX: 814->1|1052->143|1080->145|1266->305|1280->311|1348->358|1446->429|1461->435|1518->471|1855->781|1880->797|1920->799|1961->812|2158->991|2171->996|2210->997|2251->1010|2328->1060|2357->1068|2490->1170|2526->1179|2698->1324|2727->1332|2756->1333|2961->1511|2994->1523|3064->1566|3097->1578|3126->1579|3201->1627|3234->1639|3301->1679|3334->1691|3404->1734|3437->1746|3501->1783|3534->1795|3599->1833|3632->1845|4779->2965|4808->2973|4837->2974|4969->3079|5009->3103|5049->3105|5098->3126|5192->3193|5207->3199|5275->3245|5357->3300|5367->3301|5395->3308|5474->3360|5484->3361|5521->3377|5596->3425|5606->3426|5635->3434|5716->3484|5757->3497
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|43->12|43->12|43->12|48->17|48->17|48->17|49->18|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24|59->28|59->28|59->28|63->32|63->32|64->33|64->33|64->33|65->34|65->34|66->35|66->35|67->36|67->36|68->37|68->37|69->38|69->38|82->51|82->51|82->51|88->57|88->57|88->57|89->58|90->59|90->59|90->59|91->60|91->60|91->60|92->61|92->61|92->61|93->62|93->62|93->62|95->64|96->65
                  -- GENERATED --
              */
          