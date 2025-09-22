package com.guesswhat.app;

public class FamousQuizActivity10 extends FamousQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "MR BEAST";
        nextActivityClass = FamousQuizActivity11.class;

        pcImage.setImageResource(R.drawable.famous10);
        btnAnswer1.setText("PEWDIEPIE");
        btnAnswer2.setText("MR BEAST");
        btnAnswer3.setText("LOGAN PAUL");
    }
}
