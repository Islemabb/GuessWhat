package com.guesswhat.app;

public class FamousQuizActivity3 extends FamousQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "JEFF BEZOS";
        nextActivityClass = FamousQuizActivity4.class;

        pcImage.setImageResource(R.drawable.famous3);
        btnAnswer1.setText("Jack Ma");
        btnAnswer2.setText("Mark Zuckerberg");
        btnAnswer3.setText("JEFF BEZOS");
    }
}
