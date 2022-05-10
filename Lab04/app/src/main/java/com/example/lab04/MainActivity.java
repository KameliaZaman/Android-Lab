package com.example.lab04;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub, buttonMul, buttonDiv, buttonDot, buttonEqual, buttonClear;
    EditText edtIn;
    float mValueOne, mValueTwo;
    boolean Addition, Subtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button0 = findViewById(R.id.btnZero);
        button1 = findViewById(R.id.btnOne);
        button2 = findViewById(R.id.btnTwo);
        button3 = findViewById(R.id.btnThree);
        button4 = findViewById(R.id.btnFour);
        button5 = findViewById(R.id.btnFive);
        button6 = findViewById(R.id.btnSix);
        button7 = findViewById(R.id.btnSeven);
        button8 = findViewById(R.id.btnEight);
        button9 = findViewById(R.id.btnNine);
        buttonDot = findViewById(R.id.btnDot);
        buttonAdd = findViewById(R.id.btnAdd);
        buttonSub = findViewById(R.id.btnSub);
        buttonMul = findViewById(R.id.btnMul);
        buttonDiv = findViewById(R.id.btnDiv);
        buttonEqual = findViewById(R.id.btnEqual);
        buttonClear = findViewById(R.id.btnClear);
        edtIn = findViewById(R.id.edt1);

        button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtIn.setText(edtIn.getText() + "0");
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtIn.setText(edtIn.getText() + "1");
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtIn.setText(edtIn.getText() + "2");
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtIn.setText(edtIn.getText() + "3");
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtIn.setText(edtIn.getText() + "4");
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtIn.setText(edtIn.getText() + "5");
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtIn.setText(edtIn.getText() + "6");
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtIn.setText(edtIn.getText() + "7");
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtIn.setText(edtIn.getText() + "8");
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtIn.setText(edtIn.getText() + "9");
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtIn.setText(edtIn.getText() + ".");
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtIn.setText(null);
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtIn == null)
                    edtIn.setText("");
                else {
                    mValueOne = Float.parseFloat(edtIn.getText() + "");
                    Addition = true;
                    edtIn.setText(null);
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(edtIn.getText() + "");
                Subtract = true;
                edtIn.setText(null);
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(edtIn.getText() + "");
                Multiplication = true;
                edtIn.setText(null);
            }
        });

        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = Float.parseFloat(edtIn.getText() + "");
                Division = true;
                edtIn.setText(null);
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueTwo = Float.parseFloat(edtIn.getText() + "");
                if (Addition == true) {
                    edtIn.setText(mValueOne + mValueTwo + "");
                    Addition = false;
                }
                if (Subtract == true) {
                    edtIn.setText(mValueOne - mValueTwo + "");
                    Subtract = false;
                }
                if (Multiplication == true) {
                    edtIn.setText(mValueOne * mValueTwo + "");
                    Multiplication = false;
                }
                if (Division == true) {
                    edtIn.setText(mValueOne / mValueTwo + "");
                    Division = false;
                }
            }
        });
    }
}