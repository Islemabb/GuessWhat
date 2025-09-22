package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;

public class CarQuizActivity13 extends CarQuizActivity12 {
    @Override
    protected void onStart() {
        super.onStart();

        correctAnswer = "PEUGEOT";
        carImage.setImageResource(R.drawable.car13);

        btnAnswer1.setText("AUDI");
        btnAnswer2.setText("PEUGEOT");
        btnAnswer3.setText("BMW");

        btnSkip.setOnClickListener(v -> {
            currentRewardType = "skip";
            showRewardedAd(CarQuizActivity14.class);
        });

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(CarQuizActivity13.this, CarQuizActivity14.class);
            startActivity(intent);
            finish();
        });
    }
}