package com.guesswhat.app;

public class FamousQuizActivity8 extends FamousQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "BILLIE EILISH";
        nextActivityClass = FamousQuizActivity9.class;

        pcImage.setImageResource(R.drawable.famous8);
        btnAnswer1.setText("BILLIE EILISH");
        btnAnswer2.setText("DUA LIPA");
        btnAnswer3.setText("TOM CRUISE");
    }
}
