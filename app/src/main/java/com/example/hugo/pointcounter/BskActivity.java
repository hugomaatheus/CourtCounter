package com.example.hugo.pointcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class BskActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
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
    }

    public void twoPointsA(View v) {
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA);
    }

    public void freeThrowA(View v) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }

    //Time B
    public void threePointsB(View v) {
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB);
    }

    public void twoPointsB(View v) {
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void freeThrowB(View v) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    public void resetScore(View v) {
        scoreTeamA = scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
}
