package com.example.android.elgoncupmatchrecorder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamU = 0;
    int scoreTeamK = 0;
    int scoreYCardTeamU = 0;
    int scoreRCardTeamU = 0;
    int scoreYCardTeamK = 0;
    int scoreRCardTeamK = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addFiveForTeamU(View v){
        scoreTeamU = scoreTeamU + 5;
        displayForTeamU(scoreTeamU);
    }

    public void addTwoForTeamU(View v){
        scoreTeamU = scoreTeamU + 2;
        displayForTeamU(scoreTeamU);
    }

    public void addThreeForTeamU(View v){
        scoreTeamU = scoreTeamU + 3;
        displayForTeamU(scoreTeamU);
    }

    public void addFiveForTeamK(View v){
        scoreTeamK = scoreTeamK + 5;
        displayForTeamK(scoreTeamK);
    }

    public void addTwoForTeamK(View v){
        scoreTeamK = scoreTeamK + 2;
        displayForTeamK(scoreTeamK);
    }

    public void addThreeForTeamK(View v){
        scoreTeamK = scoreTeamK + 3;
        displayForTeamK(scoreTeamK);
    }

    public void addOneYCardForTeamU(View v){
        scoreYCardTeamU = scoreYCardTeamU + 1;
        displayYCardTeamU(scoreYCardTeamU);
    }

    public void addOneRCardForTeamU(View v){
        scoreRCardTeamU = scoreRCardTeamU + 1;
        displayRCardTeamU(scoreRCardTeamU);
    }

    public void addOneYCardForTeamK(View v){
        scoreYCardTeamK = scoreYCardTeamK + 1;
        displayYCardTeamK(scoreYCardTeamK);
    }

    public void addOneRCardForTeamK(View v){
        scoreRCardTeamK = scoreRCardTeamK + 1;
        displayRCardTeamK(scoreRCardTeamK);
    }

    public void resetScore(View v){
        scoreTeamU = 0;
        scoreTeamK = 0;
        scoreYCardTeamU = 0;
        scoreRCardTeamU = 0;
        scoreYCardTeamK = 0;
        scoreRCardTeamK = 0;
        displayForTeamU(scoreTeamU);
        displayForTeamK(scoreTeamK);
        displayYCardTeamU(scoreYCardTeamU);
        displayRCardTeamU(scoreRCardTeamU);
        displayYCardTeamK(scoreYCardTeamK);
        displayRCardTeamK(scoreRCardTeamK);

    }

    public void displayForTeamU(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_u_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamK(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_k_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYCardTeamU(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_u_y_card);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRCardTeamU(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_u_r_card);
        scoreView.setText(String.valueOf(score));
    }

    public void displayYCardTeamK(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_k_y_card);
        scoreView.setText(String.valueOf(score));
    }

    public void displayRCardTeamK(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_k_r_card);
        scoreView.setText(String.valueOf(score));
    }

}
