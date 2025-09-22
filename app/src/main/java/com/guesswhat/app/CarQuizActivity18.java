package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;

public class CarQuizActivity18 extends CarQuizActivity17 {
    @Override
    protected void onStart() {
        super.onStart();

        correctAnswer = "MASERATI";
        carImage.setImageResource(R.drawable.car18);

        btnAnswer1.setText("MASERATI");
        btnAnswer2.setText("BENTLEY");
        btnAnswer3.setText("PORSCHE");

        btnSkip.setOnClickListener(v -> {
            currentRewardType = "skip";
            showRewardedAd(CarQuizActivity19.class);
        });

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(CarQuizActivity18.this, CarQuizActivity19.class);
            startActivity(intent);
            finish();
        });
    }
}