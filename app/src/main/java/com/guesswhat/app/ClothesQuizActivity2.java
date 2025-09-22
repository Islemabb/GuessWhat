package com.guesswhat.app;

public class ClothesQuizActivity2 extends ClothesQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "NIKE";
        nextActivityClass = ClothesQuizActivity3.class;

        pcImage.setImageResource(R.drawable.clothes2);
        btnAnswer1.setText("ADIDAS");
        btnAnswer2.setText("PUMA");
        btnAnswer3.setText("NIKE");
    }
}
