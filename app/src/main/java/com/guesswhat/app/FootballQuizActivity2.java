package com.guesswhat.app;

public class FootballQuizActivity2 extends FootballQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "FC BARCELONA";
        nextActivityClass = FootballQuizActivity3.class;

        pcImage.setImageResource(R.drawable.football2);
        btnAnswer1.setText("FC BARCELONA");
        btnAnswer2.setText("ATLÉTICO MADRID");
        btnAnswer3.setText("VILLARREAL CF");
    }
}