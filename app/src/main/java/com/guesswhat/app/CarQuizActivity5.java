package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;

public class CarQuizActivity5 extends CarQuizActivity4 {
    @Override
    protected void onStart() {
        super.onStart();

        correctAnswer = "TOYOTA";
        carImage.setImageResource(R.drawable.car5);

        btnAnswer1.setText("PEUGEOT");
        btnAnswer2.setText("TOYOTA");
        btnAnswer3.setText("FORD");

        btnSkip.setOnClickListener(v -> {
            currentRewardType = "skip";
            showRewardedAd(CarQuizActivity6.class);
        });

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(CarQuizActivity5.this, CarQuizActivity6.class);
            startActivity(intent);
            finish();
        });
    }
}
