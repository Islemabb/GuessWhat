package com.guesswhat.app;

import android.content.Intent;

public class FoodQuizActivity7 extends FoodQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "TACO BELL";
        nextActivityClass = CategoryActivity.class;

        pcImage.setImageResource(R.drawable.food7);
        btnAnswer1.setText("CHIPOTLE");
        btnAnswer2.setText("MCDONALD'S");
        btnAnswer3.setText("TACO BELL");
    }


}
