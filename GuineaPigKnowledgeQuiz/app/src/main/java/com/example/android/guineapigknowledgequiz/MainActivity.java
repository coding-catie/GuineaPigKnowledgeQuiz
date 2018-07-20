package com.example.android.guineapigknowledgequiz;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    int score = 0;

    //Calculates the score of the quiz
    public int scoreQuiz() {
        solveQuestion1();
        solveQuestion2();
        solveQuestion3();
        solveQuestion4();
        solveQuestion5();
        solveQuestion6();
        solveQuestion7();
        solveQuestion8();
        return score;
    }

    //Toast after clicking Submit  button
    public void submitQuiz(View view) {
        scoreQuiz();
        Context context = getApplicationContext();
        CharSequence text = "You got " + score + " out of 8 correct.";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
        score = 0;
    }
    //Button takes user to research link
    public void research (View view) {
        goToUrl ("http://www.guinealynx.info/healthycavy.html");
    }

    private void goToUrl (String url) {
        Uri uriUrl = Uri.parse(url);
        Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
        startActivity(launchBrowser);
    }

    private int solveQuestion1() {
        RadioButton answerQues1 = findViewById(R.id.ques1NoButton);
        if (answerQues1.isChecked()) {
            return score += 1;
        }
        else {
            return score;
        }
    }
    private int solveQuestion2() {
        CheckBox nailsCheckBox = findViewById(R.id.nailsCheckbox);
        CheckBox teethCheckBox = findViewById(R.id.teethCheckbox);
        CheckBox floortimeCheckBox = findViewById(R.id.floortimeCheckbox);
        CheckBox weighCheckBox = findViewById(R.id.weighCheckbox);
        if ((nailsCheckBox.isChecked()) && (floortimeCheckBox.isChecked()) && (weighCheckBox.isChecked())) {
            if (teethCheckBox.isChecked()) {
                return score;
            }
            else {
                return score += 1;
            }
        }
        else {
            return score;
        }
    }
    private int solveQuestion3() {
        RadioButton answerQues3 = findViewById(R.id.alfalfaRadioButton);
        if (answerQues3.isChecked()) {
            return score += 1;
        }
        else {
            return score;
        }
    }
    private int solveQuestion4() {
        EditText typeQues4 = (EditText) findViewById(R.id.vitamin_field);
        String answerQues4 = typeQues4.getText().toString();
        if (answerQues4.equals("C")) {
            return score += 1;
        }
        else {
            return score;
        }
    }
    private int solveQuestion5() {
        RadioButton answerQues5 = findViewById(R.id.ques5NoButton);
        if (answerQues5.isChecked()) {
            return score += 1;
        }
        else {
            return score;
        }
    }
    private int solveQuestion6() {
        CheckBox cedarCheckBox = findViewById(R.id.cedarCheckbox);
        CheckBox fleeceCheckBox = findViewById(R.id.fleeceCheckbox);
        CheckBox paperCheckBox = findViewById(R.id.paperCheckbox);
        CheckBox strawCheckBox = findViewById(R.id.strawCheckbox);
        if ((fleeceCheckBox.isChecked()) && (paperCheckBox.isChecked())) {
            if (cedarCheckBox.isChecked()) {
                return score;
            }
            else if (strawCheckBox.isChecked()) {
                return score;
            }
            else {
                return score += 1;
            }
        }
        else {
            return score;
        }
    }
    private int solveQuestion7() {
        RadioButton answerQues5 = findViewById(R.id.safeButton);
        if (answerQues5.isChecked()) {
            return score += 1;
        }
        else{
            return score;
        }
    }
    private int solveQuestion8() {
        RadioButton answerQues8 = findViewById(R.id.onetwoTimesYearButton);
        if (answerQues8.isChecked()) {
            return score += 1;
        }
        else{
            return score;
        }
    }
}
