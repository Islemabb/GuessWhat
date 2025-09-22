package com.guesswhat.app;

public class FamousQuizActivity4 extends FamousQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "TAYLOR SWIFT";
        nextActivityClass = FamousQuizActivity5.class;

        pcImage.setImageResource(R.drawable.famous4);
        btnAnswer1.setText("TAYLOR SWIFT");
        btnAnswer2.setText("Ariana Grande");
        btnAnswer3.setText("Olivia Rodrigo");
    }
}
