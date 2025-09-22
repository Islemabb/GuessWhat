package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;

public class CarQuizActivity10 extends CarQuizActivity9 {
    @Override
    protected void onStart() {
        super.onStart();

        correctAnswer = "OPEL";
        carImage.setImageResource(R.drawable.car10);

        btnAnswer1.setText("OPEL");
        btnAnswer2.setText("AUDI");
        btnAnswer3.setText("BMW");

        btnSkip.setOnClickListener(v -> {
            currentRewardType = "skip";
            showRewardedAd(CarQuizActivity11.class);
        });

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(CarQuizActivity10.this, CarQuizActivity11.class);
            startActivity(intent);
            finish();
        });
    }
}