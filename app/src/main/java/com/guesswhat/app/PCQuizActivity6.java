package com.guesswhat.app;

public class PCQuizActivity6 extends PCQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "Acer";
        nextActivityClass = PCQuizActivity7.class;

        pcImage.setImageResource(R.drawable.pc6);
        btnAnswer1.setText("HP");
        btnAnswer2.setText("Acer");
        btnAnswer3.setText("MSI");
    }
}
