package com.guesswhat.app;

public class PCQuizActivity5 extends PCQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "Apple";
        nextActivityClass = PCQuizActivity6.class;

        pcImage.setImageResource(R.drawable.pc5);
        btnAnswer1.setText("Apple");
        btnAnswer2.setText("Samsung");
        btnAnswer3.setText("Asus");
    }
}
