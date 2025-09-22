package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;

public class CarQuizActivity20 extends CarQuizActivity19 {
    @Override
    protected void onStart() {
        super.onStart();

        correctAnswer = "KOENIGSEGG";
        carImage.setImageResource(R.drawable.car20);

        btnAnswer1.setText("KOENIGSEGG");
        btnAnswer2.setText("AUDI");
        btnAnswer3.setText("LAMBORGHINI");

        btnSkip.setOnClickListener(v -> {
            currentRewardType = "skip";
            showRewardedAd(CategoryActivity.class);
        });

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(CarQuizActivity20.this, CategoryActivity.class);
            startActivity(intent);
            finish();
        });
    }
}