package com.guesswhat.app;

public class FoodQuizActivity5 extends FoodQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "DOMINO'S";
        nextActivityClass = FoodQuizActivity6.class;

        pcImage.setImageResource(R.drawable.food5);
        btnAnswer1.setText("PIZZA HUT");
        btnAnswer2.setText("CICI'S PIZZA");
        btnAnswer3.setText("DOMINO'S");
    }
}