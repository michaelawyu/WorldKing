package controllers;

import models.*;
import play.*;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import com.avaje.ebean.*;
import play.data.*;
import java.util.Date;
import views.html.*;
import it.innove.play.pdf.PdfGenerator;

import java.util.List;
import java.util.UUID;

public class Application extends Controller {

    int i = 0;
    final static Form<Template> templateForm = Form.form(Template.class);

    public Result viewResumex() {
        Form<CommentAndRating> select = Form.form(CommentAndRating.class).bindFromRequest();
        String username;
        if (session().isEmpty()==true) {
            username = "Guest";
        }
        else {
            username = session().get("email");
        }
        CommentAndRating newComment = new CommentAndRating(username,new Date(),select.get().content,select.get().rating,select.get().resumeID);
        newComment.save();
        String filename = "/assets/resume/" + newComment.resumeID + ".pdf";
        List<CommentAndRating> allCommentInfo = CommentAndRating.retrieveAllInfo(newComment.resumeID);
        String scoreInfo[] = CommentAndRating.collectRating(newComment.resumeID);
        if (session().isEmpty()) {
            return ok(views.html.viewresume.render(false,"",filename,newComment.resumeID,allCommentInfo,scoreInfo));
        } else {
            return ok(views.html.viewresume.render(true,session().get("email"),filename,newComment.resumeID,allCommentInfo,scoreInfo));
        }
    }
    public Result viewResume() {
        Form<ResumeList> select = Form.form(ResumeList.class).bindFromRequest();
        ResumeList selectResume = ResumeList.find.byId(select.get().checked);
        String filename = "/assets/resume/" + selectResume.resumeUniqueID + ".pdf";
        List<CommentAndRating> allCommentInfo = CommentAndRating.retrieveAllInfo(selectResume.resumeUniqueID);
        String[] scoreInfo = CommentAndRating.collectRating(selectResume.resumeUniqueID);
        if (session().isEmpty()) {
            return ok(views.html.viewresume.render(false,"",filename,selectResume.resumeUniqueID,allCommentInfo,scoreInfo));
        } else {
            return ok(views.html.viewresume.render(true,session().get("email"),filename,selectResume.resumeUniqueID,allCommentInfo,scoreInfo));
        }

    }

    public Result displayResumeList() {
        if (i==1) {
            new ResumeList("1", "1", "Elegant").save();
            i=2;
        }

        Form<ResumeList> select = Form.form(ResumeList.class).bindFromRequest();
        List<ResumeList> allList = ResumeList.find.where().eq("Location",select.get().checked).findList();

        if (session().isEmpty()) {
            return ok(views.html.resumelist.render(false,"",allList));
        } else {
            return ok(views.html.resumelist.render(true,session().get("email"),allList));
        }

    }

    public Result displayJobCategory() {
        if (i==0) {
            //new JobCategory("1","Work","Code. Code. Code.").save();
            //new JobCategory("2","Life","Code. Code. Code.").save();
            i=1;
        }
        List<JobCategory> allList = JobCategory.find.all();
        if (session().isEmpty()) {
            return ok(views.html.jobcategory.render(false,"",allList));
        } else {
            return ok(views.html.jobcategory.render(true,session().get("email"),allList));
        }

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
        Http.Session session = session();
        if (session.isEmpty())
        {
            Boolean loginStatus = false;
            return ok(homepage.render(loginStatus,""));
        }
        else {
            Boolean loginStatus = true;
            return ok(homepage.render(loginStatus,session.get("email")));
        }
    }

    public Result genRes() {
        if (session().isEmpty()) {
            return ok(genRes.render(false,"","Resumate: Build Your Own Resume"));
        } else {
            return ok(genRes.render(true,session().get("email"),"Resumate: Build Your Own Resume"));
        }

    }

	public Result handleForm() {
		Form<Resume> inputForm = Form.form(Resume.class).bindFromRequest();
		//Resume newRes = Resume.initialize(
				//inputForm.get().fullName,
				//inputForm.get().emailAddress,
				//inputForm.get().phoneNo,
				//inputForm.get().street,
				//inputForm.get().city,
				//inputForm.get().zip,
				//inputForm.get().schooladd1,
				//inputForm.get().dateRange1,
				//inputForm.get().schoolName1,
				//inputForm.get().schoolTitle1
				//);
				return ok(genRes.render(true,session().get("email"),"Resumate: Build Your Own Resume"));
	}

    public Result pdfViewer() {
        Form<Template> filledTemplate = templateForm.bindFromRequest();
        Template newResume = filledTemplate.get();
        return newResume.renderPDF("1");

    }
    public Result logoff() {
        session().clear();
        return ok(homepage.render(false,""));
    }


}
