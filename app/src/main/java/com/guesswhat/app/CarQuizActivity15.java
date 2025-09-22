package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;

public class CarQuizActivity15 extends CarQuizActivity14 {
    @Override
    protected void onStart() {
        super.onStart();

        correctAnswer = "TESLA";
        carImage.setImageResource(R.drawable.car15);

        btnAnswer1.setText("TESLA");
        btnAnswer2.setText("AUDI");
        btnAnswer3.setText("BMW");

        btnSkip.setOnClickListener(v -> {
            currentRewardType = "skip";
            showRewardedAd(CarQuizActivity16.class);
        });

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(CarQuizActivity15.this, CarQuizActivity16.class);
            startActivity(intent);
            finish();
        });
    }
}