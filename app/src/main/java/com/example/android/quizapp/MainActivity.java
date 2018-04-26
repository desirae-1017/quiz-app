package com.example.android.quizapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //Declare the answers for the ten questions
    final int answerToOne = R.id.is1905;
    final int answerToTwo = R.id.input1868;
    final int answerToThree = R.id.is25;
    final int answerToFour = R.id.moreThan150;
    final int answerToFive = R.id.southHall;
    final int answerToSix = R.id.ft307;
    final int answerToSeven = R.id.is27;
    final int answerToEight = R.id.is16;
    final int answerToNine = R.id.is1964;
    final int answerToTen = R.id.is20percent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Compute the number of correct answers

    public void submit(View v) {
        int numberOfCorrectAnswers = 0;

        if (checkQuestionOne()) {
            numberOfCorrectAnswers += 1;
        }

        if (checkQuestionTwo()) {
            numberOfCorrectAnswers += 1;
        }

        if (checkQuestionThree()) {
            numberOfCorrectAnswers += 1;
        }

        if (checkQuestionFour()) {
            numberOfCorrectAnswers += 1;
        }

        if (checkQuestionFive()) {
            numberOfCorrectAnswers += 1;
        }

        if (checkQuestionSix()) {
            numberOfCorrectAnswers += 1;
        }

        if (checkQuestionSeven()) {
            numberOfCorrectAnswers += 1;
        }

        if (checkQuestionEight()) {
            numberOfCorrectAnswers += 1;
        }

        if (checkQuestionNine()) {
            numberOfCorrectAnswers += 1;
        }

        if (checkQuestionTen()) {
            numberOfCorrectAnswers += 1;
        }

        //String message displayed in a toast
        Context context = getApplicationContext();
        CharSequence text = "You got " + numberOfCorrectAnswers + "/10 answers correct.";
        int duration = Toast.LENGTH_LONG;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }

    private boolean checkQuestionOne(){
        RadioGroup question1Answers = (RadioGroup) findViewById(R.id.question1Answers);

        if (question1Answers.getCheckedRadioButtonId() == answerToOne) {
            return true;
        }
        return false;
    }

    private boolean checkQuestionTwo(){
        RadioGroup question2Answers = (RadioGroup) findViewById(R.id.question2Answers);

        if (question2Answers.getCheckedRadioButtonId() == answerToTwo) {
            return true;
        }
        return false;
    }

    private boolean checkQuestionThree(){
        RadioGroup question3Answers = (RadioGroup) findViewById(R.id.question3Answers);

        if (question3Answers.getCheckedRadioButtonId() == answerToThree) {
            return true;
        }
        return false;
    }

    private boolean checkQuestionFour(){
        RadioGroup question4Answers = (RadioGroup) findViewById(R.id.question4Answers);

        if (question4Answers.getCheckedRadioButtonId() == answerToFour) {
            return true;
        }
        return false;
    }

    private boolean checkQuestionFive(){
        RadioGroup question5Answers = (RadioGroup) findViewById(R.id.question5Answers);

        if (question5Answers.getCheckedRadioButtonId() == answerToFive) {
            return true;
        }
        return false;
    }

    private boolean checkQuestionSix(){
        RadioGroup question6Answers = (RadioGroup) findViewById(R.id.question6Answers);

        if (question6Answers.getCheckedRadioButtonId() == answerToSix) {
            return true;
        }
        return false;
    }

    private boolean checkQuestionSeven(){
        RadioGroup question7Answers = (RadioGroup) findViewById(R.id.question7Answers);

        if (question7Answers.getCheckedRadioButtonId() == answerToSeven) {
            return true;
        }
        return false;
    }

    private boolean checkQuestionEight(){
        RadioGroup question8Answers = (RadioGroup) findViewById(R.id.question8Answers);

        if (question8Answers.getCheckedRadioButtonId() == answerToEight) {
            return true;
        }
        return false;
    }

    private boolean checkQuestionNine(){
        RadioGroup question9Answers = (RadioGroup) findViewById(R.id.question9Answers);

        if (question9Answers.getCheckedRadioButtonId() == answerToNine) {
            return true;
        }
        return false;
    }

    private boolean checkQuestionTen(){
        RadioGroup question10Answers = (RadioGroup) findViewById(R.id.question10Answers);

        if (question10Answers.getCheckedRadioButtonId() == answerToTen) {
            return true;
        }
        return false;
    }

}




