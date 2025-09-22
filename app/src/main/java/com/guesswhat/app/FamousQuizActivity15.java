package com.guesswhat.app;

import android.content.Intent;

public class FamousQuizActivity15 extends PCQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "KEVIN HART";
        nextActivityClass = CategoryActivity.class;

        pcImage.setImageResource(R.drawable.famous15);
        btnAnswer1.setText("KEVIN HART");
        btnAnswer2.setText("CHRIS ROCK");
        btnAnswer3.setText("MARTIN LAWRENCE");
    }


}
