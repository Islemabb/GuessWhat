package com.guesswhat.app;

public class FamousQuizActivity7 extends FamousQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "ARIANA GRANDE";
        nextActivityClass = FamousQuizActivity8.class;

        pcImage.setImageResource(R.drawable.famous7);
        btnAnswer1.setText("ARIANA GRANDE");
        btnAnswer2.setText("SELENA GOMEZ");
        btnAnswer3.setText("TAYLOR SWIFT");
    }
}




