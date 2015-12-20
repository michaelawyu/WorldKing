
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
		<title>"""),_display_(/*6.11*/title),format.raw/*6.16*/("""</title>
		<!-- Latest compiled and minified bootstrap CSS -->
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css" integrity="sha384-1q8mTJOASx8j1Au+a5WDVnPi2lkFfwwEAa8hDDdjZlpLegxhjVME1fgjWPGmkzs7" crossorigin="anonymous">
		<!-- Latest compiled and minified bootstrap JavaScript -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js" integrity="sha384-0mSbJDEHialfmuBBQP6A4Qrprq5OVfW37PRR3j5ELqxss1yVqOtnepnHVP9aJ7xS" crossorigin="anonymous"></script>
		<script>
			$(document).ready(function() """),format.raw/*13.33*/("""{"""),format.raw/*13.34*/("""
				"""),format.raw/*14.5*/("""$("#schooladd1").click(function() """),format.raw/*14.39*/("""{"""),format.raw/*14.40*/("""$(".school1").prop("disabled", false);"""),format.raw/*14.78*/("""}"""),format.raw/*14.79*/(""");
				$("#schooldontadd1").click(function() """),format.raw/*15.43*/("""{"""),format.raw/*15.44*/("""$(".school1").prop("disabled", true);"""),format.raw/*15.81*/("""}"""),format.raw/*15.82*/(""");
				$("#schooladd2").click(function() """),format.raw/*16.39*/("""{"""),format.raw/*16.40*/("""$(".school2").prop("disabled", false);"""),format.raw/*16.78*/("""}"""),format.raw/*16.79*/(""");
				$("#schooldontadd2").click(function() """),format.raw/*17.43*/("""{"""),format.raw/*17.44*/("""$(".school2").prop("disabled", true);"""),format.raw/*17.81*/("""}"""),format.raw/*17.82*/(""");
				$("#schooladd3").click(function() """),format.raw/*18.39*/("""{"""),format.raw/*18.40*/("""$(".school3").prop("disabled", false);"""),format.raw/*18.78*/("""}"""),format.raw/*18.79*/(""");
				$("#schooldontadd3").click(function() """),format.raw/*19.43*/("""{"""),format.raw/*19.44*/("""$(".school3").prop("disabled", true);"""),format.raw/*19.81*/("""}"""),format.raw/*19.82*/(""");

				$("#expadd1").click(function() """),format.raw/*21.36*/("""{"""),format.raw/*21.37*/("""$(".exp1").prop("disabled", false);"""),format.raw/*21.72*/("""}"""),format.raw/*21.73*/(""");
				$("#expdontadd1").click(function() """),format.raw/*22.40*/("""{"""),format.raw/*22.41*/("""$(".exp1").prop("disabled", true);"""),format.raw/*22.75*/("""}"""),format.raw/*22.76*/(""");
				$("#expadd2").click(function() """),format.raw/*23.36*/("""{"""),format.raw/*23.37*/("""$(".exp2").prop("disabled", false);"""),format.raw/*23.72*/("""}"""),format.raw/*23.73*/(""");
				$("#expdontadd2").click(function() """),format.raw/*24.40*/("""{"""),format.raw/*24.41*/("""$(".exp2").prop("disabled", true);"""),format.raw/*24.75*/("""}"""),format.raw/*24.76*/(""");
				$("#expadd3").click(function() """),format.raw/*25.36*/("""{"""),format.raw/*25.37*/("""$(".exp3").prop("disabled", false);"""),format.raw/*25.72*/("""}"""),format.raw/*25.73*/(""");
				$("#expdontadd3").click(function() """),format.raw/*26.40*/("""{"""),format.raw/*26.41*/("""$(".exp3").prop("disabled", true);"""),format.raw/*26.75*/("""}"""),format.raw/*26.76*/(""");
			"""),format.raw/*27.4*/("""}"""),format.raw/*27.5*/(""");
		</script>
	</head>
	<body>
		<div id="header">
			<img src=""""),_display_(/*32.15*/routes/*32.21*/.Assets.versioned("images/logo.png")),format.raw/*32.57*/("""" class="logo" alt="Resumate">
			<ul>
				<li id="Discover"><a class="headerlink" href="/jobcategory">Discover</a></li>
				<li id="Create"><a class="headerlink" href="/genRes">Create</a></li>
				<li id="About"><a class="headerlink" href="/about">About</a></li>
			</ul>
		</div>
		<div id="body">
			<div class="container" id="LeftPanel">
				<h1 id="RSG">Ready. Set. Go.</h1>
				<p id="Guide">Creating a resume with <i>Resumate</i> is easy. Just fill the form on the left side of the screen, sumbit and a resume in PDF format is available for download immediately. It may not be perfect, but it is a good way to start. And we all need a good start.</p>
			</div>
		</div>
		<div class="container" id="RightPanel">
			"""),_display_(/*46.5*/helper/*46.11*/.form(routes.Application.handleForm)/*46.47*/ {_display_(Seq[Any](format.raw/*46.49*/("""
			"""),format.raw/*47.4*/("""<form role="form" data-toggle="validator" action="/genRes" method="POST">
				<h3>Contact Information</h3>
				<div class="form-group">
					<label for="firstName">Full Name</label>
					<input type="text" class="form-control" name="fullName" placeholder="Bob Bobman" maxlength="30" required>
				</div>
				<div class="row">
					<div class="form-group col-md-6">
						<label for="emailAddress">Email Address</label>
						<input type="email" class="form-control" name="emailAddress" placeholder="foo@example.com" maxlength="30" required>
					</div>
					<div class="form-group col-md-6">
						<label for="phoneNo">Phone Number</label>
						<input type="tel" pattern="^(\+\d"""),format.raw/*60.40*/("""{"""),format.raw/*60.41*/("""1,2"""),format.raw/*60.44*/("""}"""),format.raw/*60.45*/("""\s)?\(?\d"""),format.raw/*60.54*/("""{"""),format.raw/*60.55*/("""3"""),format.raw/*60.56*/("""}"""),format.raw/*60.57*/("""\)?[\s.-]?\d"""),format.raw/*60.69*/("""{"""),format.raw/*60.70*/("""3"""),format.raw/*60.71*/("""}"""),format.raw/*60.72*/("""[\s.-]?\d"""),format.raw/*60.81*/("""{"""),format.raw/*60.82*/("""4"""),format.raw/*60.83*/("""}"""),format.raw/*60.84*/("""$" class="form-control" name="phoneNo" placeholder="(212) 555-1234" maxlength="30" required>
					</div>
				</div>
				<div class="row">
					<div class="form-group col-md-4">
						<label for="street">Street Address</label>
						<input type="text" class="form-control" name="street" placeholder="1234 1st Ave." maxlength="40" required>
					</div>
					<div class="form-group col-md-4">
						<label for="city">City/State</label>
						<input type="text" class="form-control" name="city" placeholder="New York, NY" maxlength="40" required>
					</div>
					<div class="form-group col-md-4">
						<label for="zip">Zip Code</label>
						<input type="number" class="form-control" name="zip" placeholder="10001" maxlength="8" required>
					</div>
				</div>
				<h3>Educational Experience</h3>
				<div class="row">
					<div class="form-group col-md-3">
						<label for="dateRange1">Start/End Date</label>
						<input type="text" class="school1 form-control" name="dateRange1" placeholder="Jan 1969 - Dec 2015" maxlength="22">
					</div>
					<div class="form-group col-md-3">
						<label for="schoolName1">School Name</label>
						<input type="text" class="school1 form-control" name="schoolName1" placeholder="University of Foo" maxlength="40">
					</div>
					<div class="form-group col-md-3">
						<label for="schoolTitle1">Education Details</label>
						<input type="text" class="school1 form-control" name="schoolTitle1" placeholder="BS of Engineering">
					</div>
					<div class="form-group col-md-3">
						<div class="radio">
							<label>
								<input type="radio" name="schooladd1" id="schooladd1" value="true" checked>
								Include in resume
							</label>
						</div>
						<div class="radio">
							<label>
								<input type="radio" name="schooladd1" id="schooldontadd1" value="false">
								Exclude from resume
							</label>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="form-group col-md-3">
						<label for="dateRange1"></label>
						<input type="text" class="school2 form-control" name="dateRange2" placeholder="Jan 1969 - Dec 2015" maxlength="22" disabled>
					</div>
					<div class="form-group col-md-3">
						<label for="schoolName1"></label>
						<input type="text" class="school2 form-control" name="schoolName2" placeholder="University of Foo" maxlength="40" disabled>
					</div>
					<div class="form-group col-md-3">
						<label for="schoolTitle1"></label>
						<input type="text" class="school2 form-control" name="schoolTitle2" placeholder="BS of Engineering" disabled>
					</div>
					<div class="form-group col-md-3">
						<div class="radio">
							<label>
								<input type="radio" name="schooladd2" id="schooladd2" value="true">
								Include in resume
							</label>
						</div>
						<div class="radio">
							<label>
								<input type="radio" name="schooladd2" id="schooldontadd2" value="false" checked>
								Exclude from resume
							</label>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="form-group col-md-3">
						<label for="dateRange1"></label>
						<input type="text" class="school3 form-control" name="dateRange3" placeholder="Jan 1969 - Dec 2015" maxlength="22" disabled>
					</div>
					<div class="form-group col-md-3">
						<label for="schoolName1"></label>
						<input type="text" class="school3 form-control" name="schoolName3" placeholder="University of Foo" maxlength="40" disabled>
					</div>
					<div class="form-group col-md-3">
						<label for="schoolTitle1"></label>
						<input type="text" class="school3 form-control" name="schoolTitle3" placeholder="BS of Engineering" disabled>
					</div>
					<div class="form-group col-md-3">
						<div class="radio">
							<label>
								<input type="radio" name="schooladd3" id="schooladd3" value="true">
								Include in resume
							</label>
						</div>
						<div class="radio">
							<label>
								<input type="radio" name="schooladd3" id="schooldontadd3" value="false" checked>
								Exclude from resume
							</label>
						</div>
					</div>
				</div>

				<h3>Professional Experience</h3>
				<div class="row">
					<div class="form-group col-md-3">
						<label for="dateRangeExp1">Start/End Date</label>
						<input type="text" class="exp1 form-control" name="dateRange4" placeholder="Jan 1969 - Dec 2015" maxlength="22">
					</div>
					<div class="form-group col-md-3">
						<label for="expName1">Company Name</label>
						<input type="text" class="exp1 form-control" name="expName1" placeholder="Foo Inc." maxlength="40">
					</div>
					<div class="form-group col-md-3">
						<label for="expDesc1">Position Description</label>
						<input type="text" class="exp1 form-control" name="expDesc1" placeholder="Engineer">
					</div>
					<div class="form-group col-md-3">
						<div class="radio">
							<label>
								<input type="radio" name="expadd1" id="expadd1" value="true" checked>
								Include in resume
							</label>
						</div>
						<div class="radio">
							<label>
								<input type="radio" name="expadd1" id="expdontadd1" value="false">
								Exclude from resume
							</label>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="form-group col-md-3">
						<label for="dateRangeExp2"></label>
						<input type="text" class="exp2 form-control" name="dateRangeExp2" placeholder="Jan 1969 - Dec 2015" maxlength="22" disabled>
					</div>
					<div class="form-group col-md-3">
						<label for="expName2"></label>
						<input type="text" class="exp2 form-control" name="expName2" placeholder="Foo Inc." maxlength="40" disabled>
					</div>
					<div class="form-group col-md-3">
						<label for="expDesc2"></label>
						<input type="text" class="exp2 form-control" name="expDesc2" placeholder="Project Manager" disabled>
					</div>
					<div class="form-group col-md-3">
						<div class="radio">
							<label>
								<input type="radio" name="expadd2" id="expadd2" value="true">
								Include in resume
							</label>
						</div>
						<div class="radio">
							<label>
								<input type="radio" name="expadd2" id="expdontadd2" value="false" checked>
								Exclude from resume
							</label>
						</div>
					</div>
				</div>
				<div class="row">
					<div class="form-group col-md-3">
						<label for="dateRangeExp3"></label>
						<input type="text" class="exp3 form-control" name="dateRangeExp3" placeholder="Jan 1969 - Dec 2015" maxlength="22" disabled>
					</div>
					<div class="form-group col-md-3">
						<label for="expName3"></label>
						<input type="text" class="exp3 form-control" name="expName3" placeholder="Foo Inc." maxlength="40" disabled>
					</div>
					<div class="form-group col-md-3">
						<label for="expDesc3"></label>
						<input type="text" class="exp3 form-control" name="expDesc3" placeholder="Wizard" disabled>
					</div>
					<div class="form-group col-md-3">
						<div class="radio">
							<label>
								<input type="radio" name="expadd3" id="expadd3" value="true">
								Include in resume
							</label>
						</div>
						<div class="radio">
							<label>
								<input type="radio" name="expadd3" id="expdontadd3" value="false" checked>
								Exclude from resume
							</label>
						</div>
					</div>
				</div>

				<div class="row" style="text-align: center">
					<button type="submit" value="Submit" class="btn btn-primary btn-lg">Create Resume</button>
				</div>
			</form>
			""")))}),format.raw/*253.5*/("""
			"""),format.raw/*254.4*/("""<br/>
			<br/>
			<br/>
			<br/>

		</div>
	</body>
</html>
"""))
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
                  DATE: Wed Dec 16 01:27:02 EST 2015
                  SOURCE: /Users/MichaelAWYu/Documents/UnloadingYard/WorldKing/ResuMate/app/views/genRes.scala.html
                  HASH: a20fe1eea0c6d763188f06838d4f904774c51fc3
                  MATRIX: 762->1|912->56|940->58|1007->99|1032->104|1731->775|1760->776|1792->781|1854->815|1883->816|1949->854|1978->855|2051->900|2080->901|2145->938|2174->939|2243->980|2272->981|2338->1019|2367->1020|2440->1065|2469->1066|2534->1103|2563->1104|2632->1145|2661->1146|2727->1184|2756->1185|2829->1230|2858->1231|2923->1268|2952->1269|3019->1308|3048->1309|3111->1344|3140->1345|3210->1387|3239->1388|3301->1422|3330->1423|3396->1461|3425->1462|3488->1497|3517->1498|3587->1540|3616->1541|3678->1575|3707->1576|3773->1614|3802->1615|3865->1650|3894->1651|3964->1693|3993->1694|4055->1728|4084->1729|4117->1735|4145->1736|4238->1802|4253->1808|4310->1844|5059->2567|5074->2573|5119->2609|5159->2611|5190->2615|5897->3295|5926->3296|5957->3299|5986->3300|6023->3309|6052->3310|6081->3311|6110->3312|6150->3324|6179->3325|6208->3326|6237->3327|6274->3336|6303->3337|6332->3338|6361->3339|13851->10798|13883->10802
                  LINES: 27->1|32->1|34->3|37->6|37->6|44->13|44->13|45->14|45->14|45->14|45->14|45->14|46->15|46->15|46->15|46->15|47->16|47->16|47->16|47->16|48->17|48->17|48->17|48->17|49->18|49->18|49->18|49->18|50->19|50->19|50->19|50->19|52->21|52->21|52->21|52->21|53->22|53->22|53->22|53->22|54->23|54->23|54->23|54->23|55->24|55->24|55->24|55->24|56->25|56->25|56->25|56->25|57->26|57->26|57->26|57->26|58->27|58->27|63->32|63->32|63->32|77->46|77->46|77->46|77->46|78->47|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|91->60|284->253|285->254
                  -- GENERATED --
              */
          