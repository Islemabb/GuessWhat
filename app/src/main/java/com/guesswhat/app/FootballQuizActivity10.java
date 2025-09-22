package com.guesswhat.app;

public class FootballQuizActivity10 extends FootballQuizActivity{
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "AC MILAN";
        nextActivityClass = FootballQuizActivity11.class;

        pcImage.setImageResource(R.drawable.football10);
        btnAnswer1.setText("AC MILAN");
        btnAnswer2.setText("AS ROMA");
        btnAnswer3.setText("INTER MILAN");
    }
}
