package models;

import javax.persistence.*;
import javax.xml.stream.events.Comment;

import com.avaje.ebean.*;

import java.util.Date;
import java.util.*;
import java.util.UUID;

@Entity
public class CommentAndRating extends Model {
    @Id
    public UUID uniqueCommentID;
    public String userID;
    public Date dateAndTime;
    public String dateAndTimeTran;
    public String content;
    public int rating;
    public String resumeID;

    public CommentAndRating (String userID, Date dateAndTime, String content, int rating, String resumeID)
    {
        this.uniqueCommentID=UUID.randomUUID();
        this.userID=userID;
        this.dateAndTime=dateAndTime;
        this.content=content;
        this.rating=rating;
        this.resumeID=resumeID;
        this.dateAndTimeTran=dateAndTime.toString();
    }

    public static Finder<String,CommentAndRating> find = new Finder<String,CommentAndRating>(
            String.class,CommentAndRating.class
    );

    public static String[] collectRating(String resumeID) {
        List<CommentAndRating> allList = CommentAndRating.find.where().eq("resumeID",resumeID).findList();
        //Marker,AvgRating,# of ratings, # of 5/4/3/2/1-star ratings
        String result[]={"0","0.0","0","0","0","0","0","0"};
        if (allList==null)
        {
            return result;
        }
        if (allList.size()==0)
        {
            return result;
        }
        int i=0;
        int sum=0;
        for (;i<allList.size();i++){
            sum = sum + allList.get(i).rating;
        }
        double avg=(double)sum/(double)allList.size();
        result[1]=String.format("%.1f",avg);
        result[2]=String.format("%d",allList.size());
        result[3]=String.format("%d",CommentAndRating.find.where().eq("resumeID",resumeID).eq("rating","5").findList().size());
        result[4]=String.format("%d",CommentAndRating.find.where().eq("resumeID",resumeID).eq("rating","4").findList().size());
        result[5]=String.format("%d",CommentAndRating.find.where().eq("resumeID",resumeID).eq("rating","3").findList().size());
        result[6]=String.format("%d",CommentAndRating.find.where().eq("resumeID",resumeID).eq("rating","2").findList().size());
        result[7]=String.format("%d",CommentAndRating.find.where().eq("resumeID",resumeID).eq("rating","1").findList().size());
        return result;

    }

    public static List<CommentAndRating> retrieveAllInfo (String resumeID) {
        List<CommentAndRating> allList = CommentAndRating.find.where().eq("resumeID",resumeID).findList();
        return allList;

    }
}
