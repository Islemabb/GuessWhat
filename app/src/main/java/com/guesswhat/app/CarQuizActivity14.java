package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;

public class CarQuizActivity14 extends CarQuizActivity13 {
    @Override
    protected void onStart() {
        super.onStart();

        correctAnswer = "VOLKSWAGEN";
        carImage.setImageResource(R.drawable.car14);

        btnAnswer1.setText("BMW");
        btnAnswer2.setText("AUDI");
        btnAnswer3.setText("VOLKSWAGEN");

        btnSkip.setOnClickListener(v -> {
            currentRewardType = "skip";
            showRewardedAd(CarQuizActivity15.class);
        });

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(CarQuizActivity14.this, CarQuizActivity15.class);
            startActivity(intent);
            finish();
        });
    }
}