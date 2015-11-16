
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

class viewresume extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*3.1*/("""<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Resumate: Job Category</title>
    <link rel="stylesheet" type="text/css" href=""""),_display_(/*8.51*/routes/*8.57*/.Assets.versioned("stylesheets/viewresume.css")),format.raw/*8.104*/("""">
</head>
<body>
    <div id="header">
        <img src=""""),_display_(/*12.20*/routes/*12.26*/.Assets.versioned("images/logo.png")),format.raw/*12.62*/("""" class="logo" alt="Resumate">
        <ul>
            <li id="Discover"><a class="headerlink" href="/jobcategory">Discover</a></li>
            <li id="Create"><a class="headerlink" href="/genRes">Create</a></li>
            <li id="About"><a class="headerlink" href="/about">About</a></li>
        </ul>
    </div>
    <div id="body">
        <iframe id="PDF" style="border:1px solid #666CCC" title="PDF" src="/assets/resume/Resume.pdf" frameborder="1" scrolling="auto" height="1100" width="850" ></iframe>
    </div>
</body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object viewresume extends viewresume_Scope0.viewresume
              /*
                  -- GENERATED --
                  DATE: Mon Nov 16 17:21:58 EST 2015
                  SOURCE: /Users/MichaelAWYu/Documents/UnloadingYard/WorldKing/ResuMate/app/views/viewresume.scala.html
                  HASH: a7fc9f0306352c14537965d0661e6db8f8db7037
                  MATRIX: 837->2|1022->161|1036->167|1104->214|1190->273|1205->279|1262->315
                  LINES: 32->3|37->8|37->8|37->8|41->12|41->12|41->12
                  -- GENERATED --
              */
          