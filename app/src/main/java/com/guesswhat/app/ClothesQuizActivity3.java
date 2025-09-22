package com.guesswhat.app;

public class ClothesQuizActivity3 extends ClothesQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "ADIDAS";
        nextActivityClass = ClothesQuizActivity4.class;

        pcImage.setImageResource(R.drawable.clothes3);
        btnAnswer1.setText("ADIDAS");
        btnAnswer2.setText("REEBOK");
        btnAnswer3.setText("NIKE");
    }
}
