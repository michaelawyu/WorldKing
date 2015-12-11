
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

class homepage extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Boolean,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginStatus: Boolean)(username: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.42*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
	<title>Resumate</title>
	<link rel="stylesheet" type="text/css" href=""""),_display_(/*7.48*/routes/*7.54*/.Assets.versioned("stylesheets/homepage.css")),format.raw/*7.99*/("""">
</head>
<body>
	<div id="header">
		<a href="/"><img src=""""),_display_(/*11.26*/routes/*11.32*/.Assets.versioned("images/logo.png")),format.raw/*11.68*/("""" class="logo" alt="Resumate"></a>
		<ul>
			<li id="Discover"><a class="headerlink" href="/jobcategory">Discover</a></li>
			<li id="Create"><a class="headerlink" href="/genRes">Create</a></li>
			<li id="About"><a class="headerlink" href="/about">About</a></li>
			"""),_display_(/*16.5*/if(!loginStatus)/*16.21*/ {_display_(Seq[Any](format.raw/*16.23*/("""
				"""),format.raw/*17.5*/("""<li id="Login"><a class="headerlink" href="/login">Login</a></li>
				<li id="Registration"><a class="headerlink" href="/registration">Registration</a></li>
			""")))}/*19.6*/else/*19.11*/{_display_(Seq[Any](format.raw/*19.12*/("""
				"""),format.raw/*20.5*/("""<li id="Username"><a class="headerlink" href="/">"""),_display_(/*20.55*/username),format.raw/*20.63*/("""</a></li>
				<li id="Logoff"><a class="headerlink" href="/off">Log Off</a></li>
			""")))}),format.raw/*22.5*/("""
		"""),format.raw/*23.3*/("""</ul>
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

  def render(loginStatus:Boolean,username:String): play.twirl.api.HtmlFormat.Appendable = apply(loginStatus)(username)

  def f:((Boolean) => (String) => play.twirl.api.HtmlFormat.Appendable) = (loginStatus) => (username) => apply(loginStatus)(username)

  def ref: this.type = this

}


}

/**/
object homepage extends homepage_Scope0.homepage
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 19:06:11 EST 2015
                  SOURCE: /Users/MichaelAWYu/Documents/UnloadingYard/WorldKing/ResuMate/app/views/homepage.scala.html
                  HASH: 93b8e2c3991973f007219c144010a6ee5d1278e3
                  MATRIX: 759->1|894->41|922->43|1050->145|1064->151|1129->196|1218->258|1233->264|1290->300|1584->568|1609->584|1649->586|1681->591|1860->753|1873->758|1912->759|1944->764|2021->814|2050->822|2165->907|2195->910
                  LINES: 27->1|32->1|34->3|38->7|38->7|38->7|42->11|42->11|42->11|47->16|47->16|47->16|48->17|50->19|50->19|50->19|51->20|51->20|51->20|53->22|54->23
                  -- GENERATED --
              */
          