package com.alikaraoglan.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;
    EditText editText2;
    TextView ResultText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         editText = (EditText) findViewById(R.id.editText);
         editText2 = (EditText) findViewById(R.id.editText2);
         ResultText =(TextView) findViewById(R.id.textView);


    }

    public void add(View view){

        if(editText.getText().toString().matches("")|| editText2.getText().toString().matches("") ){
            ResultText.setText("sayı girilmedi");

        }

        else{
            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());

            int resultText = a + b;

            ResultText.setText("Result:" + resultText);
        }


    }

    public void sub(View view){
        if(editText.getText().toString().matches("")|| editText2.getText().toString().matches("") ){
            ResultText.setText("sayı girilmedi");

        }

        else{
            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());

            int resultText = a - b;

            ResultText.setText("Result:" + resultText);
        }



    }

    public void multiply(View view){
        if(editText.getText().toString().matches("")|| editText2.getText().toString().matches("") ){
            ResultText.setText("sayı girilmedi");

        }

        else{
            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());

            int resultText = a * b;

            ResultText.setText("Result:" + resultText);
        }


    }

    public void divide(View view){
        if(editText.getText().toString().matches("")|| editText2.getText().toString().matches("") ){
            ResultText.setText("sayı girilmedi");

        }

        else{
            int a = Integer.parseInt(editText.getText().toString());
            int b = Integer.parseInt(editText2.getText().toString());

            int resultText = a / b;

            ResultText.setText("Result:" + resultText);


        }



    }


}
