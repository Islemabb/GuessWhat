package com.guesswhat.app;

public class FootballQuizActivity5 extends FootballQuizActivity{
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "REAL MADRID";
        nextActivityClass = FootballQuizActivity6.class;

        pcImage.setImageResource(R.drawable.football5);
        btnAnswer1.setText("FC BARCELONA");
        btnAnswer2.setText("REAL MADRID");
        btnAnswer3.setText("REAL SOCIEDAD");
    }
}
