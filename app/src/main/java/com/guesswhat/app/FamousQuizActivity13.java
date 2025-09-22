package com.guesswhat.app;

public class FamousQuizActivity13 extends FamousQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "LIAM NEESON";
        nextActivityClass = FamousQuizActivity14.class;

        pcImage.setImageResource(R.drawable.famous13);
        btnAnswer1.setText("MORGAN FREEMAN");
        btnAnswer2.setText("LIAM NEESON");
        btnAnswer3.setText("PIERCE BROSNAN");
    }
}
