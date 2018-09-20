package com.example.android.footballscoresapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;

    int scoreTeamB = 0;

    int foulTeamA = 0;

    int foulTeamB = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override

    public void onSaveInstanceState(Bundle savedInstanceState) {

        savedInstanceState.putInt("Team A score", scoreTeamA);
        savedInstanceState.putInt("Team A foul", foulTeamA);
        savedInstanceState.putInt("Team B score", scoreTeamB);
        savedInstanceState.putInt("Team B foul", foulTeamB);

        super.onSaveInstanceState(savedInstanceState);
    }

    @Override

    public void onRestoreInstanceState(Bundle savedInstanceState) {

        super.onRestoreInstanceState(savedInstanceState);

        scoreTeamA = savedInstanceState.getInt("Team A score");
        foulTeamA = savedInstanceState.getInt("Team A foul");
        scoreTeamB = savedInstanceState.getInt("Team B score");
        foulTeamB = savedInstanceState.getInt("Team B foul");

        displayForTeamAScore(scoreTeamA);
        displayForTeamAFoul(foulTeamA);
        displayForTeamBScore(scoreTeamB);
        displayForTeamBFoul(foulTeamB);


    }


    public void goalA(View view) {

        scoreTeamA = scoreTeamA + 1;
        displayForTeamAScore(scoreTeamA);
    }

    public void foulA(View view) {

        foulTeamA = foulTeamA + 1;
        displayForTeamAFoul(foulTeamA);
    }

    public void goalB(View view) {

        scoreTeamB = scoreTeamB + 1;
        displayForTeamBScore(scoreTeamB);
    }

    public void foulB(View view) {

        foulTeamB = foulTeamB + 1;
        displayForTeamBFoul(foulTeamB);
    }


    public void reset(View view) {

        scoreTeamA = 0;

        displayForTeamAScore(0);

        foulTeamA = 0;

        displayForTeamAFoul(0);

        scoreTeamB = 0;

        displayForTeamBScore(0);

        foulTeamB = 0;

        displayForTeamBFoul(0);

    }


    public void displayForTeamAScore(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_A_score);

        scoreView.setText(String.valueOf(score));

    }

    public void displayForTeamBScore(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_B_score);

        scoreView.setText(String.valueOf(score));

    }

    public void displayForTeamAFoul(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_A_foul);

        scoreView.setText(String.valueOf(score));

    }

    public void displayForTeamBFoul(int score) {

        TextView scoreView = (TextView) findViewById(R.id.team_B_foul);

        scoreView.setText(String.valueOf(score));

    }

}
