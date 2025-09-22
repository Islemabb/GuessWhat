package com.guesswhat.app;

public class FootballQuizActivity12 extends FootballQuizActivity{
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "VFB STUTTGART";
        nextActivityClass = FootballQuizActivity13.class;

        pcImage.setImageResource(R.drawable.football12);
        btnAnswer1.setText("BAYERN MUNICH");
        btnAnswer2.setText("EINTRACHT FRANKFURT");
        btnAnswer3.setText("VFB STUTTGART");
    }
}
