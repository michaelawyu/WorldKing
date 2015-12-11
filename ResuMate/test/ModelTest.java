import java.util.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.google.common.annotations.VisibleForTesting;
import org.junit.*;

import play.mvc.*;
import play.test.*;
import play.data.DynamicForm;
import play.data.validation.ValidationError;
import play.data.validation.Constraints.RequiredValidator;
import play.i18n.Lang;
import play.libs.F;
import play.libs.F.*;
import play.twirl.api.Content;
import models.*;

import static play.test.Helpers.*;
import static org.junit.Assert.*;

/**
 * Created by MichaelAWYu on 12/2/15.
 */
public class ModelTest {

    @Before
    public void init() {
        start(fakeApplication(inMemoryDatabase()));
    }

    @Test
    public void JobCategoryAddTest() {
        new JobCategory("Category ID","Category Name","Description").save();
        JobCategory testCategory = JobCategory.find.byId("Category ID");
        assertNotNull(testCategory);
        assertEquals("Category Name",testCategory.jobCategoryName);
        assertEquals("Description",testCategory.jobCategoryDescription);
    }

    @Test
    public void ResumeListAddTest() {
        new ResumeList("Location","Resume ID","Resume Name").save();
        ResumeList testResumeList = ResumeList.find.byId("Resume ID");
        assertNotNull(testResumeList);
        assertEquals("Location",testResumeList.Location);
        assertEquals("Resume ID",testResumeList.resumeUniqueID);
        assertEquals("Resume Name",testResumeList.resumeName);
    }

    @Test
    public void UserAddTest() {
        new User("email@email.com","password").save();
        User testUser = User.find.byId("email@email.com");
        assertNotNull(testUser);
        assertEquals("email@email.com",testUser.email);
        assertEquals("password",testUser.password);
    }

    @Test
    public void CommentAndRatingTest() {
        Date date= new Date();
        new CommentAndRating("1","1",date,"Comment",1,"1").save();
        CommentAndRating testComment = CommentAndRating.find.byId("1");
        assertNotNull(testComment);
        assertEquals("1",testComment.userID);
        assertEquals(date,testComment.dateAndTime);
        assertEquals("Comment",testComment.content);
        assertEquals(1,testComment.rating);
        assertEquals("1",testComment.resumeID);
    }

    @Test
    public void CandRAvgMethodTestA() {
        Date date=new Date();
        new CommentAndRating("1","1",date,"Comment",5,"1").save();
        int avg = CommentAndRating.calculateAvgRating("1");
        assertEquals(5,avg);
    }

    @Test
    public void CandRAvgMethodTestB() {
        Date date=new Date();
        new CommentAndRating("1","1",date,"Comment",1,"1").save();
        new CommentAndRating("2","1",date,"Comment",5,"1").save();
        int avg = CommentAndRating.calculateAvgRating("1");
        assertEquals(3,avg);
    }

    @Test
    public void CandRAvgMethodTestC() {
        int avg = CommentAndRating.calculateAvgRating("1");
        assertEquals(0,avg);
    }

    @Test
    public void CandRAvgMethodTestD() {
        Date date=new Date();
        new CommentAndRating("1","1",date,"Comment",1,"1").save();
        new CommentAndRating("2","1",date,"Comment",5,"1").save();
        new CommentAndRating("3","1",date,"Comment",5,"1").save();
        int avg = CommentAndRating.calculateAvgRating("1");
        assertEquals(3,avg);
    }

    @Test
    public void renderTemplate() {
        Content html = views.html.index.render("Your new application is ready.");
        assertEquals("text/html", contentType(html));
        assertTrue(contentAsString(html).contains("Your new application is ready."));
    }
}

