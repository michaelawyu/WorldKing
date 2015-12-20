package models;

import javax.persistence.*;
import com.avaje.ebean.*;


@Entity
public class JobCategory extends Model{

    @Id
    public String jobCategoryID;
    public String jobCategoryName;
    public String jobCategoryDescription;
    public String categoryType;
    public String iconLocation;

    public JobCategory(String jobCategoryID, String jobCategoryName, String jobCategoryDescription, String categoryType) {
        this.jobCategoryID=jobCategoryID;
        this.jobCategoryName=jobCategoryName;
        this.jobCategoryDescription=jobCategoryDescription;
        this.categoryType=categoryType;
        iconLocation="/assets/images/CategoryIcons/"+jobCategoryID+".png";
    }

    public static Finder<String,JobCategory> find = new Finder<String,JobCategory>(
            String.class,JobCategory.class
    );
}

