package com.example.hugo.pointcounter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class BskActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int gameScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = getIntent();
        gameScore = i.getIntExtra("gameScoreBsk", -1);
        setContentView(R.layout.activity_bsk);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //Time A
    public void threePointsA(View v) {
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA);

        //OPTIMIZAR MAIS DPS
        if(checkScore(scoreTeamA)) {
            Context c = getApplicationContext();
            CharSequence text = "Time A ganhou! Outra!!!";
            int duration = Toast.LENGTH_LONG;
            Toast.makeText(c, text, duration).show();
        }
    }

    public void twoPointsA(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);

        //OPTIMIZAR MAIS DPS
        if(checkScore(scoreTeamA)) {
            Context c = getApplicationContext();
            CharSequence text = "Time A ganhou! Outra!!!";
            int duration = Toast.LENGTH_LONG;
            Toast.makeText(c, text, duration).show();
        }
    }

    public void freeThrowA(View v) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);

        //OPTIMIZAR MAIS DPS
        if(checkScore(scoreTeamA)) {
            Context c = getApplicationContext();
            CharSequence text = "Time A ganhou! Outra!!!";
            int duration = Toast.LENGTH_LONG;
            Toast.makeText(c, text, duration).show();
        }
    }

    //Time B
    public void threePointsB(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);

        //OPTIMIZAR MAIS DPS
        if(checkScore(scoreTeamB)) {
            Context c = getApplicationContext();
            CharSequence text = "Time B ganhou! Outra!!!";
            int duration = Toast.LENGTH_LONG;
            Toast.makeText(c, text, duration).show();
        }
    }

    public void twoPointsB(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);

        //OPTIMIZAR MAIS DPS
        if(checkScore(scoreTeamB)) {
            Context c = getApplicationContext();
            CharSequence text = "Time B ganhou! Outra!!!";
            int duration = Toast.LENGTH_LONG;
            Toast.makeText(c, text, duration).show();
        }
    }

    public void freeThrowB(View v) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);

        //OPTIMIZAR MAIS DPS
        if(checkScore(scoreTeamB)) {
            Context c = getApplicationContext();
            CharSequence text = "Time B ganhou! Outra!!!";
            int duration = Toast.LENGTH_LONG;
            Toast.makeText(c, text, duration).show();
        }
    }

    public void resetScore(View v) {
        scoreTeamA = scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    public boolean checkScore(int score) {
        if(score == gameScore)
            return true;

        return false;
    }
}
