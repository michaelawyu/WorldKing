package models;

import javax.persistence.*;
import com.avaje.ebean.*;
/**
 * Created by MichaelAWYu on 11/16/15.
 */
@Entity
public class ResumeList extends Model {


    public String Location;

    @Id
    public String resumeUniqueID;

    public String resumeName;
    public String checked;
    public String creator;

    public String content;
    public String firstName;
    public String lastName;
    public String phoneNo;
    public String emailAddr;
    public String workExp;
    public String eduExp;

    public String previewLocation;

    public ResumeList(String Location, String resumeUniqueID, String resumeName,String creator) {
        this.Location=Location;
        this.resumeUniqueID=resumeUniqueID;
        this.resumeName=resumeName;
        this.creator=creator;
        previewLocation="/assets/images/ResumePreviews/"+resumeUniqueID+".png";
    }

    public void contentSetter(String firstName,String lastName, String phoneNo, String emailAddr, String workExp, String eduExp) {
        this.firstName=firstName;
        this.lastName=lastName;
        this.phoneNo=phoneNo;
        this.emailAddr=emailAddr;
        this.workExp=workExp;
        this.eduExp=eduExp;
        this.content=firstName+" "+lastName+" "+phoneNo+" "+emailAddr+" "+workExp+" "+eduExp;

    }

    public static Finder<String,ResumeList> find = new Finder<String,ResumeList>(
            String.class,ResumeList.class
    );
}
