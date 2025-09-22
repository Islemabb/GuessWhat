package com.guesswhat.app;

public class ClothesQuizActivity6 extends ClothesQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "ZARA";
        nextActivityClass = ClothesQuizActivity7.class;

        pcImage.setImageResource(R.drawable.clothes6);
        btnAnswer3.setText("PUMA");
        btnAnswer1.setText("ZARA");
        btnAnswer2.setText("ADIDAS");
    }
}
