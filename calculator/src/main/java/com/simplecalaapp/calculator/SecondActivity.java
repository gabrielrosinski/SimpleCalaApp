package com.simplecalaapp.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        Bundle extras = getIntent().getExtras();

        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText("The sum is: " + extras.get("msg"));

    }



}
