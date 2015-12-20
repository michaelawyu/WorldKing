
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
                  DATE: Sun Dec 20 10:49:07 EST 2015
                  SOURCE: /Users/MichaelAWYu/Documents/UnloadingYard/WorldKing/ResuMate/app/views/jobcategory.scala.html
                  HASH: 183e206fb3f544f519b3979f0fdc0e00fed5401e
                  MATRIX: 801->1|988->93|1016->95|1201->254|1215->260|1284->308|1382->379|1397->385|1454->421|1791->731|1816->747|1856->749|1897->762|2094->941|2107->946|2146->947|2187->960|2264->1010|2293->1018|2426->1120|2462->1129|2624->1264|2639->1270|2701->1311|2775->1358|2790->1364|2853->1406|2927->1453|2942->1459|3005->1501|3776->2245|3807->2260|3847->2262|3896->2283|4000->2360|4010->2361|4044->2374|4073->2375|4218->2493|4228->2494|4265->2510|4374->2592|4384->2593|4419->2607|4529->2686|4570->2699|4843->2945|4872->2958|4911->2959|4960->2980|5064->3057|5074->3058|5108->3071|5137->3072|5282->3190|5292->3191|5329->3207|5438->3289|5448->3290|5483->3304|5593->3383|5634->3396
                  LINES: 27->1|32->1|34->3|39->8|39->8|39->8|43->12|43->12|43->12|48->17|48->17|48->17|49->18|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24|60->29|60->29|60->29|61->30|61->30|61->30|62->31|62->31|62->31|80->49|80->49|80->49|81->50|82->51|82->51|82->51|82->51|84->53|84->53|84->53|85->54|85->54|85->54|88->57|89->58|100->69|100->69|100->69|101->70|102->71|102->71|102->71|102->71|104->73|104->73|104->73|105->74|105->74|105->74|108->77|109->78
                  -- GENERATED --
              */
          