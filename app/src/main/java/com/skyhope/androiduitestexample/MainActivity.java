package com.skyhope.androiduitestexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText editTextName;
    Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
         * Sow we are now testing our UI
         * PLEASE OPEN @androidTest@ package and see the " MainActivityTest.class " class
         * */

        /*
         * Remember Test class will be in the same package where the main class locate.
         * Example:
         * Here the main class (MainActivity.java) locate in " com.skyhope.androiduitestexample" package
         * So the test class (UI test) will locate in androidTest directory. with " com.skyhope.androiduitestexample"
         * same package
         * */

        /*
         * You can write more testCase in same test class.
         * See the test class
         * */


        // Here we init our view element . I just avoid databinding

        editTextName = findViewById(R.id.editTextName);
        buttonSubmit = findViewById(R.id.buttonSubmit);
        buttonSubmit.setOnClickListener(this);

    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.buttonSubmit:
                showEditTextName();
                break;
        }
    }

    // We will test this method
    private void showEditTextName() {
        if (editTextName.getText().toString().trim().length() > 0) {
            Toast.makeText(this, editTextName.getText().toString().trim(), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Name Cannot be empty", Toast.LENGTH_SHORT).show();
        }
    }

    public boolean isValidName(String text) {
        return !TextUtils.isEmpty(text);
    }
}
