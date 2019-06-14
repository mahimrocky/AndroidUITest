package com.skyhope.androiduitestexample;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

/*
 *  ****************************************************************************
 *  * Created by : Md Tariqul Islam on 6/14/2019 at 1:00 PM.
 *  * Email : tariqul@w3engineers.com
 *  *
 *  * Purpose:
 *  *
 *  * Last edited by : Md Tariqul Islam on 6/14/2019.
 *  *
 *  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>
 *  ****************************************************************************
 */
@RunWith(MockitoJUnitRunner.class)
public class MainActivityTest {


    @Test
    public void sampleTest() {
        MainActivity activity = Mockito.mock(MainActivity.class);

        boolean value = activity.isValidName("Hello");

        verify(activity).isValidName("Hello");

    }
}