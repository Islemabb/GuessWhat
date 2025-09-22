package com.guesswhat.app;

public class FoodQuizActivity6 extends FoodQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "BURGER KING";
        nextActivityClass = FoodQuizActivity7.class;

        pcImage.setImageResource(R.drawable.food6);
        btnAnswer1.setText("MCDONALD'S");
        btnAnswer2.setText("BURGER KING");
        btnAnswer3.setText("FIVE GUYS");
    }
}