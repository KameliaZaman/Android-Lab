package com.example.scientificcalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button0, button1, button2, button3, button4, button5, button6, button7, button8, button9, buttonAdd, buttonSub, buttonMul, buttonDiv, buttonDot, buttonEqual, buttonClear, buttonPi, buttonXPowY, buttonSq, buttonSqrt, buttonMod, buttonOneByX, buttonSin, buttonCos, buttonTan, buttonLog, buttonLn, buttonTenPowX, buttonEPowX, buttonTwoPowX, buttonFact, buttonAbs;
    EditText edtIn;
    TextView txtOut;
    Double result, mValueOne, mValueTwo;
    boolean Addition, Subtract, Multiplication, Division, Modulus, Sine, Cosine, Tangent, Log, Ln, Sq, Sqrt, Power, TenPowX, TwoPowX, EPowX, Absolute, Factorial, OneByX;

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
        buttonPi = findViewById(R.id.btnPi);
        buttonXPowY = findViewById(R.id.btnPow);
        buttonSq = findViewById(R.id.btnSquare);
        buttonSqrt = findViewById(R.id.btnSquareRoot);
        buttonMod = findViewById(R.id.btnMod);
        buttonOneByX = findViewById(R.id.btnOneByX);
        buttonSin = findViewById(R.id.btnSin);
        buttonCos = findViewById(R.id.btnCos);
        buttonTan = findViewById(R.id.btnTan);
        buttonLog = findViewById(R.id.btnLog);
        buttonLn = findViewById(R.id.btnLn);
        buttonTenPowX = findViewById(R.id.btnTenPowX);
        buttonEPowX = findViewById(R.id.btnEPowX);
        buttonTwoPowX = findViewById(R.id.btnTwoPowX);
        buttonFact = findViewById(R.id.btnFactorial);
        buttonAbs = findViewById(R.id.btnAbsolute);
        edtIn = findViewById(R.id.edt1);
        txtOut = findViewById(R.id.txtView);

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

        buttonPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtIn.setText(edtIn.getText() + "3.1416");
            }
        });

        buttonClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mValueOne = 0.0;
                mValueTwo = 0.0;
                result = 0.0;
                edtIn.setText("");
                txtOut.setText("");
            }
        });

        buttonDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!edtIn.getText().toString().contains("."))
                    if (edtIn.getText().equals("")) {
                        edtIn.setText("0.");
                    } else {
                        edtIn.setText(edtIn.getText() + ".");
                    }
            }
        });

        buttonAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!edtIn.getText().equals("")) {
                    Addition = true;
                    mValueOne = Double.parseDouble(edtIn.getText().toString());
                    edtIn.setText("");
                    txtOut.setText(mValueOne + "+");
                }
            }
        });

        buttonSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!edtIn.getText().equals("")) {
                    Subtract = true;
                    mValueOne = Double.parseDouble(edtIn.getText().toString());
                    edtIn.setText("");
                    txtOut.setText(mValueOne + "-");
                }
            }
        });

        buttonMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!edtIn.getText().equals("")) {
                    Multiplication = true;
                    mValueOne = Double.parseDouble(edtIn.getText().toString());
                    edtIn.setText("");
                    txtOut.setText(mValueOne + "*");
                }
            }
        });
        buttonDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!edtIn.getText().equals("")) {
                    Division = true;
                    mValueOne = Double.parseDouble(edtIn.getText().toString());
                    edtIn.setText("");
                    txtOut.setText(mValueOne + "/");
                }
            }
        });

        buttonMod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!edtIn.getText().equals("")) {
                    Modulus = true;
                    mValueOne = Double.parseDouble(edtIn.getText().toString());
                    edtIn.setText("");
                    txtOut.setText(mValueOne + "%");
                }
            }
        });

        buttonSin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtIn.getText().equals("")) {
                    txtOut.setText("SIN(x)");
                    Sine = true;
                } else {
                    mValueOne = Double.parseDouble(edtIn.getText().toString());
                    result = Math.sin(mValueOne);
                    txtOut.setText("SIN(" + mValueOne + ")=");
                    edtIn.setText(String.valueOf(result));

                }
            }
        });

        buttonCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtIn.getText().equals("")) {
                    txtOut.setText("COS(x)");
                    Cosine = true;
                } else {
                    mValueOne = Double.parseDouble(edtIn.getText().toString());
                    result = Math.cos(mValueOne);
                    txtOut.setText("COS(" + mValueOne + ")=");
                    edtIn.setText(String.valueOf(result));

                }
            }
        });

        buttonTan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtIn.getText().equals("")) {
                    txtOut.setText("TAN(x)");
                    Tangent = true;
                } else {
                    mValueOne = Double.parseDouble(edtIn.getText().toString());
                    result = Math.tan(mValueOne);
                    txtOut.setText("TAN(" + mValueOne + ")=");
                    edtIn.setText(String.valueOf(result));

                }
            }
        });

        buttonLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtIn.getText().equals("")) {
                    txtOut.setText("log(x)");
                    Log = true;
                } else {
                    mValueOne = Double.parseDouble(edtIn.getText().toString());
                    result = Math.log10(mValueOne);
                    txtOut.setText("log(" + mValueOne + ")=");
                    edtIn.setText(String.valueOf(result));

                }
            }
        });

        buttonLn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtIn.getText().equals("")) {
                    txtOut.setText("ln(x)");
                    Ln = true;
                } else {
                    mValueOne = Double.parseDouble(edtIn.getText().toString());
                    result = Math.log(mValueOne);
                    txtOut.setText("ln(" + mValueOne + ")=");
                    edtIn.setText(String.valueOf(result));

                }
            }
        });

        buttonAbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtIn.getText().equals("")) {
                    txtOut.setText("|x|");
                    Absolute = true;
                } else {
                    mValueOne = Double.parseDouble(edtIn.getText().toString());
                    result = Math.abs(mValueOne);
                    txtOut.setText("abs(" + mValueOne + ")=");
                    edtIn.setText(String.valueOf(result));

                }
            }
        });

        buttonFact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtIn.getText().equals("")) {
                    txtOut.setText("N!");
                    Factorial = true;
                } else {
                    mValueOne = Double.parseDouble(edtIn.getText().toString());

                    result = factorial(mValueOne);
                    txtOut.setText("fact(" + mValueOne + ")=");
                    edtIn.setText(String.valueOf(result));

                }
            }
        });

        buttonOneByX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtIn.getText().equals("")) {
                    txtOut.setText("1/X");
                    OneByX = true;
                } else {
                    mValueOne = Double.parseDouble(edtIn.getText().toString());
                    result = 1 / mValueOne;
                    txtOut.setText("1/(" + mValueOne + ")=");
                    edtIn.setText(String.valueOf(result));

                }
            }
        });

        buttonSqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtIn.getText().equals("")) {
                    txtOut.setText("√(x)");
                    Sqrt = true;
                } else {
                    mValueOne = Double.parseDouble(edtIn.getText().toString());
                    result = Math.sqrt(mValueOne);
                    txtOut.setText("√(" + mValueOne + ")=");
                    edtIn.setText(String.valueOf(result));
                }
            }
        });

        buttonSq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtIn.getText().equals("")) {
                    txtOut.setText("X^2");
                    Sq = true;
                } else {
                    mValueOne = Double.parseDouble(edtIn.getText().toString());
                    result = mValueOne * mValueOne;
                    txtOut.setText(String.valueOf(mValueOne) + "^2");
                    edtIn.setText(String.valueOf(result));
                }
            }
        });

        buttonTenPowX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtIn.getText().equals("")) {
                    txtOut.setText("10^X");
                    TenPowX = true;
                } else {
                    mValueOne = Double.parseDouble(edtIn.getText().toString());
                    result = Math.pow(10, mValueOne);
                    txtOut.setText("10^" + String.valueOf(mValueOne));
                    edtIn.setText(String.valueOf(result));
                }
            }
        });

        buttonTwoPowX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtIn.getText().equals("")) {
                    txtOut.setText("2^X");
                    TwoPowX = true;
                } else {
                    mValueOne = Double.parseDouble(edtIn.getText().toString());
                    result = Math.pow(2, mValueOne);
                    txtOut.setText("2^" + String.valueOf(mValueOne));
                    edtIn.setText(String.valueOf(result));
                }
            }
        });

        buttonEPowX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (edtIn.getText().equals("")) {
                    txtOut.setText("e^X");
                    EPowX = true;
                } else {
                    mValueOne = Double.parseDouble(edtIn.getText().toString());
                    result = Math.pow(Math.E, mValueOne);
                    txtOut.setText("e^" + String.valueOf(mValueOne));
                    edtIn.setText(String.valueOf(result));
                }
            }
        });

        buttonXPowY.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!edtIn.getText().equals("")) {
                    mValueOne = Double.parseDouble(edtIn.getText().toString());
                    edtIn.setText("");
                    txtOut.setText(mValueOne + "pow");
                    Power = true;
                    txtOut.setText(String.valueOf(mValueOne) + "^");
                }
            }
        });

        buttonEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (!(txtOut.getText().equals("") && edtIn.getText().equals(""))) {
                    mValueTwo = Double.parseDouble(edtIn.getText().toString());
                    if (Addition == true) {
                        mValueOne = mValueOne + mValueTwo;
                        result = mValueOne;
                        txtOut.setText(txtOut.getText() + String.valueOf(mValueTwo));
                        edtIn.setText(String.valueOf(result));
                        Addition = false;
                    }

                    if (Subtract == true) {
                        mValueOne = mValueOne - mValueTwo;
                        result = mValueOne;
                        txtOut.setText(txtOut.getText() + String.valueOf(mValueTwo));
                        edtIn.setText(String.valueOf(result));
                        Subtract = false;
                    }

                    if (Multiplication == true) {
                        mValueOne = mValueOne * mValueTwo;
                        result = mValueOne;
                        txtOut.setText(txtOut.getText() + String.valueOf(mValueTwo));
                        edtIn.setText(String.valueOf(result));
                        Multiplication = false;
                    }

                    if (Division == true) {
                        mValueOne = mValueOne / mValueTwo;
                        result = mValueOne;
                        txtOut.setText(txtOut.getText() + String.valueOf(mValueTwo));
                        edtIn.setText(String.valueOf(result));
                        Division = false;
                    }
                    if (Modulus == true) {
                        mValueOne = mValueOne % mValueTwo;
                        result = mValueOne;
                        txtOut.setText(txtOut.getText() + String.valueOf(mValueTwo));
                        edtIn.setText(String.valueOf(result));
                        Modulus = false;
                    }

                    if (Sine == true) {
                        mValueOne = Math.sin(mValueTwo);
                        result = mValueOne;
                        txtOut.setText("Sin(" + mValueTwo + ")=");
                        edtIn.setText(String.valueOf(result));
                        Sine = false;
                    }

                    if (Cosine == true) {
                        mValueOne = Math.cos(mValueTwo);
                        result = mValueOne;
                        txtOut.setText("Cos(" + mValueTwo + ")=");
                        edtIn.setText(String.valueOf(result));
                        Cosine = false;
                    }
                    if (Tangent == true) {
                        mValueOne = Math.tan(mValueTwo);
                        result = mValueOne;
                        txtOut.setText("Tan(" + mValueTwo + ")=");
                        edtIn.setText(String.valueOf(result));
                        Tangent = false;
                    }
                    if (Log == true) {
                        mValueOne = Math.log10(mValueTwo);
                        result = mValueOne;
                        txtOut.setText("Log(" + mValueTwo + ")=");
                        edtIn.setText(String.valueOf(result));
                        Log = false;
                    }
                    if (Ln == true) {
                        mValueOne = Math.log(mValueTwo);
                        result = mValueOne;
                        txtOut.setText("Ln(" + mValueTwo + ")=");
                        edtIn.setText(String.valueOf(result));
                        Ln = false;
                    }
                    if (Absolute == true) {
                        mValueOne = Math.abs(mValueTwo);
                        result = mValueOne;
                        txtOut.setText("Abs(" + mValueTwo + ")=");
                        edtIn.setText(String.valueOf(result));
                        Absolute = false;
                    }
                    if (Factorial == true) {
                        mValueOne = factorial(mValueTwo);
                        result = mValueOne;
                        txtOut.setText("Fact(" + mValueTwo + ")=");
                        edtIn.setText(String.valueOf(result));
                        Factorial = false;
                    }
                    if (OneByX == true) {
                        mValueOne = 1 / (mValueTwo);
                        result = mValueOne;
                        txtOut.setText("1/(" + mValueTwo + ")=");
                        edtIn.setText(String.valueOf(result));
                        OneByX = false;
                    }

                    if (Power == true) {
                        mValueOne = Math.pow(mValueOne, mValueTwo);
                        result = mValueOne;
                        txtOut.setText(txtOut.getText() + String.valueOf(mValueTwo));
                        edtIn.setText(String.valueOf(result));
                        Power = false;
                    }

                    if (Sqrt == true) {
                        mValueOne = Math.sqrt(mValueTwo);
                        result = mValueOne;
                        txtOut.setText("Sqrt(" + mValueTwo + ")=");
                        edtIn.setText(String.valueOf(result));
                        Sqrt = false;
                    }
                    if (Sq == true) {
                        mValueOne = mValueTwo * mValueTwo;
                        result = mValueOne;
                        txtOut.setText("Square(" + mValueTwo + ")=");
                        edtIn.setText(String.valueOf(result));
                        Sq = false;
                    }
                    if (TenPowX == true) {
                        mValueOne = Math.pow(10, mValueTwo);
                        result = mValueOne;
                        txtOut.setText("10^(" + mValueTwo + ")=");
                        edtIn.setText(String.valueOf(result));
                        TenPowX = false;
                    }
                    if (TwoPowX == true) {
                        mValueOne = Math.pow(2, mValueTwo);
                        result = mValueOne;
                        txtOut.setText("2^(" + mValueTwo + ")=");
                        edtIn.setText(String.valueOf(result));
                        TwoPowX = false;
                    }
                    if (EPowX == true) {
                        mValueOne = Math.pow(Math.E, mValueTwo);
                        result = mValueOne;
                        txtOut.setText("e^(" + mValueTwo + ")=");
                        edtIn.setText(String.valueOf(result));
                        EPowX = false;
                    }
                }
            }
        });
    }

    Double factorial(Double n) {
        return (n == 1 || n == 0) ? 1 : n * factorial(n - 1);

    }
}