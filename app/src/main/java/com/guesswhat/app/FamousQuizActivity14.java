package com.guesswhat.app;

public class FamousQuizActivity14 extends FamousQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "JASON STATHAM";
        nextActivityClass = FamousQuizActivity15.class;

        pcImage.setImageResource(R.drawable.famous14);
        btnAnswer1.setText("VIN DIESEL");
        btnAnswer2.setText("BRUCE WILLIS");
        btnAnswer3.setText("JASON STATHAM");
    }
}
