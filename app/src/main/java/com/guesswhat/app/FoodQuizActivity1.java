package com.guesswhat.app;

public class FoodQuizActivity1 extends FoodQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "MCDONALD'S";
        nextActivityClass = FoodQuizActivity2.class;

        pcImage.setImageResource(R.drawable.food1);
        btnAnswer1.setText("SUBWAY");
        btnAnswer2.setText("MCDONALD'S");
        btnAnswer3.setText("PIZZA HUT");
    }
}