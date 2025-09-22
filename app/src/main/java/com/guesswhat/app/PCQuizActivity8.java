package com.guesswhat.app;

import android.content.Intent;

public class PCQuizActivity8 extends PCQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "Samsung";
        nextActivityClass = CategoryActivity.class;

        pcImage.setImageResource(R.drawable.pc8);
        btnAnswer1.setText("HP");
        btnAnswer2.setText("Asus");
        btnAnswer3.setText("Samsung");
    }


}
