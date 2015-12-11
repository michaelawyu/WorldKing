
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object genRes_Scope0 {
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

class genRes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Boolean,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(loginStatus: Boolean)(username: String)(title: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.57*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>
<html>
<head>
	<title>"""),_display_(/*6.10*/title),format.raw/*6.15*/("""</title>
	<link rel="stylesheet" type="text/css" href=""""),_display_(/*7.48*/routes/*7.54*/.Assets.versioned("stylesheets/genRes.css")),format.raw/*7.97*/("""">
</head>
<body>
	<div id="header">
		<a href="/"><img src=""""),_display_(/*11.26*/routes/*11.32*/.Assets.versioned("images/logo.png")),format.raw/*11.68*/("""" class="logo" alt="Resumate"></a>
		<ul>
			<li id="Discover"><a class="headerlink" href="/jobcategory">Discover</a></li>
			<li id="Create"><a class="headerlink" href="/genRes">Create</a></li>
			<li id="About"><a class="headerlink" href="/about">About</a></li>
			"""),_display_(/*16.5*/if(!loginStatus)/*16.21*/ {_display_(Seq[Any](format.raw/*16.23*/("""
			"""),format.raw/*17.4*/("""<li id="Login"><a class="headerlink" href="/login">Login</a></li>
			<li id="Registration"><a class="headerlink" href="/registration">Registration</a></li>
			""")))}/*19.6*/else/*19.11*/{_display_(Seq[Any](format.raw/*19.12*/("""
			"""),format.raw/*20.4*/("""<li id="Username"><a class="headerlink" href="/">"""),_display_(/*20.54*/username),format.raw/*20.62*/("""</a></li>
			<li id="Logoff"><a class="headerlink" href="/off">Log Off</a></li>
			""")))}),format.raw/*22.5*/("""
		"""),format.raw/*23.3*/("""</ul>
	</div>
	<div id="body">
		<div id="LeftPanel">
			<img id="Firework" src=""""),_display_(/*27.29*/routes/*27.35*/.Assets.versioned("images/firework.png")),format.raw/*27.75*/("""" alt="Firework">
			<h1 id="RSG">Ready. Set. Go.</h1>
			<p id="Guide">Creating a resume with <i>Resumate</i> is easy. Just fill the form on the left side of the screen, sumbit and a resume in PDF format is available for download immediately. It may not be perfect, but it is a good way to start. And we all need a good start.</p>
		</div>
	</div>
		<div id="RightPanel">
			<form action="/genRes" method="POST">
				<div id="firstName">
					<h4 id="firstName">First Name</h4>
					<input type="text" id="firstName" name="firstName" value="" maxlength="30">
				</div>
				<div id="lastName">
					<h4 id="lastName">Last Name</h4>
					<input type="text" id="lastName" name="lastName" value="" maxlength="30">
				</div>
				<div id="emailAddress">
					<h4 id="emailAddress">Email Address</h4>
					<input type="text" id="emailAddress" name="emailAddress" value="" type="email">
				</div>
				<div id="mobileNo">
					<h4 id="mobileNo">Mobile Number</h4>
					<input type="text" id="mobileNo" name="mobileNo" value="" maxlength="20">
				</div>
				<div id="address">
					<h4 id="address">Address</h4>
					<input type="text" id="address" name="address" value="" maxlength="40">
				</div>
				<div id="eduExp">
					<h4 id="eduExp">Educational Experience</h4>
					<textarea id="eduExp" name="eduExp" value=""></textarea>
				</div>
				<div id="workExp">
					<h4 id="workExp">Job Experience</h4>
					<textarea id="workExp" name="workExp" value=""></textarea>
				</div>
				<div id="submit">
					<input id="submit" type="submit" value="Submit">
				</div>
			</form>
		
		</div>
</body>
</html>"""))
      }
    }
  }

  def render(loginStatus:Boolean,username:String,title:String): play.twirl.api.HtmlFormat.Appendable = apply(loginStatus)(username)(title)

  def f:((Boolean) => (String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (loginStatus) => (username) => (title) => apply(loginStatus)(username)(title)

  def ref: this.type = this

}


}

/**/
object genRes extends genRes_Scope0.genRes
              /*
                  -- GENERATED --
                  DATE: Thu Dec 10 19:59:21 EST 2015
                  SOURCE: /Users/MichaelAWYu/Documents/UnloadingYard/WorldKing/ResuMate/app/views/genRes.scala.html
                  HASH: 71f1ed336e23497d54eb47f5dd539f20e9b83007
                  MATRIX: 762->1|912->56|940->58|1005->97|1030->102|1112->158|1126->164|1189->207|1278->269|1293->275|1350->311|1644->579|1669->595|1709->597|1740->601|1918->762|1931->767|1970->768|2001->772|2078->822|2107->830|2221->914|2251->917|2360->999|2375->1005|2436->1045
                  LINES: 27->1|32->1|34->3|37->6|37->6|38->7|38->7|38->7|42->11|42->11|42->11|47->16|47->16|47->16|48->17|50->19|50->19|50->19|51->20|51->20|51->20|53->22|54->23|58->27|58->27|58->27
                  -- GENERATED --
              */
          