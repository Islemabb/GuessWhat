package com.guesswhat.app;

public class ClothesQuizActivity8 extends ClothesQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "H&M";
        nextActivityClass = ClothesQuizActivity9.class;

        pcImage.setImageResource(R.drawable.clothes8);
        btnAnswer3.setText("H&M");
        btnAnswer1.setText("ZARA");
        btnAnswer2.setText("BERSHKA");
    }
}
