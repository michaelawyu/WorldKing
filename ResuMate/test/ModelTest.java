import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    public void renderTemplate() {
        Content html = views.html.index.render("Your new application is ready.");
        assertEquals("text/html", contentType(html));
        assertTrue(contentAsString(html).contains("Your new application is ready."));
    }
}

