package com.guesswhat.app;

import android.os.Bundle;

public class CarQuizActivity2 extends CarQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();

        correctAnswer = "BMW";
        nextActivityClass = CarQuizActivity3.class;

        carImage.setImageResource(R.drawable.car2);

        btnAnswer1.setText("BMW");
        btnAnswer2.setText("TOYOTA");
        btnAnswer3.setText("FORD");
    }
}
