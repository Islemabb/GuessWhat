package com.guesswhat.app;

public class PCQuizActivity1 extends PCQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "MSI";
        nextActivityClass = PCQuizActivity2.class;

        pcImage.setImageResource(R.drawable.pc1);
        btnAnswer1.setText("MSI");
        btnAnswer2.setText("Asus");
        btnAnswer3.setText("HP");
    }
}
