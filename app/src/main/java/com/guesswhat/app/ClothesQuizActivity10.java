package com.guesswhat.app;

import android.content.Intent;

public class ClothesQuizActivity10 extends ClothesQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "RALPH LAUREN";
        nextActivityClass = CategoryActivity.class;

        pcImage.setImageResource(R.drawable.clothes10);
        btnAnswer1.setText("RALPH LAUREN");
        btnAnswer2.setText("TOMMY HILFIGER");
        btnAnswer3.setText("LACOSTE");
    }


}
