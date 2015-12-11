package models;

import javax.persistence.*;
import com.avaje.ebean.*;

import java.util.Date;
import java.util.*;

@Entity
public class CommentAndRating extends Model {
    @Id
    public String uniqueCommentID;
    public String userID;
    public Date dateAndTime;
    public String content;
    public int rating;
    public String resumeID;

    public CommentAndRating (String uniqueCommentID, String userID, Date dateAndTime, String content, int rating, String resumeID)
    {
        this.uniqueCommentID=uniqueCommentID;
        this.userID=userID;
        this.dateAndTime=dateAndTime;
        this.content=content;
        this.rating=rating;
        this.resumeID=resumeID;
    }

    public static Finder<String,CommentAndRating> find = new Finder<String,CommentAndRating>(
            String.class,CommentAndRating.class
    );

    public static int calculateAvgRating(String resumeID) {
        List<CommentAndRating> allList = CommentAndRating.find.where().eq("resumeID",resumeID).findList();
        if (allList==null)
        {
            return 0;
        }
        if (allList.size()==0)
        {
            return 0;
        }
        int i=0;
        int sum=0;
        for (;i<allList.size();i++){
            sum = sum + allList.get(i).rating;
        }
        return sum/(allList.size());

    }
}
