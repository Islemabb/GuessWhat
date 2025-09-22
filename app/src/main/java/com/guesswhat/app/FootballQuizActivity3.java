package com.guesswhat.app;

public class FootballQuizActivity3 extends FootballQuizActivity{
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "ATLÉTICO MADRID";
        nextActivityClass = FootballQuizActivity4.class;

        pcImage.setImageResource(R.drawable.football3);
        btnAnswer1.setText("REAL SOCIEDAD");
        btnAnswer2.setText("SEVILLA FC");
        btnAnswer3.setText("ATLÉTICO MADRID");
    }
}
