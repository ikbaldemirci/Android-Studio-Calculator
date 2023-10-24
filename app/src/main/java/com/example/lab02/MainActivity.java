package com.example.lab02;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity{

    private EditText inputN1,inputN2;
    private TextView txtResultIs, txtSumNumbers;
    private Button btnCalculate, btnResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        inputN1= findViewById(R.id.inputN1);
        inputN2= findViewById(R.id.inputN2);
        txtSumNumbers= findViewById(R.id.txtSumNumbers);
        txtResultIs= findViewById(R.id.txtResultIs);
        btnCalculate=findViewById(R.id.btnCalculate);
        btnResult=findViewById(R.id.btnResult);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(inputN1.getText().toString());
                int b = Integer.parseInt(inputN2.getText().toString());
                int c = a + b;
                txtResultIs.setText( "Result is: " + c);
            }
        });
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                inputN1.setText("");
                inputN2.setText("");
                txtResultIs.setText("Result is: ");
            }
        });
    }
}