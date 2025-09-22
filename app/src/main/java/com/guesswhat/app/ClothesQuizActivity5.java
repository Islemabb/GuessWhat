package com.guesswhat.app;

public class ClothesQuizActivity5 extends ClothesQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "PUMA";
        nextActivityClass = ClothesQuizActivity6.class;

        pcImage.setImageResource(R.drawable.clothes5);
        btnAnswer3.setText("NIKE");
        btnAnswer1.setText("ZARA");
        btnAnswer2.setText("PUMA");
    }
}
