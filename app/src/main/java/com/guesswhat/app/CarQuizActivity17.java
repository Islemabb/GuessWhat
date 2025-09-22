package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;

public class CarQuizActivity17 extends CarQuizActivity16 {
    @Override
    protected void onStart() {
        super.onStart();

        correctAnswer = "FERRARI";
        carImage.setImageResource(R.drawable.car17);

        btnAnswer1.setText("MCLAREN");
        btnAnswer2.setText("BUGATTI");
        btnAnswer3.setText("FERRARI");

        btnSkip.setOnClickListener(v -> {
            currentRewardType = "skip";
            showRewardedAd(CarQuizActivity18.class);
        });

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(CarQuizActivity17.this, CarQuizActivity18.class);
            startActivity(intent);
            finish();
        });
    }
}