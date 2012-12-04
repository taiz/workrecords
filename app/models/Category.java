package models;

import java.util.*;
import javax.persistence.*;

import play.db.ebean.*;
import play.data.validation.*;

@SuppressWarnings("serial")
@Entity 
public class Category extends Model {

    @Id
    public Long id;
    
    @Constraints.Required
    public String name;
    
    //@OneToMany
    //public List<Category> categories;
    
    /**
     * Generic query helper for entity Computer with id Long
     */
    public static Finder<Long,Category> find = new Finder<Long,Category>(Long.class, Category.class); 

    public static List<Category> all() {
        return find.all();
    }
    
    public static void create(Category category) {
    	category.save();
    }
    
    public static void delete(Long id) {
        find.ref(id).delete();
    }
    
    public static Map<String,String> options() {
        LinkedHashMap<String,String> options = new LinkedHashMap<String,String>();
        for(Category c: Category.find.orderBy("id").findList()) {
            options.put(c.id.toString(), c.name);
        }
        return options;
    }
}
