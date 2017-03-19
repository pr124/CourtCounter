package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int teamA = 0;
    int teamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addThreeTeamA(View view) {
        teamA = teamA + 3;
        resultTeamA(teamA);
    }

    public void addTwoTeamA(View view) {
        teamA = teamA + 2;
        resultTeamA(teamA);
    }

    public void freeThrowTeamA(View view) {
        teamA = teamA + 1;
        resultTeamA(teamA);
    }

    public void addThreeTeamB(View view) {
        teamB = teamB + 3;
        resultTeamB(teamB);
    }

    public void addTwoTeamB(View view) {
        teamB = teamB + 2;
        resultTeamB(teamB);
    }

    public void freeThrowTeamB(View view) {
        teamB = teamB + 1;
        resultTeamB(teamB);
    }

    public void resetScore(View view) {
        teamA = 0;
        teamB = 0;
        resetTeamAB(teamA + teamB);
    }

    private void resultTeamA(int teamA) {
        TextView scoreTextView = (TextView) findViewById(R.id.points_team_a);
        scoreTextView.setText(String.valueOf(teamA));
    }

    private void resultTeamB(int teamB) {
        TextView scoreTextView = (TextView) findViewById(R.id.points_team_b);
        scoreTextView.setText(String.valueOf(teamB));
    }

    private void resetTeamAB(int reset) {
        TextView resetTextViewA = (TextView) findViewById(R.id.points_team_a);
        TextView resetTextViewB = (TextView) findViewById(R.id.points_team_b);
        resetTextViewA.setText(String.valueOf(reset));
        resetTextViewB.setText(String.valueOf(reset));
    }
}
