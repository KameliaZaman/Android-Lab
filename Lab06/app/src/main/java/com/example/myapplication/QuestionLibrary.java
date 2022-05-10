package com.example.myapplication;

public class QuestionLibrary{
    private String myQuestion[]={
            "Which part of the plant holds it in the soil?",
            "This part of the plant absorbs the energy from sun",
            "This part of the plant attracts the plants",
            "The-- holds the plant upright"
    };
    private String nChoices [][]={
            {"Roots","Stem","Flower"},
            {"Fruits","Leaves","Seeds"},
            {"Bark","Flowers","Roots"},
            {"Flowers","Leaves","Stems"}
    };
    private String nCorrectAnswers[]={
            "Roots","Leaves","Flowers","Stem"
    };

    public String getQuestion(int a){
        String question= myQuestion[a];
        return question;
    }

    public String getChoice1(int a){
        String choice0=nChoices[a][0];
        return choice0;
    }

    public String getChoice2(int a){
        String choice1=nChoices[a][1];
        return choice1;
    }

    public String getChoice3(int a){
        String choice2=nChoices[a][2];
        return choice2;
    }

    public String getCorrectAnswer(int a){
        String answer=nCorrectAnswers[a];
        return answer;
    }
}