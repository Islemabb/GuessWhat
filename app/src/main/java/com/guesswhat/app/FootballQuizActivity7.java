package com.guesswhat.app;

public class FootballQuizActivity7 extends FootballQuizActivity{
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "LOSC LILLE";
        nextActivityClass = FootballQuizActivity8.class;

        pcImage.setImageResource(R.drawable.football7);
        btnAnswer1.setText("LOSC LILLE");
        btnAnswer2.setText("AS MONACO");
        btnAnswer3.setText("RENNES");
    }
}
