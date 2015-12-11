
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object registration_Scope0 {
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

class registration extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
	<title>Resumate</title>
	<link rel="stylesheet" type="text/css" href=""""),_display_(/*6.48*/routes/*6.54*/.Assets.versioned("stylesheets/registration.css")),format.raw/*6.103*/("""">
</head>
<body>
	<div id="header">
		<a href="/"><img src=""""),_display_(/*10.26*/routes/*10.32*/.Assets.versioned("images/logo.png")),format.raw/*10.68*/("""" class="logo" alt="Resumate"></a>
		<ul>
			<li id="Discover"><a class="headerlink" href="/jobcategory">Discover</a></li>
			<li id="Create"><a class="headerlink" href="/genRes">Create</a></li>
			<li id="About"><a class="headerlink" href="/about">About</a></li>
		</ul>
	</div>
		<div id="body">
		<div class="upperbody">
			<form action="/registration" method="POST">
				<input type="email" id="email" name="email" maxlength="30" value="Email Address" required="required"/>
				<input type="password" id="password" name="password" maxlength="20" value="Password" required="required"/>
				<input type="submit" id="submit" value="Registration"/>
				<h3 id="message">"""),_display_(/*23.23*/message),format.raw/*23.30*/("""</h3>
			</form>
		</div>
		<div class="lowerbody">
			<h3 class="About">Project for Advanced Software Engineering (W4156)</h3>
			<h3 class="NextAbout">Chen Yu (cy2415), Luis Alberto Ramirez (lar2195), Dongren You (dy2284), Ramses Driskell (rd2491)</h3>
		</div>


	</div>
</body>
</html>"""))
      }
    }
  }

  def render(message:String): play.twirl.api.HtmlFormat.Appendable = apply(message)

  def f:((String) => play.twirl.api.HtmlFormat.Appendable) = (message) => apply(message)

  def ref: this.type = this

}


}

/**/
object registration extends registration_Scope0.registration
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 19:24:48 EST 2015
                  SOURCE: /Users/MichaelAWYu/Documents/UnloadingYard/WorldKing/ResuMate/app/views/registration.scala.html
                  HASH: 653b8175828c6ef20ed781c9fefba3456b56ae6a
                  MATRIX: 759->1|871->18|898->19|1026->121|1040->127|1110->176|1199->238|1214->244|1271->280|1969->951|1997->958
                  LINES: 27->1|32->1|33->2|37->6|37->6|37->6|41->10|41->10|41->10|54->23|54->23
                  -- GENERATED --
              */
          