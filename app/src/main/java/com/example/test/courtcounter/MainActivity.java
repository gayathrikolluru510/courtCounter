package com.example.test.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA=0;
    int scoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }




     // Displays the given score for Tea
     public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void points3A(View view){
        scoreA=scoreA+3;

        displayForTeamA(scoreA);
    }

    public void points2A(View view){
        scoreA=scoreA+2;
        displayForTeamA(scoreA);
    }

    public void FreethrowA(View view){
        scoreA=scoreA+1;
        displayForTeamA(scoreA);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void points3B(View view){
        scoreB=scoreB+3;

        displayForTeamB(scoreB);
    }
    public void points2B(View view){
        scoreB=scoreB+2;
        displayForTeamB(scoreB);
    }
    public void FreethrowB(View view){
        scoreB=scoreB+1;
        displayForTeamB(scoreB);
    }

    public void resetall(View view){
        scoreA=0;
        scoreB=0;
        displayForTeamB(scoreB);
        displayForTeamA(scoreA);
    }

}

