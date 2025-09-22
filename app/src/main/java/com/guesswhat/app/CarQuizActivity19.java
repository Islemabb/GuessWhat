package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;

public class CarQuizActivity19 extends CarQuizActivity18 {
    @Override
    protected void onStart() {
        super.onStart();

        correctAnswer = "BUGATTI";
        carImage.setImageResource(R.drawable.car19);

        btnAnswer1.setText("PAGANI");
        btnAnswer2.setText("MCLAREN");
        btnAnswer3.setText("BUGATTI");

        btnSkip.setOnClickListener(v -> {
            currentRewardType = "skip";
            showRewardedAd(CarQuizActivity20.class);
        });

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(CarQuizActivity19.this, CarQuizActivity20.class);
            startActivity(intent);
            finish();
        });
    }
}