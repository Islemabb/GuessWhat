package com.guesswhat.app;

public class PCQuizActivity4 extends PCQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "Lenovo";
        nextActivityClass = PCQuizActivity5.class;

        pcImage.setImageResource(R.drawable.pc4);
        btnAnswer1.setText("Dell");
        btnAnswer2.setText("Apple");
        btnAnswer3.setText("Lenovo");
    }
}
