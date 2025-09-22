package com.guesswhat.app;

public class FootballQuizActivity4 extends FootballQuizActivity{
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "LIVERPOOL";
        nextActivityClass = FootballQuizActivity5.class;

        pcImage.setImageResource(R.drawable.football4);
        btnAnswer1.setText("SEVILLA FC");
        btnAnswer2.setText("LIVERPOOL");
        btnAnswer3.setText("ARSENAL");
    }
}
