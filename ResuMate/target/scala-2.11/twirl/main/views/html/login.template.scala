
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.19*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
	<title>Resumate</title>
	<link rel="stylesheet" type="text/css" href=""""),_display_(/*6.48*/routes/*6.54*/.Assets.versioned("stylesheets/login.css")),format.raw/*6.96*/("""">
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
			<form action="\login" method="POST">
				<input type="email" id="email" name="email" maxlength="30" value="Email Address" required="required"/>
				<input type="password" id="password" name="password" maxlength="20" value="Password" required="required"/>
				<input type="submit" id="submit" value="Login"/>
			</form>
			<h3 id="message">"""),_display_(/*28.22*/message),format.raw/*28.29*/("""</h3>
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
                    <h2>Login</h2>
                    <hr class="star-primary">
                </div>
            </div>
            <div class="row">
                <div class="col-lg-8 col-lg-offset-2">
                    <!-- To configure the contact form email address, go to mail/contact_me.php and update the email address in the PHP file on line 19. -->
                    <!-- The form should work on most web servers, but if the form is not working you may need to configure your web server differently. -->
                    <form action="\login" method="POST">
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
                                <button type="submit" class="btn btn-success btn-lg" id="submit" value="Login"/>Submit</button>
                            </div>
                        </div>
                    </form>
                    <h3 id="message">"""),_display_(/*69.39*/message),format.raw/*69.46*/("""</h3>
                </div>
            </div>
        </div>
    </section>
	</div>
	
	<script>
 
    // This is called with the results from from FB.getLoginStatus().
    function statusChangeCallback(response) """),format.raw/*79.45*/("""{"""),format.raw/*79.46*/("""
      """),format.raw/*80.7*/("""console.log('statusChangeCallback');
      console.log(response);
     
      if (response.status === 'connected') """),format.raw/*83.44*/("""{"""),format.raw/*83.45*/("""
    	  """),format.raw/*84.8*/("""document.getElementById('click').disabled=false;
        // Logged into your app and Facebook.
        CheckUser();
      """),format.raw/*87.7*/("""}"""),format.raw/*87.8*/(""" """),format.raw/*87.9*/("""else if (response.status === 'not_authorized') """),format.raw/*87.56*/("""{"""),format.raw/*87.57*/("""
        """),format.raw/*88.9*/("""// The person is logged into Facebook, but not your app.
        document.getElementById('click').disabled=true;
        document.getElementById('status').innerHTML = 'Please log ' +
          'into this app.';
      """),format.raw/*92.7*/("""}"""),format.raw/*92.8*/(""" """),format.raw/*92.9*/("""else """),format.raw/*92.14*/("""{"""),format.raw/*92.15*/("""
        """),format.raw/*93.9*/("""// The person is not logged into Facebook, so we're not sure if
        // they are logged into this app or not.
        document.getElementById('click').disabled=true;
        document.getElementById('status').innerHTML = 'Please log ' +
          'into Facebook.';
      """),format.raw/*98.7*/("""}"""),format.raw/*98.8*/("""
    """),format.raw/*99.5*/("""}"""),format.raw/*99.6*/("""

    """),format.raw/*101.5*/("""function checkLoginState() """),format.raw/*101.32*/("""{"""),format.raw/*101.33*/("""
      """),format.raw/*102.7*/("""FB.getLoginStatus(function(response) """),format.raw/*102.44*/("""{"""),format.raw/*102.45*/("""
        """),format.raw/*103.9*/("""statusChangeCallback(response);
        
      """),format.raw/*105.7*/("""}"""),format.raw/*105.8*/(""");
    """),format.raw/*106.5*/("""}"""),format.raw/*106.6*/("""

    """),format.raw/*108.5*/("""window.fbAsyncInit = function() """),format.raw/*108.37*/("""{"""),format.raw/*108.38*/("""
    """),format.raw/*109.5*/("""FB.init("""),format.raw/*109.13*/("""{"""),format.raw/*109.14*/("""
      """),format.raw/*110.7*/("""appId      : '445566152294840',
      cookie     : true,  // enable cookies to allow the server to access 
                          // the session
      xfbml      : true,  // parse social plugins on this page
      version    : 'v2.5' // use version 2.2
    """),format.raw/*115.5*/("""}"""),format.raw/*115.6*/(""");

    FB.getLoginStatus(function(response) """),format.raw/*117.42*/("""{"""),format.raw/*117.43*/("""
      """),format.raw/*118.7*/("""statusChangeCallback(response);
    """),format.raw/*119.5*/("""}"""),format.raw/*119.6*/(""");
    """),format.raw/*120.5*/("""}"""),format.raw/*120.6*/(""";

    // Load the SDK asynchronously
    (function(d, s, id) """),format.raw/*123.25*/("""{"""),format.raw/*123.26*/("""
      """),format.raw/*124.7*/("""var js, fjs = d.getElementsByTagName(s)[0];
      if (d.getElementById(id)) return;
      js = d.createElement(s); js.id = id;
      js.src = "//connect.facebook.net/en_US/sdk.js";
      fjs.parentNode.insertBefore(js, fjs);
    """),format.raw/*129.5*/("""}"""),format.raw/*129.6*/("""(document, 'script', 'x-jssdk'));
    
    function CheckUser() """),format.raw/*131.26*/("""{"""),format.raw/*131.27*/("""
      """),format.raw/*132.7*/("""console.log('Welcome!  Fetching your information.... ');
      FB.api('/me', function(response) """),format.raw/*133.40*/("""{"""),format.raw/*133.41*/("""
        """),format.raw/*134.9*/("""console.log('Successful login for: ' + response.name);
        console.log(response);
        var request = new XMLHttpRequest();
        request.onload = reqListener;
        request.open("POST", "Registration", true);
        var obj = new Object();
        obj.id = response.id;
        obj.first_name = response.first_name;
        obj.last_name = response.last_name;
        obj.email = response.email;
        obj.accessToken = accessToken;
        var jsonString= JSON.stringify(obj);
        console.log(jsonString);
        request.send(jsonString);
      """),format.raw/*148.7*/("""}"""),format.raw/*148.8*/(""");
    """),format.raw/*149.5*/("""}"""),format.raw/*149.6*/("""
    """),format.raw/*150.5*/("""</script>              
    

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
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Sun Dec 20 12:29:16 EST 2015
                  SOURCE: /Users/ydrtc/ase_final/WorldKing/WorldKing/ResuMate/app/views/login.scala.html
                  HASH: 427118fb36ce6002d04a4cc65f1d54dec24c4c7d
                  MATRIX: 745->1|857->18|884->19|1012->121|1026->127|1088->169|1164->219|1178->225|1249->275|1325->325|1339->331|1407->378|1483->428|1497->434|1588->504|1677->566|1692->572|1749->608|2456->1288|2484->1295|5036->3820|5064->3827|5306->4041|5335->4042|5369->4049|5512->4164|5541->4165|5576->4173|5725->4295|5753->4296|5781->4297|5856->4344|5885->4345|5921->4354|6165->4571|6193->4572|6221->4573|6254->4578|6283->4579|6319->4588|6619->4861|6647->4862|6679->4867|6707->4868|6741->4874|6797->4901|6827->4902|6862->4909|6928->4946|6958->4947|6995->4956|7070->5003|7099->5004|7134->5011|7163->5012|7197->5018|7258->5050|7288->5051|7321->5056|7358->5064|7388->5065|7423->5072|7711->5332|7740->5333|7814->5378|7844->5379|7879->5386|7943->5422|7972->5423|8007->5430|8036->5431|8127->5493|8157->5494|8192->5501|8449->5730|8478->5731|8571->5795|8601->5796|8636->5803|8761->5899|8791->5900|8828->5909|9421->6474|9450->6475|9485->6482|9514->6483|9547->6488
                  LINES: 27->1|32->1|33->2|37->6|37->6|37->6|38->7|38->7|38->7|39->8|39->8|39->8|40->9|40->9|40->9|44->13|44->13|44->13|59->28|59->28|100->69|100->69|110->79|110->79|111->80|114->83|114->83|115->84|118->87|118->87|118->87|118->87|118->87|119->88|123->92|123->92|123->92|123->92|123->92|124->93|129->98|129->98|130->99|130->99|132->101|132->101|132->101|133->102|133->102|133->102|134->103|136->105|136->105|137->106|137->106|139->108|139->108|139->108|140->109|140->109|140->109|141->110|146->115|146->115|148->117|148->117|149->118|150->119|150->119|151->120|151->120|154->123|154->123|155->124|160->129|160->129|162->131|162->131|163->132|164->133|164->133|165->134|179->148|179->148|180->149|180->149|181->150
                  -- GENERATED --
              */
          