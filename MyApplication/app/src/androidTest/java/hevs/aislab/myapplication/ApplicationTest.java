package hevs.aislab.myapplication;

import android.app.Application;
import android.test.ApplicationTestCase;

/**
 * <a href="http://d.android.com/tools/testing/testing_android.html">Testing Fundamentals</a>
 */
public class ApplicationTest extends ApplicationTestCase<Application> {
    public ApplicationTest() {
        super(Application.class);
    }

//    public void testFail(){
//        assertTrue(false);
//    }

    public void testPass(){
        assertTrue(true);
    }
}