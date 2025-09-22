package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;

public class CarQuizActivity11 extends CarQuizActivity10 {
    @Override
    protected void onStart() {
        super.onStart();

        correctAnswer = "CHEVROLET";
        carImage.setImageResource(R.drawable.car11);

        btnAnswer1.setText("BMW");
        btnAnswer2.setText("AUDI");
        btnAnswer3.setText("CHEVROLET");

        btnSkip.setOnClickListener(v -> {
            currentRewardType = "skip";
            showRewardedAd(CarQuizActivity12.class);
        });

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(CarQuizActivity11.this, CarQuizActivity12.class);
            startActivity(intent);
            finish();
        });
    }
}