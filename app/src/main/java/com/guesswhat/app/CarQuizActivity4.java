package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;

public class CarQuizActivity4 extends CarQuizActivity3 {
    @Override
    protected void onStart() {
        super.onStart();

        correctAnswer = "PORSCHE";
        carImage.setImageResource(R.drawable.car4);

        btnAnswer1.setText("PORSCHE");
        btnAnswer2.setText("MAZDA");
        btnAnswer3.setText("NISSAN");

        btnSkip.setOnClickListener(v -> {
            currentRewardType = "skip";
            showRewardedAd(CarQuizActivity5.class);
        });

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(CarQuizActivity4.this, CarQuizActivity5.class);
            startActivity(intent);
            finish();
        });
    }
}
