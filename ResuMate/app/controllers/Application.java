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
        new ResumeList("1","1","Elegant").save();
        Form<ResumeList> select = Form.form(ResumeList.class).bindFromRequest();
        List<ResumeList> allList = ResumeList.find.where().eq("Location",select.get().checked).findList();

        return ok(views.html.resumelist.render(allList));
    }

    public Result displayJobCategory() {
        new JobCategory("1","Work","Code. Code. Code.").save();
        new JobCategory("2","Life","Code. Code. Code.").save();
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
        Form<User> regForm = Form.form(User.class).bindFromRequest();
        //UserCredential regUserCredential = regForm.get();
        if (User.find.where().eq("email",regForm.get().email).findUnique()==null)
        {
            new User(regForm.get().email,regForm.get().password).save();
        }
        else
        {
            return ok(views.html.registration.render("Error: User Already Exists."));
        }
        return redirect(routes.Application.index());
    }

    public Result login() {
        Form<User> loginForm = Form.form(User.class).bindFromRequest();
        //UserCredential loginUserCredential = loginForm.get();
        if (models.User.find.where().eq("email",loginForm.get().email).eq("password",loginForm.get().password).findUnique() == null)
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
