package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;

public class CarQuizActivity16 extends CarQuizActivity15 {
    @Override
    protected void onStart() {
        super.onStart();

        correctAnswer = "LAMBORGHINI";
        carImage.setImageResource(R.drawable.car16);

        btnAnswer1.setText("PORSCHE");
        btnAnswer2.setText("LAMBORGHINI");
        btnAnswer3.setText("FERRARI");

        btnSkip.setOnClickListener(v -> {
            currentRewardType = "skip";
            showRewardedAd(CarQuizActivity17.class);
        });

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(CarQuizActivity16.this, CarQuizActivity17.class);
            startActivity(intent);
            finish();
        });
    }
}