package com.guesswhat.app;

public class FootballQuizActivity9 extends FootballQuizActivity{
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "JUVENTUS";
        nextActivityClass = FootballQuizActivity10.class;

        pcImage.setImageResource(R.drawable.football9);
        btnAnswer1.setText("AS ROMA");
        btnAnswer2.setText("LAZIO");
        btnAnswer3.setText("JUVENTUS");
    }
}
