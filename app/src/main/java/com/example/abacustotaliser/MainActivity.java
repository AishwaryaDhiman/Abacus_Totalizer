package com.example.abacustotaliser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etFirstNumber,etSecondNumber;
    TextView result;
    Button add,subtract,multiply,divide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstNumber=findViewById(R.id.etFirstNumber);
        etSecondNumber=findViewById(R.id.etSecondNumber);
        result=findViewById(R.id.ans);
        add=findViewById(R.id.add);
        subtract=findViewById(R.id.subtract);
        multiply=findViewById(R.id.multiply);
        divide=findViewById(R.id.divide);

        add.setOnClickListener(new View.OnClickListener(){
        @Override
                public void onClick(View v){
            int firstValue,secondValue,ans;

            firstValue=Integer.parseInt(etFirstNumber.getText().toString());
            secondValue=Integer.parseInt(etSecondNumber.getText().toString());
            ans=firstValue+secondValue;
            result.setText(""+ans);
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                int firstValue,secondValue,ans;

                firstValue=Integer.parseInt(etFirstNumber.getText().toString());
                secondValue=Integer.parseInt(etSecondNumber.getText().toString());
                ans=firstValue-secondValue;
                result.setText(""+ans);
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long firstValue,secondValue,ans;

                firstValue=Long.parseLong(etFirstNumber.getText().toString());
                secondValue=Long.parseLong(etSecondNumber.getText().toString());

                ans=firstValue*secondValue;
                result.setText(""+ans);
            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double firstValue,secondValue;
                double ans;

                firstValue=Double.parseDouble(etFirstNumber.getText().toString());
                secondValue=Double.parseDouble(etSecondNumber.getText().toString());

                ans=firstValue/secondValue;
                result.setText(""+ans);
            }
        });


    }
}