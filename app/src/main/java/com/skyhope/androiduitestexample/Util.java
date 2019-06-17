package com.skyhope.androiduitestexample;

import android.text.TextUtils;
/*
 *  ****************************************************************************
 *  * Created by : Md Tariqul Islam on 6/17/2019 at 1:01 PM.
 *  * Email : tariqul@w3engineers.com
 *  *
 *  * Purpose:
 *  *
 *  * Last edited by : Md Tariqul Islam on 6/17/2019.
 *  *
 *  * Last Reviewed by : <Reviewer Name> on <mm/dd/yy>
 *  ****************************************************************************
 */


public class Util {
    String text;

    public Util(String text) {
        this.text = text;
    }

    public boolean isValidName() {
        return text.length() > 0;
    }
}
