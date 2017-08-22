package com.example.hugo.pointcounter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class FutActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int gameScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent i = getIntent();
        gameScore = i.getIntExtra("gameScoreFut", -1);
        setContentView(R.layout.activity_fut);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void goalForTeamA(View v) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);

        //checking the end game
        //OPTIMIZAR MAIS DPS
        if(checkScore(scoreTeamA)) {
            Context c = getApplicationContext();
            CharSequence text = "Time A ganhou! Outra!!!";
            int duration = Toast.LENGTH_LONG;
            Toast.makeText(c, text, duration).show();
        }
    }

    public void goalForTeamB(View v) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);

        //checking the end game
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
