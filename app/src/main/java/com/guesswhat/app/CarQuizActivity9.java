package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;

public class CarQuizActivity9 extends CarQuizActivity8 {
    @Override
    protected void onStart() {
        super.onStart();

        correctAnswer = "MAZDA";
        carImage.setImageResource(R.drawable.car9);

        btnAnswer1.setText("AUDI");
        btnAnswer2.setText("MAZDA");
        btnAnswer3.setText("BMW");

        btnSkip.setOnClickListener(v -> {
            currentRewardType = "skip";
            showRewardedAd(CarQuizActivity10.class);
        });

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(CarQuizActivity9.this, CarQuizActivity10.class);
            startActivity(intent);
            finish();
        });
    }
}