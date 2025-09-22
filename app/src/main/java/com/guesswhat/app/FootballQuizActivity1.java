package com.guesswhat.app;

public class FootballQuizActivity1 extends FootballQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "MANCHESTER UNITED";
        nextActivityClass = FootballQuizActivity2.class;

        pcImage.setImageResource(R.drawable.football1);
        btnAnswer1.setText("LIVERPOOL");
        btnAnswer2.setText("CHELSEA");
        btnAnswer3.setText("MANCHESTER UNITED");
    }
}