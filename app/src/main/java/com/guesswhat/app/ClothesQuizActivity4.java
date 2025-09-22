package com.guesswhat.app;

public class ClothesQuizActivity4 extends ClothesQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "REEBOK";
        nextActivityClass = ClothesQuizActivity5.class;

        pcImage.setImageResource(R.drawable.clothes4);
        btnAnswer1.setText("NIKE");
        btnAnswer3.setText("REEBOK");
        btnAnswer2.setText("PUMA");
    }
}
