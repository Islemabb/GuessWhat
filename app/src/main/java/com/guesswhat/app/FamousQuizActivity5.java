package com.guesswhat.app;

public class FamousQuizActivity5 extends FamousQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "LIONEL MESSI";
        nextActivityClass = FamousQuizActivity6.class;

        pcImage.setImageResource(R.drawable.famous5);
        btnAnswer1.setText("LIONEL MESSI");
        btnAnswer2.setText("NEYMAR");
        btnAnswer3.setText("CRISTIANO RONALDO");
    }
}
