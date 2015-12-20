
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
	<link rel="stylesheet" type="text/css" href=""""),_display_(/*8.48*/routes/*8.54*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*8.104*/("""">
	<link rel="stylesheet" type="text/css" href=""""),_display_(/*9.48*/routes/*9.54*/.Assets.versioned("stylesheets/freelancer.css")),format.raw/*9.101*/("""">
	<link rel="stylesheet" type="text/css" href=""""),_display_(/*10.48*/routes/*10.54*/.Assets.versioned("stylesheets/font-awesome/css/font-awesome.min.css")),format.raw/*10.124*/("""">
</head>
<body>
	<div id="header">
		<a href="/"><img src=""""),_display_(/*14.26*/routes/*14.32*/.Assets.versioned("images/logo.png")),format.raw/*14.68*/("""" class="logo" alt="Resumate"></a>
		<ul>
			<li id="Discover"><a class="headerlink" href="/jobcategory">Discover</a></li>
			<li id="Create"><a class="headerlink" href="/genRes">Create</a></li>
			<li id="About"><a class="headerlink" href="#about">About</a></li>
			"""),_display_(/*19.5*/if(!loginStatus)/*19.21*/ {_display_(Seq[Any](format.raw/*19.23*/("""
				"""),format.raw/*20.5*/("""<li id="Login"><a class="headerlink" href="/login">Login</a></li>
				<li id="Registration"><a class="headerlink" href="/registration">Registration</a></li>
			""")))}/*22.6*/else/*22.11*/{_display_(Seq[Any](format.raw/*22.12*/("""
				"""),format.raw/*23.5*/("""<li id="Username"><a class="headerlink" href="/">"""),_display_(/*23.55*/username),format.raw/*23.63*/("""</a></li>
				<li id="Logoff"><a class="headerlink" href="/off">Log Off</a></li>
			""")))}),format.raw/*25.5*/("""
		"""),format.raw/*26.3*/("""</ul>
	</div>
	
	<!--	<div id="body">
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
	-->
	<header>
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <img class="img-responsive" src=""""),_display_(/*46.55*/routes/*46.61*/.Assets.versioned("images/brightness.png")),format.raw/*46.103*/("""" alt="">
                    <div class="intro-text">
                        <span class="name">ResuMate</span>
                        <hr class="star-light">
                        <span class="skills">Your Best Resume Assistant</span>
                    </div>
                </div>
            </div>
        </div>
    </header>
	
	<div class="footer">
	<section id="about">
	<footer class="text-center">
        <div class="footer-above">
            <div class="container">
                <div class="row">
                    <div class="footer-col col-md-4">
                        <h3>COMPANY</h3>
                        <p>Founded in Dec. 2015 and based in New York City, ResuMate is designed to help users customize their own resume.</p>
                    </div>
                    <div class="footer-col col-md-4">
                        <h3>Around the Web</h3>
                        <ul class="list-inline">
                            <li>
                                <a href="https://github.com/michaelawyu/WorldKing" target="_blank" class="btn-social btn-outline"><i class="fa fa-fw fa-github"></i></a>
                            </li>
                            
                            <li>
                                <a href="https://twitter.com/YouDongren" target="_blank" class="btn-social btn-outline"><i class="fa fa-fw fa-twitter"></i></a>
                            </li>
                            
                        </ul>
                    </div>
                    <div class="footer-col col-md-4">
                        <h3>WHAT WE DO</h3>
                        <p>It features both resume generator and resume sharing, and will be your best resume assistant.</p>
                    </div>
                </div>
            </div>
        </div>
        <div class="footer-below">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        Copyright &copy; ResuMate 2015
                    </div>
                </div>
            </div>
        </div>
    </footer>    
</section>
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
                  DATE: Sun Dec 20 12:29:38 EST 2015
                  SOURCE: /Users/ydrtc/ase_final/WorldKing/WorldKing/ResuMate/app/views/homepage.scala.html
                  HASH: 9e3c81563dc195f475be8f47147736c1abfe897d
                  MATRIX: 759->1|894->41|922->43|1050->145|1064->151|1129->196|1205->246|1219->252|1290->302|1366->352|1380->358|1448->405|1525->455|1540->461|1632->531|1721->593|1736->599|1793->635|2087->903|2112->919|2152->921|2184->926|2363->1088|2376->1093|2415->1094|2447->1099|2524->1149|2553->1157|2668->1242|2698->1245|3435->1955|3450->1961|3514->2003
                  LINES: 27->1|32->1|34->3|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|45->14|45->14|45->14|50->19|50->19|50->19|51->20|53->22|53->22|53->22|54->23|54->23|54->23|56->25|57->26|77->46|77->46|77->46
                  -- GENERATED --
              */
          