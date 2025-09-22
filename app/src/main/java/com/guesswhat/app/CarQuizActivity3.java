package com.guesswhat.app;

import android.os.Bundle;

public class CarQuizActivity3 extends CarQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();

        correctAnswer = "MERCEDES-BENZ";
        nextActivityClass = CarQuizActivity4.class;  // ✅ THIS IS CRITICAL

        carImage.setImageResource(R.drawable.car3);

        btnAnswer1.setText("HONDA");
        btnAnswer2.setText("TESLA");
        btnAnswer3.setText("MERCEDES-BENZ");
    }
}
