package models;
import it.innove.play.pdf.PdfGenerator;
import play.mvc.Http.Status.*;
import play.mvc.*;
import views.html.*;

public class Template {
    public String templateIndex;
    public String firstName;
    public String lastName;
    public String emailAddress;
    public String mobileNo;
    public String address;
    public String eduExp;
    public String workExp;

    public Result renderPDF(String index) {
        PdfGenerator newResume = new PdfGenerator();
        if (index == "1") {
            return newResume.ok(views.html.basictemplate.render(firstName, lastName, emailAddress, mobileNo, address, eduExp, workExp), "http://localhost:9000/");
        }
        return play.mvc.Results.ok("Oops. Template is missing.");
    }
}
