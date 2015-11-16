
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object homepage_Scope0 {
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

class homepage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.1*/("""<!DOCTYPE html>
<html>
<head>
	<title>Resumate</title>
	<link rel="stylesheet" type="text/css" href=""""),_display_(/*5.48*/routes/*5.54*/.Assets.versioned("stylesheets/homepage.css")),format.raw/*5.99*/("""">
</head>
<body>
	<div id="header">
		<img src=""""),_display_(/*9.14*/routes/*9.20*/.Assets.versioned("images/logo.png")),format.raw/*9.56*/("""" class="logo" alt="Resumate">
		<ul>
			<li id="Discover"><a class="headerlink" href="/jobcategory">Discover</a></li>
			<li id="Create"><a class="headerlink" href="/genRes">Create</a></li>
			<li id="About"><a class="headerlink" href="/about">About</a></li>
			<li id="Login"><a class="headerlink" href="/login">Login</a></li>
			<li id="Registration"><a class="headerlink" href="/registration">Registration</a></li>
		</ul>
	</div>
		<div id="body">
		<div class="upperbody">
			<h3 class="Intro">Introducing</h3>
			<h1 class="Brand">ResuMate</h1>
			<h3 class="Guide">Start Your First Step into Professional World with the Help of Professional World</h3>
			<h3 class="Button">Get Started</h3>
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

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object homepage extends homepage_Scope0.homepage
              /*
                  -- GENERATED --
                  DATE: Mon Nov 16 17:29:40 EST 2015
                  SOURCE: /Users/MichaelAWYu/Documents/UnloadingYard/WorldKing/ResuMate/app/views/homepage.scala.html
                  HASH: 65b0ab2185d75c73cb04eb533fdfbdb9ebc6eeda
                  MATRIX: 833->0|961->102|975->108|1040->153|1116->203|1130->209|1186->245
                  LINES: 32->1|36->5|36->5|36->5|40->9|40->9|40->9
                  -- GENERATED --
              */
          