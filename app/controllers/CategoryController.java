package controllers;

import models.Record;

import play.data.Form;
import play.mvc.Controller;
import play.mvc.Result;

import views.html.*;
import models.*;

public class CategoryController extends Controller {

	static Form<Category> cateForm = form(Category.class);

    public static Result index() {
        return ok(
        	categoryIndex.render(Category.all())
        );
    }

    public static Result _new() {
        return ok(
        	categoryNew.render(cateForm)
        );
    }

    public static Result create() {
        Form<Category> filledForm = form(Category.class).bindFromRequest();
        if (filledForm.hasErrors()) {
        	return badRequest(
        		categoryNew.render(cateForm)
            );
          } else {
        	Category.create(filledForm.get());
            return redirect(routes.CategoryController.index());  
          }
    }
    
    public static Result delete(Long id) {
        Category.delete(id);
        return redirect(routes.CategoryController.index());
    }
}
