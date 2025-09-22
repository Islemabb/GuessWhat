package com.guesswhat.app;

public class FamousQuizActivity9 extends FamousQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "TOM CRUISE";
        nextActivityClass = FamousQuizActivity10.class;

        pcImage.setImageResource(R.drawable.famous9);
        btnAnswer1.setText("KEANU REEVES");
        btnAnswer2.setText("BRAD PITT");
        btnAnswer3.setText("TOM CRUISE");
    }
}
