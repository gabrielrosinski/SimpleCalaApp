package com.simplecalaapp.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickFunction(View view){

        EditText num1EditText = (EditText) findViewById(R.id.editText1);
        EditText num2EditText = (EditText) findViewById(R.id.editText2);

//        Log.i( "info","Button pressed !");
//
//        Log.i("Values", num1EditText.getText().toString());

        Integer firstNum = Integer.valueOf(num1EditText.getText().toString());
        Integer secondNum = Integer.valueOf(num2EditText.getText().toString());

        Integer sum = firstNum + secondNum;

        Intent i = new Intent(this, SecondActivity.class);
        i.putExtra("msg",sum);
        startActivity(i);

    }



}
