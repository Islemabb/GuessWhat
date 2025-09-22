package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;

public class CarQuizActivity7 extends CarQuizActivity6 {
    @Override
    protected void onStart() {
        super.onStart();

        correctAnswer = "FORD";
        carImage.setImageResource(R.drawable.car7);

        btnAnswer1.setText("FORD");
        btnAnswer2.setText("TESLA");
        btnAnswer3.setText("OPEL");

        btnSkip.setOnClickListener(v -> {
            currentRewardType = "skip";
            showRewardedAd(CarQuizActivity8.class);
        });

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(CarQuizActivity7.this, CarQuizActivity8.class);
            startActivity(intent);
            finish();
        });
    }
}
