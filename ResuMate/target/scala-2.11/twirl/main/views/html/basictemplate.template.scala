
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object basictemplate_Scope0 {
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

class basictemplate extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template7[String,String,String,String,String,String,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(firstName: String)(lastName: String)(emailAddress: String)(mobileNo: String)(address: String)(workExp: String)(eduExp: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.129*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html>
<head>
	<title>Resume</title>
	<link rel="stylesheet" type="text/css" href=""""),_display_(/*6.48*/routes/*6.54*/.Assets.versioned("stylesheets/basictemplate.css")),format.raw/*6.104*/("""")>
</head>
<body>
	<div id="name">
		<h1 id="firstName">"""),_display_(/*10.23*/firstName),format.raw/*10.32*/("""</h1>
		<h1 id="lastName">"""),_display_(/*11.22*/lastName),format.raw/*11.30*/("""</h1>
	</div>
	<div id="contacts">
		<h1 id="address">"""),_display_(/*14.21*/address),format.raw/*14.28*/("""</h1>
		<h1 id="email">"""),_display_(/*15.19*/emailAddress),format.raw/*15.31*/("""</h1>
		<h1 id="tel">"""),_display_(/*16.17*/mobileNo),format.raw/*16.25*/("""</h1>
	</div>
	<div id="workexp">
		<h1 id="workexp">Work Experience</h1>
		<p id="workexp">"""),_display_(/*20.20*/workExp),format.raw/*20.27*/("""</p>
	</div>
	<div id="eduexp">
		<h1 id="eduexp">Education Experience</h1>
		<p id="eduexp">"""),_display_(/*24.19*/eduExp),format.raw/*24.25*/("""</p>
	</div>
</body>
</html>"""))
      }
    }
  }

  def render(firstName:String,lastName:String,emailAddress:String,mobileNo:String,address:String,workExp:String,eduExp:String): play.twirl.api.HtmlFormat.Appendable = apply(firstName)(lastName)(emailAddress)(mobileNo)(address)(workExp)(eduExp)

  def f:((String) => (String) => (String) => (String) => (String) => (String) => (String) => play.twirl.api.HtmlFormat.Appendable) = (firstName) => (lastName) => (emailAddress) => (mobileNo) => (address) => (workExp) => (eduExp) => apply(firstName)(lastName)(emailAddress)(mobileNo)(address)(workExp)(eduExp)

  def ref: this.type = this

}


}

/**/
object basictemplate extends basictemplate_Scope0.basictemplate
              /*
                  -- GENERATED --
                  DATE: Sun Dec 20 12:19:36 EST 2015
                  SOURCE: /Users/ydrtc/ase_final/WorldKing/WorldKing/ResuMate/app/views/basictemplate.scala.html
                  HASH: 2adc46234b70dd8fbf0b4b8b68f4024695700976
                  MATRIX: 803->1|1026->128|1053->129|1179->229|1193->235|1264->285|1349->343|1379->352|1433->379|1462->387|1544->442|1572->449|1623->473|1656->485|1705->507|1734->515|1854->608|1882->615|2003->709|2030->715
                  LINES: 27->1|32->1|33->2|37->6|37->6|37->6|41->10|41->10|42->11|42->11|45->14|45->14|46->15|46->15|47->16|47->16|51->20|51->20|55->24|55->24
                  -- GENERATED --
              */
          