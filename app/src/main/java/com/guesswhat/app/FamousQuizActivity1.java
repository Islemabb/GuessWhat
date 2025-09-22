package com.guesswhat.app;

public class FamousQuizActivity1 extends FamousQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "ELON MUSK";
        nextActivityClass = FamousQuizActivity2.class;

        pcImage.setImageResource(R.drawable.famous1);
        btnAnswer1.setText("Tim Cook");
        btnAnswer2.setText("JEFF BEZOS");
        btnAnswer3.setText("ELON MUSK");
    }
}
