package com.guesswhat.app;

public class FamousQuizActivity6 extends FamousQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "MARK ZUCKERBERG";
        nextActivityClass = FamousQuizActivity7.class;

        pcImage.setImageResource(R.drawable.famous6);
        btnAnswer1.setText("Jack Dorsey");
        btnAnswer2.setText("MARK ZUCKERBERG");
        btnAnswer3.setText("Evan Spiegel");
    }
}
