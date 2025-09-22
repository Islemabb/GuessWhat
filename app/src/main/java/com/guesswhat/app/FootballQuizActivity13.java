package com.guesswhat.app;

public class FootballQuizActivity13 extends FootballQuizActivity{
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "BORUSSIA DORTMUND";
        nextActivityClass = FootballQuizActivity14.class;

        pcImage.setImageResource(R.drawable.football13);
        btnAnswer1.setText("BAYERN MUNICH");
        btnAnswer2.setText("BORUSSIA DORTMUND");
        btnAnswer3.setText("BAYER LEVERKUSEN");
    }
}
