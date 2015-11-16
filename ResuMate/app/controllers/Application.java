package controllers;

import models.*;
import play.*;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import com.avaje.ebean.*;
import play.data.*;

import views.html.*;
import it.innove.play.pdf.PdfGenerator;

import java.util.List;

public class Application extends Controller {

    final static Form<Template> templateForm = Form.form(Template.class);

    public Result viewResume() {
        return ok(views.html.viewresume.render());
    }

    public Result displayResumeList() {
        //new ResumeList("1","1","Elegant").save();
        Form<UserSelection> selForm = Form.form(UserSelection.class).bindFromRequest();
        UserSelection curSelection = selForm.get();
        List<ResumeList> allList = ResumeList.find.where().eq("Location",curSelection.checked).findList();

        return ok(views.html.resumelist.render(allList));
    }

    public Result displayJobCategory() {
        //new JobCategory("1","Computer Engineer","Code. Code. Code.").save();
        List<JobCategory> allList = JobCategory.find.all();
        return ok(views.html.jobcategory.render(allList));
    }

    public Result loginx() {
        return ok(views.html.login.render(" "));
    }

    public Result registrationx() {
        return ok(views.html.registration.render(" "));
    }

    public Result registration() {
        Form<UserCredential> regForm = Form.form(UserCredential.class).bindFromRequest();
        UserCredential regUserCredential = regForm.get();
        if (User.find.where().eq("email",regUserCredential.email).findUnique()==null)
        {
            new User(regUserCredential.email,regUserCredential.password).save();
        }
        else
        {
            return ok(views.html.registration.render("Error: User Already Exists."));
        }
        return redirect(routes.Application.index());
    }

    public Result login() {
        Form<UserCredential> loginForm = Form.form(UserCredential.class).bindFromRequest();
        UserCredential loginUserCredential = loginForm.get();
        if (models.User.find.where().eq("email",loginUserCredential.email).eq("password",loginUserCredential.password).findUnique() == null)
        {
            return ok(views.html.login.render("Email Address and/or Password is Incorrect."));
        }
        else
        {
            session().clear();
            session("email",loginForm.get().email);
            return redirect(routes.Application.index());
        }
    }

    public Result index() {

            return ok(homepage.render());

    }

    public Result genRes() {
        return ok(genRes.render("Resumate: Build Your Own Resume"));
    }

    public Result pdfViewer() {
        Form<Template> filledTemplate = templateForm.bindFromRequest();
        Template newResume = filledTemplate.get();
        return newResume.renderPDF("1");

    }


}
