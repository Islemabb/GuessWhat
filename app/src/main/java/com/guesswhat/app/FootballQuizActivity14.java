package com.guesswhat.app;

public class FootballQuizActivity14 extends FootballQuizActivity{
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "BAYERN MUNICH";
        nextActivityClass = FootballQuizActivity15.class;

        pcImage.setImageResource(R.drawable.football14);
        btnAnswer1.setText("BAYERN MUNICH");
        btnAnswer2.setText("BAYER LEVERKUSEN");
        btnAnswer3.setText("RB LEIPZIG");
    }
}
