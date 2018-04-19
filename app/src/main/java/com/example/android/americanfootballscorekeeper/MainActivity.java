package com.example.android.americanfootballscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int firstTeamScore = 0;
    int secondTeamScore = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    /**
     * Increase the first team score by six.
     */

    public void addSixForFirstTeam(View view) {
        firstTeamScore = firstTeamScore + 6;
        displayFirstTeamScore(firstTeamScore);
    }

    /**
     * Increase the first team score by three.
     */

    public void addThreeForFirstTeam(View view) {
        firstTeamScore = firstTeamScore + 3;
        displayFirstTeamScore(firstTeamScore);
    }

    /**
     * Increase the first team score by two.
     */

    public void addTwoForFirstTeam(View view) {
        firstTeamScore = firstTeamScore + 2;
        displayFirstTeamScore(firstTeamScore);
    }

    /**
     * Increase the first team score by one.
     */

    public void addOneForFirstTeam(View view) {
        firstTeamScore = firstTeamScore + 1;
        displayFirstTeamScore(firstTeamScore);
    }

    /**
     * Display the score for the first team.
     */


    public void displayFirstTeamScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.first_team_score);
        scoreView.setText(String.valueOf(score));
    }


    /**
     * Increase the second team score by six.
     */

    public void addSixForSecondTeam(View view) {
        secondTeamScore = secondTeamScore + 6;
        displaySecondTeamScore(secondTeamScore);
    }

    /**
     * Increase the second team score by three.
     */

    public void addThreeForSecondTeam(View view) {
        secondTeamScore = secondTeamScore + 3;
        displaySecondTeamScore(secondTeamScore);
    }

    /**
     * Increase the second team score by two.
     */

    public void addTwoForSecondTeam(View view) {
        secondTeamScore = secondTeamScore + 2;
        displaySecondTeamScore(secondTeamScore);
    }

    /**
     * Increase the second team score by one.
     */

    public void addOneForSecondTeam(View view) {
        secondTeamScore = secondTeamScore + 1;
        displaySecondTeamScore(secondTeamScore);
    }


    /**
     * Display the score for the second team.
     */

    public void displaySecondTeamScore(int score) {
        TextView scoreView = (TextView) findViewById(R.id.second_team_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Reset the score for both team to zero
     */
    public void resetScore(View view) {
        firstTeamScore = 0;
        secondTeamScore = 0;
        displayFirstTeamScore(firstTeamScore);
        displaySecondTeamScore(secondTeamScore);
    }
}
