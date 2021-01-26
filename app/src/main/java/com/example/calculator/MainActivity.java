package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentProviderClient;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText num1;
    private EditText num2;
    private Button add,sub,div,mult;
    private EditText result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        num1 = (EditText)findViewById(R.id.editText1);
        num2 = (EditText)findViewById(R.id.editText2);
        add = (Button)findViewById(R.id.add_button);
        sub = (Button)findViewById(R.id.subt_button);
        div = (Button)findViewById(R.id.div_button);
        mult = (Button)findViewById(R.id.multi_button);
        result = (EditText)findViewById(R.id.answer);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int activity1 =number1 + number2;
                result.setText("Answer: " +String.valueOf(activity1));
            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int activity2 =number1 - number2;
                result.setText("Answer: " +String.valueOf(activity2));
            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int activity3=number1 / number2;
                result.setText("Answer: " +String.valueOf(activity3));
            }
        });

        mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int number1 = Integer.parseInt(num1.getText().toString());
                int number2 = Integer.parseInt(num2.getText().toString());
                int activity4=number1 * number2;
                result.setText("Answer: " +String.valueOf(activity4));
            }
        });
    }
}