package com.guesswhat.app;

public class FoodQuizActivity3 extends FoodQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "WENDY'S";
        nextActivityClass = FoodQuizActivity4.class;

        pcImage.setImageResource(R.drawable.food3);
        btnAnswer1.setText("MCDONALD'S");
        btnAnswer2.setText("KFC");
        btnAnswer3.setText("WENDY'S");
    }
}