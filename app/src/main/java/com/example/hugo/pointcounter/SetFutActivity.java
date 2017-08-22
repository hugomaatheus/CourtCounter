package com.example.hugo.pointcounter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SetFutActivity extends AppCompatActivity {

    int gameScore = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_set_fut);
    }

    public void displayGameScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.game_score);
        scoreView.setText(String.valueOf(score));
    }

    public void scorePlusPlus(View v) {
        gameScore++;
        displayGameScore(gameScore);
    }

    public void scoreSubcract(View v) {
        gameScore--;
        displayGameScore(gameScore);
    }

    public void saveScoreGame(View v) {
        Intent i = new Intent(this, FutActivity.class);
        i.putExtra("gameScore", gameScore);
        startActivity(i);
    }
}
