package com.skyhope.androiduitestexample;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.app.PendingIntent.getActivity;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.RootMatchers.withDecorView;
import static android.support.test.espresso.matcher.ViewMatchers.isDisplayed;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.*;

/*
 *  ****************************************************************************
 *  * Created by : Md Tariqul Islam on 11/2/2018 at 4:15 PM.
 *  * Email : tariqul@w3engineers.com
 *  *
 *  * Purpose: To test all element of UI
 *  *
 *  * Last edited by : Md Tariqul Islam on 11/2/2018.
 *  *
 *  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>
 *  ****************************************************************************
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    /*
     * This is main thing for testing a class. You have to set a Rule. It indicate which class you want to test.
     * Here this is MainActivity.
     * By this rule this activity will launch when we execute test
     * And also this object is used to access view element
     * */

    @Rule
    public ActivityTestRule<MainActivity> activityRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    /*
     * Below two method needs if want some DB (Database) or network operation and we need setup some
     * important things like DB connection established or DB close.
     * But now we are not use it
     * */

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    /*
     * Now we are test our method "showEditTextName()". To check name is shown Properly or not.
     *
     * */

    @Test
    public void showEditTextName() {
        // now write in edit text
        onView(withId(R.id.editTextName)).perform(typeText("Tariqul"));

        delay(500);

        // now press b Button

        onView(withId(R.id.buttonSubmit)).perform(click());

        // now check toast is properly showing or not
        onView(withText("Tariqul")).inRoot(withDecorView(not(is(activityRule.getActivity().getWindow().getDecorView())))).check(matches(isDisplayed()));

    }

    @Test
    public void showEditTextErrorName() {
        // now write in edit text
        onView(withId(R.id.editTextName)).perform(typeText(""));

        delay(500);

        // now press b Button

        onView(withId(R.id.buttonSubmit)).perform(click());

        // now check toast is properly showing or not
        onView(withText("Name Cannot be empty")).inRoot(withDecorView(not(is(activityRule.getActivity().getWindow().getDecorView())))).check(matches(isDisplayed()));

    }

    private void delay(long item) {
        try {
            Thread.sleep(item);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}