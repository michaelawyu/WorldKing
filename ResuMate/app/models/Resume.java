package models;
import controllers.*;

import java.util.*;
import it.innove.play.pdf.PdfGenerator;
import javax.persistence.*;
import com.avaje.ebean.*;
import play.*;
import play.mvc.*;
import play.data.*;

import views.html.*;

@Entity
public class Resume extends Model {

	@Id
	public String fullName;
	public String emailAddress;
	public String phoneNo;
	public String street;
	public String city;
	public String zip;

	public String schooladd1;
	public String dateRange1;
	public String schoolName1;
	public String schoolTitle1;
	public String schooladd2;
	public String dateRange2;
	public String schoolName2;
	public String schoolTitle2;
	public String schooladd3;
	public String dateRange3;
	public String schoolName3;
	public String schoolTitle3;

	public String expadd1;
	public String dateRangeExp1;
	public String expName1;
	public String expDesc1;
	public String expadd2;
	public String dateRangeExp2;
	public String expName2;
	public String expDesc2;
	public String expadd3;
	public String dateRangeExp3;
	public String expName3;
	public String expDesc3;

	public Resume(String fullName, String emailAddress, String phoneNo, String street, String city, String zip, 
		String schooladd1, String dateRange1, String schoolName1, String schoolTitle1, String schooladd2, String dateRange2, String schoolName2, String schoolTitle2, String schooladd3, String dateRange3, String schoolName3, String schoolTitle3, 
		String expadd1, String dateRangeExp1, String expName1, String expDesc1, String expadd2, String dateRangeExp2, String expName2, String expDesc2, String expadd3, String dateRangeExp3, String expName3, String expDesc3) {
	this.fullName = fullName;
	this.emailAddress = emailAddress;
	this.phoneNo = phoneNo;
	this.street = street;
	this.city = city;
	this.zip = zip;

	this.schooladd1 = schooladd1;
	this.dateRange1 = dateRange1;
	this.schoolName1 = schoolName1;
	this.schoolTitle1 = schoolTitle1;
	this.schooladd2 = schooladd2;
	this.dateRange2 = dateRange2;
	this.schoolName2 = schoolName2;
	this.schoolTitle2 = schoolTitle2;
	this.schooladd3 = schooladd3;
	this.dateRange3 = dateRange3;
	this.schoolName3 = schoolName3;
	this.schoolTitle3 = schoolTitle3;

	this.expadd1 = expadd1;
	this.dateRangeExp1 = dateRangeExp1;
	this.expName1 = expName1;
	this.expDesc1 = expDesc1;
	this.expadd2 = expadd2;
	this.dateRangeExp2 = dateRangeExp2;
	this.expName2 = expName2;
	this.expDesc2 = expDesc2;
	this.expadd3 = expadd3;
	this.dateRangeExp3 = dateRangeExp3;
	this.expName3 = expName3;
	this.expDesc3 = expDesc3;
	}

	//public Result renderPDF() {
		//PdfGenerator pdf = new PdfGenerator();
		//if (this != null) {
			//return pdf.ok(resumedisplay.render(this), "http://localhost:9000/");
		//}
		//return play.mvc.Results.ok("Oops. Template is missing.");
	//}
}
