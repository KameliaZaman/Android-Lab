package com.example.converter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCalc, btnCl;
    EditText edtIn;
    RadioButton rdBDT, rdUSD, rdIND, rdMF, rdIF, rdYM, rdKP, rdPO, rdKG, rdHK, rdHA, rdMY, rdBK, rdMK, rdTG, rdDM, rdDW, rdMW;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCalc = findViewById(R.id.btnCalculate);
        btnCl = findViewById(R.id.btnClear);
        edtIn = findViewById(R.id.EdtInput);
        rdBDT = findViewById(R.id.rd1);
        rdUSD = findViewById(R.id.rd2);
        rdIND = findViewById(R.id.rd3);
        rdMF = findViewById(R.id.rd4);
        rdIF = findViewById(R.id.rd5);
        rdYM = findViewById(R.id.rd6);
        rdKP = findViewById(R.id.rd7);
        rdPO = findViewById(R.id.rd8);
        rdKG = findViewById(R.id.rd9);
        rdHK = findViewById(R.id.rd10);
        rdHA = findViewById(R.id.rd11);
        rdMY = findViewById(R.id.rd12);
        rdBK = findViewById(R.id.rd13);
        rdMK = findViewById(R.id.rd14);
        rdTG = findViewById(R.id.rd15);
        rdDM = findViewById(R.id.rd16);
        rdDW = findViewById(R.id.rd17);
        rdMW = findViewById(R.id.rd18);


        btnCalc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Double input = new Double(edtIn.getText().toString());
                if (rdBDT.isChecked()) {
                    double result = Convert.usdBDT(input);
                    edtIn.setText(new Double(result).toString());
                } else if (rdUSD.isChecked()) {
                    double result = Convert.bdtUSD(input);
                    edtIn.setText(new Double(result).toString());
                } else if (rdIND.isChecked()) {
                    double result = Convert.bdtIND(input);
                    edtIn.setText(new Double(result).toString());
                } else if (rdMF.isChecked()) {
                    double result = Convert.MtF(input);
                    edtIn.setText(new Double(result).toString());
                } else if (rdIF.isChecked()) {
                    double result = Convert.ItF(input);
                    edtIn.setText(new Double(result).toString());
                } else if (rdYM.isChecked()) {
                    double result = Convert.YtM(input);
                    edtIn.setText(new Double(result).toString());
                } else if (rdKP.isChecked()) {
                    double result = Convert.KtP(input);
                    edtIn.setText(new Double(result).toString());
                } else if (rdPO.isChecked()) {
                    double result = Convert.PtO(input);
                    edtIn.setText(new Double(result).toString());
                } else if (rdKG.isChecked()) {
                    double result = Convert.KtG(input);
                    edtIn.setText(new Double(result).toString());
                } else if (rdHK.isChecked()) {
                    double result = Convert.HtK(input);
                    edtIn.setText(new Double(result).toString());
                } else if (rdHA.isChecked()) {
                    double result = Convert.HtA(input);
                    edtIn.setText(new Double(result).toString());
                } else if (rdMY.isChecked()) {
                    double result = Convert.MtY(input);
                    edtIn.setText(new Double(result).toString());
                } else if (rdBK.isChecked()) {
                    double result = Convert.BtK(input);
                    edtIn.setText(new Double(result).toString());
                } else if (rdMK.isChecked()) {
                    double result = Convert.MtK(input);
                    edtIn.setText(new Double(result).toString());
                } else if (rdTG.isChecked()) {
                    double result = Convert.TtG(input);
                    edtIn.setText(new Double(result).toString());
                } else if (rdDM.isChecked()) {
                    double result = Convert.DtM(input);
                    edtIn.setText(new Double(result).toString());
                } else if (rdDW.isChecked()) {
                    double result = Convert.DtW(input);
                    edtIn.setText(new Double(result).toString());
                } else if (rdMW.isChecked()) {
                    double result = Convert.MtW(input);
                    edtIn.setText(new Double(result).toString());
                }
            }
        });
        btnCl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                edtIn.setText(null);
            }
        });
    }
}