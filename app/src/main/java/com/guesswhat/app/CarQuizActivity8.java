package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;

public class CarQuizActivity8 extends CarQuizActivity7 {
    @Override
    protected void onStart() {
        super.onStart();

        correctAnswer = "HYUNDAI";
        carImage.setImageResource(R.drawable.car8);

        btnAnswer1.setText("BMW");
        btnAnswer2.setText("AUDI");
        btnAnswer3.setText("HYUNDAI");

        btnSkip.setOnClickListener(v -> {
            currentRewardType = "skip";
            showRewardedAd(CarQuizActivity9.class);
        });

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(CarQuizActivity8.this, CarQuizActivity9.class);
            startActivity(intent);
            finish();
        });
    }
}