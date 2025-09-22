package com.guesswhat.app;

public class PCQuizActivity3 extends PCQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "HP";
        nextActivityClass = PCQuizActivity4.class;

        pcImage.setImageResource(R.drawable.pc3);
        btnAnswer1.setText("HP");
        btnAnswer2.setText("MSI");
        btnAnswer3.setText("Acer");
    }
}
