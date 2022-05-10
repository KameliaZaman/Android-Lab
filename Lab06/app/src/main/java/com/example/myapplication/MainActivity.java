package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

class MainActivity extends AppCompatActivity {
    private QuestionLibrary nQuestionLibrary= new QuestionLibrary();
    private String nAnswer;
    private int nScore=0;
    private int nQuestionNumber=0;
    Button btn1,btn2,btn3,btn4;
    TextView tvScore,tvQuestion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvQuestion=findViewById(R.id.tvQuestion);
        tvScore=findViewById(R.id.tvScore);
        btn1=findViewById(R.id.btnChoice1);
        btn2=findViewById(R.id.btnChoice2);
        btn3=findViewById(R.id.btnChoice3);
        btn4=findViewById(R.id.btnChoice4);

        updateQuestion();

        btn1.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v){
               try{
                   if(btn1.getText()==nAnswer)
                   {
                       nScore++;
                       updateScore(nScore);
                       updateQuestion();
                       Toast.makeText(MainActivity.this,"correct",Toast.LENGTH_SHORT).show();
                   }
                   else{
                       Toast.makeText(MainActivity.this,"wrong",Toast.LENGTH_SHORT).show();
                   updateQuestion();
                   }
               }
               catch (Exception e)
               {
                   Toast.makeText(MainActivity.this,"finish",Toast.LENGTH_SHORT).show();
               }
           }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                try{
                    if(btn2.getText()==nAnswer)
                    {
                        nScore++;
                        updateScore(nScore);
                        updateQuestion();
                        Toast.makeText(MainActivity.this,"correct",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this,"wrong",Toast.LENGTH_SHORT).show();
                    updateQuestion();
                    }
                }
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this,"finish",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                try{
                    if(btn3.getText()==nAnswer)
                    {
                        nScore++;
                        updateScore(nScore);
                        updateQuestion();
                        Toast.makeText(MainActivity.this,"correct",Toast.LENGTH_SHORT).show();
                    }
                    else{
                        Toast.makeText(MainActivity.this,"wrong",Toast.LENGTH_SHORT).show();
                   updateQuestion();
                    }
                }
                catch (Exception e)
                {
                    Toast.makeText(MainActivity.this,"finish",Toast.LENGTH_SHORT).show();
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void updateQuestion(){
        tvQuestion.setText(nQuestionLibrary.getQuestion(nQuestionNumber));
        btn1.setText(nQuestionLibrary.getChoice1(nQuestionNumber));
        btn2.setText(nQuestionLibrary.getChoice2(nQuestionNumber));
        btn3.setText(nQuestionLibrary.getChoice3(nQuestionNumber));

        nAnswer=nQuestionLibrary.getCorrectAnswer(nQuestionNumber);
        nQuestionNumber++;
    }
    private void updateScore(int point){
        tvScore.setText("Score: "+nScore);
    }
}