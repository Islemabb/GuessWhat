package com.guesswhat.app;

public class PCQuizActivity2 extends PCQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "Asus";
        nextActivityClass = PCQuizActivity3.class;

        pcImage.setImageResource(R.drawable.pc2);
        btnAnswer1.setText("Apple");
        btnAnswer2.setText("Asus");
        btnAnswer3.setText("Lenovo");
    }
}
