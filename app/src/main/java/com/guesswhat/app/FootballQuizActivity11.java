package com.guesswhat.app;

public class FootballQuizActivity11 extends FootballQuizActivity{
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "INTER MILAN";
        nextActivityClass = FootballQuizActivity12.class;

        pcImage.setImageResource(R.drawable.football11);
        btnAnswer1.setText("INTER MILAN");
        btnAnswer2.setText("AC MILAN");
        btnAnswer3.setText("NAPOLI");
    }
}
