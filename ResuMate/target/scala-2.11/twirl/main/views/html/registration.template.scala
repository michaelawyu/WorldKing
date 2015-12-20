
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
	<link rel="stylesheet" type="text/css" href=""""),_display_(/*7.48*/routes/*7.54*/.Assets.versioned("stylesheets/bootstrap.min.css")),format.raw/*7.104*/("""">
	<link rel="stylesheet" type="text/css" href=""""),_display_(/*8.48*/routes/*8.54*/.Assets.versioned("stylesheets/freelancer.css")),format.raw/*8.101*/("""">
	<link rel="stylesheet" type="text/css" href=""""),_display_(/*9.48*/routes/*9.54*/.Assets.versioned("stylesheets/font-awesome/css/font-awesome.min.css")),format.raw/*9.124*/("""">
</head>
<body>
	<div id="header">
		<a href="/"><img src=""""),_display_(/*13.26*/routes/*13.32*/.Assets.versioned("images/logo.png")),format.raw/*13.68*/("""" class="logo" alt="Resumate"></a>
		<ul>
			<li id="Discover"><a class="headerlink" href="/jobcategory">Discover</a></li>
			<li id="Create"><a class="headerlink" href="/genRes">Create</a></li>
			<!--<li id="About"><a class="headerlink" href="/about">About</a></li>-->
		</ul>
	</div>
	<!--	<div id="body">
		<div class="upperbody">
			<form action="/registration" method="POST">
				<input type="email" id="email" name="email" maxlength="30" value="Email Address" required="required"/>
				<input type="password" id="password" name="password" maxlength="20" value="Password" required="required"/>
				<input type="submit" id="submit" value="Registration"/>
				<h3 id="message">"""),_display_(/*26.23*/message),format.raw/*26.30*/("""</h3>
			</form>
		</div>
		<div class="lowerbody">
			<h3 class="About">Project for Advanced Software Engineering (W4156)</h3>
			<h3 class="NextAbout">Chen Yu (cy2415), Luis Alberto Ramirez (lar2195), Dongren You (dy2284), Ramses Driskell (rd2491)</h3>
		</div>
    -->
    <section id="contact">
        <div class="container">
            <div class="row">
                <div class="col-lg-12 text-center">
                    <h2>Registration</h2>
                    <hr class="star-primary">
                </div>
            </div>
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2">
                    <!-- To configure the contact form email address, go to mail/contact_me.php and update the email address in the PHP file on line 19. -->
                    <!-- The form should work on most web servers, but if the form is not working you may need to configure your web server differently. -->
                    <form action="/registration" method="POST">
                        <div class="row control-group">
                            <div class="form-group col-xs-12 floating-label-form-group controls">
                                <label>Email Address</label>
                                <input type="email" id="email" name="email" class="form-control" placeholder="Email Address" required data-validation-required-message="Please enter your email address." required="required"/>
                                <p class="help-block text-danger"></p>
                            </div>
                        </div>
                        <div class="row control-group">
                            <div class="form-group col-xs-12 floating-label-form-group controls">
                                <label>Password</label>
                                <input type="password" class="form-control" placeholder="Password" name="password" id="password" required data-validation-required-message="Please enter your phone number." required="required"/>
                                <p class="help-block text-danger"></p>
                            </div>
                        </div>
                        <br>
                        <div class="row">
                            <div class="form-group col-xs-12">
                                <button type="submit" class="btn btn-success btn-lg" id="submit" value="Registration"/>Submit</button>
                            </div>
                        </div>
                    </form>
                    <h3 id="message">"""),_display_(/*68.39*/message),format.raw/*68.46*/("""</h3>
                </div>
            </div>
        </div>
    </section>
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
                  DATE: Sun Dec 20 12:28:14 EST 2015
                  SOURCE: /Users/ydrtc/ase_final/WorldKing/WorldKing/ResuMate/app/views/registration.scala.html
                  HASH: 46aebb698391bb230c7a739fde09bafbac377cd7
                  MATRIX: 759->1|871->18|898->19|1026->121|1040->127|1110->176|1186->226|1200->232|1271->282|1347->332|1361->338|1429->385|1505->435|1519->441|1610->511|1699->573|1714->579|1771->615|2480->1297|2508->1304|5092->3861|5120->3868
                  LINES: 27->1|32->1|33->2|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|44->13|44->13|44->13|57->26|57->26|99->68|99->68
                  -- GENERATED --
              */
          