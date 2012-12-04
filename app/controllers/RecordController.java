package controllers;

import java.util.Date;

import models.*;
import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;
import play.templates.ScalaTemplateCompiler.Params;

import play.Logger;

public class RecordController extends Controller {
  
    public static Result GO_HOME = redirect(
            routes.RecordController.list(0, "startTime", "asc")
        );
    
    public static Result index() {
        return GO_HOME;
        //return ok(index.render("Your new application is ready."));
    }

    public static Result list(int page, String sortBy, String order) {
    	//return ok("dudada");
    	return ok(
           views.html.list.render(
                Record.page(page, 10, sortBy, order),
                sortBy, order
            )
        );
    }

    public static Result edit(Long id) {
        Form<Record> recordForm = form(Record.class).fill(
        		Record.find.byId(id)
            );
            return ok(
                views.html.editForm.render(id, recordForm)
            );
    }

    public static Result update(Long id) {
        Form<Record> recordForm = form(Record.class).bindFromRequest();
        if(recordForm.hasErrors()) {
            return badRequest(views.html.editForm.render(id, recordForm));
        }
        Record record = recordForm.get();
        record.id = id;
        record.update();
        flash("success", "Record " + recordForm.get().item + " has been updated");
        return GO_HOME;
    }

    public static Result create() {
        Form<Record> recordForm = form(Record.class);
        return ok(
        	views.html.createForm.render(recordForm)
        );
    }
    
    public static Result start() {
        Form<Record> recordForm = form(Record.class).bindFromRequest();
        Record record = recordForm.get();
        record.start();
        flash("success", "Record " + record.item + " has been started");
        return GO_HOME;
    }
    
    public static Result stop(Long id) {
        Record record = Record.find.byId(id);
        record.stop();
        flash("success", "Record " + record.item + " has been started");
        return GO_HOME;
    }
    
    public static Result delete(Long id) {
    	Record.find.ref(id).delete();
        flash("success", "Computer has been deleted");
        return GO_HOME;
    }

}
