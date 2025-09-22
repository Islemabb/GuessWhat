package com.guesswhat.app;

public class FoodQuizActivity2 extends FoodQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "STARBUCKS";
        nextActivityClass = FoodQuizActivity3.class;

        pcImage.setImageResource(R.drawable.food2);
        btnAnswer1.setText("STARBUCKS");
        btnAnswer2.setText("COSTA COFFEE");
        btnAnswer3.setText("PEET'S COFFEE");
    }
}