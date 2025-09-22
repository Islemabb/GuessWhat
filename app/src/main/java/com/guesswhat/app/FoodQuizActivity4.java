package com.guesswhat.app;

public class FoodQuizActivity4 extends FoodQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "KFC";
        nextActivityClass = FoodQuizActivity5.class;

        pcImage.setImageResource(R.drawable.food4);
        btnAnswer1.setText("KFC");
        btnAnswer2.setText("JOLLIBEE");
        btnAnswer3.setText("POPEYES");
    }
}