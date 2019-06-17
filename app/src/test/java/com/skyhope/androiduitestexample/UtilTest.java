package com.skyhope.androiduitestexample;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/*
 *  ****************************************************************************
 *  * Created by : Md Tariqul Islam on 6/17/2019 at 1:02 PM.
 *  * Email : tariqul@w3engineers.com
 *  *
 *  * Purpose:
 *  *
 *  * Last edited by : Md Tariqul Islam on 6/17/2019.
 *  *
 *  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>
 *  ****************************************************************************
 */


public class UtilTest {

    private Util util;

    @Before
    public void setup() {
        util = new Util("Hello");
    }

    @Test
    public void sampleTest() {
        assertTrue(util.isValidName());
    }
}