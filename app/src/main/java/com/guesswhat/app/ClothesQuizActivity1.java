package com.guesswhat.app;

public class ClothesQuizActivity1 extends ClothesQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "LOUIS VUITTON";
        nextActivityClass = ClothesQuizActivity2.class;

        pcImage.setImageResource(R.drawable.clothes1);
        btnAnswer1.setText("GUCCI");
        btnAnswer2.setText("PRADA");
        btnAnswer3.setText("LOUIS VUITTON");
    }
}
