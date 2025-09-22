package com.guesswhat.app;

public class ClothesQuizActivity9 extends ClothesQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "GUCCI";
        nextActivityClass = ClothesQuizActivity10.class;

        pcImage.setImageResource(R.drawable.clothes9);
        btnAnswer3.setText("PRADA");
        btnAnswer1.setText("BALENCIAGA");
        btnAnswer2.setText("GUCCI");
    }
}
