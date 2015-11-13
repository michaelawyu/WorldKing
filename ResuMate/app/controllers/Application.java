package controllers;

import play.*;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;

import models.Template;

import views.html.*;
import it.innove.play.pdf.PdfGenerator;

public class Application extends Controller {

    final static Form<Template> templateForm = Form.form(Template.class);

    public Result index() {
        return ok(index.render("Open http://localhost:9000/genRes to See the Module"));

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
