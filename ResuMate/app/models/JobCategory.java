package models;

import javax.persistence.*;
import com.avaje.ebean.*;


/**
 * Created by MichaelAWYu on 11/16/15.
 */
@Entity
public class JobCategory extends Model{

    public String jobCategoryID;
    @Id
    public String jobCategoryName;
    public String jobCategoryDescription;

    public JobCategory(String jobCategoryID, String jobCategoryName, String jobCategoryDescription) {
        this.jobCategoryID=jobCategoryID;
        this.jobCategoryName=jobCategoryName;
        this.jobCategoryDescription=jobCategoryDescription;
    }

    public static Finder<String,JobCategory> find = new Finder<String,JobCategory>(
            String.class,JobCategory.class
    );
}

