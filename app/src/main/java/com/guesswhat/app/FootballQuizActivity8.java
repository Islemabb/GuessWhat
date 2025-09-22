package com.guesswhat.app;

public class FootballQuizActivity8 extends FootballQuizActivity{
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "OLYMPIQUE DE MARSEILLE";
        nextActivityClass = FootballQuizActivity9.class;

        pcImage.setImageResource(R.drawable.football8);
        btnAnswer1.setText("OLYMPIQUE LYONNAIS");
        btnAnswer2.setText("OLYMPIQUE DE MARSEILLE");
        btnAnswer3.setText("AS MONACO");
    }
}
