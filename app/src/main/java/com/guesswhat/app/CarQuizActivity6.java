package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;

public class CarQuizActivity6 extends CarQuizActivity5 {
    @Override
    protected void onStart() {
        super.onStart();

        correctAnswer = "HONDA";
        carImage.setImageResource(R.drawable.car6);

        btnAnswer1.setText("AUDI");
        btnAnswer2.setText("HONDA");
        btnAnswer3.setText("BMW");

        btnSkip.setOnClickListener(v -> {
            currentRewardType = "skip";
            showRewardedAd(CarQuizActivity7.class);
        });

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(CarQuizActivity6.this, CarQuizActivity7.class);
            startActivity(intent);
            finish();
        });
    }
}
