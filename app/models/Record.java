package models;

import java.util.*;

import javax.persistence.*;

import play.Logger;
import play.db.ebean.*;
import play.data.format.*;
import play.data.validation.*;

import com.avaje.ebean.*;

@SuppressWarnings("serial")
@Entity 
public class Record extends Model {

    @Id
    public Long id;
     
    @Formats.DateTime(pattern="yyyy-MM-dd hh:mm")
    public Date startTime;
    
    @Formats.DateTime(pattern="yyyy-MM-dd hh:mm")
    public Date endTime;
    
    public Long elapseTime;

    @Constraints.Required
    @ManyToOne
    public Category category;

    @Constraints.Required
    public String item;
    
    /**
     * Generic query helper for entity Computer with id Long
     */
    public static Finder<Long,Record> find = new Finder<Long,Record>(Long.class, Record.class); 

    public static Page<Record> page(int page, int pageSize, String sortBy, String order) {
        return 
            find.where()
                //.ilike("item", "%" + filter + "%")
                .orderBy(sortBy + " " + order)
                .fetch("category")
                .findPagingList(pageSize)
                .getPage(page);
    }
    
    public void start() {
    	startTime = new Date();
    	save();
    }

    public void stop() {
    	endTime = new Date();
    	update();
    }
    
    public void update() {
    	Calendar cs = Calendar.getInstance();
    	cs.setTime(startTime);
    	Calendar ce = Calendar.getInstance();
    	ce.setTime(endTime);
    	elapseTime = (ce.getTimeInMillis() - cs.getTimeInMillis()) / 60000;
    	if (elapseTime < 0)
    		elapseTime = 0L;
    	Logger.info(this.id.toString());
    	update(this.id);
    }
}
