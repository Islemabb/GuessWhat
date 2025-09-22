package com.guesswhat.app;

public class PCQuizActivity7 extends PCQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "Dell";
        nextActivityClass = PCQuizActivity8.class;

        pcImage.setImageResource(R.drawable.pc7);
        btnAnswer1.setText("Samsung");
        btnAnswer2.setText("Dell");
        btnAnswer3.setText("Apple");
    }
}
