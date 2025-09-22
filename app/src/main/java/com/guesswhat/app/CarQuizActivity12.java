package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;

public class CarQuizActivity12 extends CarQuizActivity11 {
    @Override
    protected void onStart() {
        super.onStart();

        correctAnswer = "NISSAN";
        carImage.setImageResource(R.drawable.car12);

        btnAnswer1.setText("NISSAN");
        btnAnswer2.setText("AUDI");
        btnAnswer3.setText("BMW");

        btnSkip.setOnClickListener(v -> {
            currentRewardType = "skip";
            showRewardedAd(CarQuizActivity13.class);
        });

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(CarQuizActivity12.this, CarQuizActivity13.class);
            startActivity(intent);
            finish();
        });
    }
}