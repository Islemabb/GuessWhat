package com.guesswhat.app;

public class FamousQuizActivity12 extends FamousQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "IShowSpeed";
        nextActivityClass = FamousQuizActivity13.class;

        pcImage.setImageResource(R.drawable.famous12);
        btnAnswer1.setText("KAI CENAT ");
        btnAnswer2.setText("IShowSpeed");
        btnAnswer3.setText("YOURRAGE");
    }
}
