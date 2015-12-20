package models;

import java.util.List;

public class Utility {
    public String searchparam;
    public String Location;
    public static int counter=0;
    public static List<ResumeList> searchWithinCategory(String Location,String param){
        List<ResumeList> allList = ResumeList.find.where().eq("Location",Location).findList();
        return allList;
    }

    public static List<ResumeList> searchGlobal(String param){
        List<ResumeList> allList = ResumeList.find.where().contains("content",param).findList();

        return allList;
    }

    public static void init(){
        counter=counter+1;
        JobCategory computerScience = new JobCategory("1","Computer Science","Code. Code. Code.","1");
        computerScience.save();
        JobCategory interactiveDesign = new JobCategory("2","Interactive Design","So You Think You Can Draw Things","2");
        interactiveDesign.save();
        ResumeList elegant = new ResumeList("1","1","elegant","Resumate");
        elegant.contentSetter("Test","Test","123-456-7890","example@example.com","None","None");
        elegant.save();
        ResumeList bold = new ResumeList("1","2","bold","Resumate");
        bold.contentSetter("Bold","Bold","0987-654-321","abc@abc.com","None","Yes");
        bold.save();
        ResumeList creative = new ResumeList("2","3","creative","Resumate");
        creative.contentSetter("Creative","Creative","0000-111-222","creative@creative.com","None","Maybe");
        creative.save();


        return;
    }
}
