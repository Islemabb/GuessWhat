package com.guesswhat.app;

public class FamousQuizActivity11 extends FamousQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "CHARLES LECLERC";
        nextActivityClass = FamousQuizActivity12.class;

        pcImage.setImageResource(R.drawable.famous11);
        btnAnswer1.setText("CHARLES LECLERC");
        btnAnswer2.setText("LEWIS HAMILTON");
        btnAnswer3.setText("MAX VERSTAPPEN");
    }
}
