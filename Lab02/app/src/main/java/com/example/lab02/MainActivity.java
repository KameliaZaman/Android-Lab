package com.example.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button btnS;
    TextView tvS;
    EditText etN;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnS = findViewById(R.id.mybutton);
        tvS = findViewById(R.id.textView1);
        etN = findViewById(R.id.editTextPersonName);
        btnS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getApplicationContext(), "Hi World!", Toast.LENGTH_LONG).show();
                //tvS.setText("Hello!!!!!");
                tvS.setText("Hello " + etN.getText().toString());
            }
        });

    }

}
