package com.guesswhat.app;

public class ClothesQuizActivity7 extends ClothesQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "LACOSTE";
        nextActivityClass = ClothesQuizActivity8.class;

        pcImage.setImageResource(R.drawable.clothes7);
        btnAnswer3.setText("TOMMY HILFIGER");
        btnAnswer1.setText("HUGO BOSS");
        btnAnswer2.setText("LACOSTE");
    }
}
