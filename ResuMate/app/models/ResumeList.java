package models;

import javax.persistence.*;
import com.avaje.ebean.*;
/**
 * Created by MichaelAWYu on 11/16/15.
 */
@Entity
public class ResumeList extends Model {

    @Id
    public String Location;
    public String resumeUniqueID;
    public String resumeName;

    public ResumeList(String Location, String resumeUniqueID, String resumeName) {
        this.Location=Location;
        this.resumeUniqueID=resumeUniqueID;
        this.resumeName=resumeName;
    }

    public static Finder<String,ResumeList> find = new Finder<String,ResumeList>(
            String.class,ResumeList.class
    );
}
