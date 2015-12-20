
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

class jobcategory extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[Boolean,String,List[JobCategory],List[JobCategory],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginStatus: Boolean)(username: String)(ListA: List[JobCategory])(ListB: List[JobCategory]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.94*/("""

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
    <div id="theme">
        <div id="content">
            <div id="pics">
                <img id="roboticon" src=""""),_display_(/*29.43*/routes/*29.49*/.Assets.versioned("images/roboticon.png")),format.raw/*29.90*/(""""/>
                <img id="guitaricon" src=""""),_display_(/*30.44*/routes/*30.50*/.Assets.versioned("images/guitaricon.png")),format.raw/*30.92*/(""""/>
                <img id="cameraicon" src=""""),_display_(/*31.44*/routes/*31.50*/.Assets.versioned("images/cameraicon.png")),format.raw/*31.92*/(""""/>
            </div>
            <div id="text">
                <div id="title">
                    <p>Pick A Job Category to Start</p>
                </div>
                <div id="description">
                    <p>Different fields have different expectations for job seekers. Their idea of perfect resume also varies accordingly. Start with any category you are interested in below and see how the professionals tailor their resumes to the fittest.</p>
                </div>
            </div>
        </div>
    </div>
    <div id="ST">
        <div id="labelTechnology">
            <p id="labelTechnology">Science and Technology</p>
        </div>
        <div id="content">
            <div id="categoryListA">
                """),_display_(/*49.18*/for(p <- ListA) yield /*49.33*/ {_display_(Seq[Any](format.raw/*49.35*/("""
                    """),format.raw/*50.21*/("""<div id="categoryItemA">
                        <img id="categoryIcon" src="""),_display_(/*51.53*/p/*51.54*/.iconLocation),format.raw/*51.67*/(""" """),format.raw/*51.68*/("""/>
                        <form action="/resumelist" method="POST">
                            <button id="button">"""),_display_(/*53.50*/p/*53.51*/.jobCategoryName),format.raw/*53.67*/("""</button>
                            <input type="hidden" name="checked" value=""""),_display_(/*54.73*/p/*54.74*/.jobCategoryID),format.raw/*54.88*/("""">
                        </form>
                    </div>
                """)))}),format.raw/*57.18*/("""
            """),format.raw/*58.13*/("""</div>
        </div>
    </div>

    </div>
    <div id="Art">
        <div id="labelArt">
            <p id="labelArt">Art and Design</p>
        </div>
        <div id="content">
            <div dir="rtl" id="categoryListB">
                """),_display_(/*69.18*/for(p<-ListB) yield /*69.31*/{_display_(Seq[Any](format.raw/*69.32*/("""
                    """),format.raw/*70.21*/("""<div id="categoryItemB">
                        <img id="categoryIcon" src="""),_display_(/*71.53*/p/*71.54*/.iconLocation),format.raw/*71.67*/(""" """),format.raw/*71.68*/("""/>
                        <form action="/resumelist" method="POST">
                            <button id="button">"""),_display_(/*73.50*/p/*73.51*/.jobCategoryName),format.raw/*73.67*/("""</button>
                            <input type="hidden" name="checked" value=""""),_display_(/*74.73*/p/*74.74*/.jobCategoryID),format.raw/*74.88*/("""">
                        </form>
                    </div>
                """)))}),format.raw/*77.18*/("""
            """),format.raw/*78.13*/("""</div>
        </div>
    </div>


</body>
</html>"""))
      }
    }
  }

  def render(loginStatus:Boolean,username:String,ListA:List[JobCategory],ListB:List[JobCategory]): play.twirl.api.HtmlFormat.Appendable = apply(loginStatus)(username)(ListA)(ListB)

  def f:((Boolean) => (String) => (List[JobCategory]) => (List[JobCategory]) => play.twirl.api.HtmlFormat.Appendable) = (loginStatus) => (username) => (ListA) => (ListB) => apply(loginStatus)(username)(ListA)(ListB)

  def ref: this.type = this

}


}

/**/
object jobcategory extends jobcategory_Scope0.jobcategory
              /*
                  -- GENERATED --
                  DATE: Sun Dec 20 12:29:16 EST 2015
                  SOURCE: /Users/ydrtc/ase_final/WorldKing/WorldKing/ResuMate/app/views/jobcategory.scala.html
                  HASH: e1ac77e7b09e32d7e0c18579bc024ab7b29ed690
                  MATRIX: 801->1|988->93|1016->95|1201->254|1215->260|1284->308|1382->379|1397->385|1454->421|1798->738|1823->754|1863->756|1904->769|2101->948|2114->953|2153->954|2194->967|2271->1017|2300->1025|2433->1127|2469->1136|2631->1271|2646->1277|2708->1318|2782->1365|2797->1371|2860->1413|2934->1460|2949->1466|3012->1508|3783->2252|3814->2267|3854->2269|3903->2290|4007->2367|4017->2368|4051->2381|4080->2382|4225->2500|4235->2501|4272->2517|4381->2599|4391->2600|4426->2614|4536->2693|4577->2706|4850->2952|4879->2965|4918->2966|4967->2987|5071->3064|5081->3065|5115->3078|5144->3079|5289->3197|5299->3198|5336->3214|5445->3296|5455->3297|5490->3311|5600->3390|5641->3403
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|43->12|43->12|43->12|48->17|48->17|48->17|49->18|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|80->49|80->49|80->49|81->50|82->51|82->51|82->51|82->51|84->53|84->53|84->53|85->54|85->54|85->54|88->57|89->58|100->69|100->69|100->69|101->70|102->71|102->71|102->71|102->71|104->73|104->73|104->73|105->74|105->74|105->74|108->77|109->78
                  -- GENERATED --
              */
          