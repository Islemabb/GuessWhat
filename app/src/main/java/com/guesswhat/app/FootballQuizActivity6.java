package com.guesswhat.app;

public class FootballQuizActivity6 extends FootballQuizActivity{
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "PARIS SAINT-GERMAIN";
        nextActivityClass = FootballQuizActivity7.class;

        pcImage.setImageResource(R.drawable.football6);
        btnAnswer1.setText("OLYMPIQUE LYONNAIS");
        btnAnswer2.setText("RENNES");
        btnAnswer3.setText("PARIS SAINT-GERMAIN");
    }
}
