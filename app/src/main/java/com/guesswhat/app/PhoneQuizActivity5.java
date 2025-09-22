package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class PhoneQuizActivity5 extends PhoneQuizActivity4 {

    private ImageView phoneImage;

    @Override
    protected void onStart() {
        super.onStart();

        phoneImage = findViewById(R.id.phoneImage);

        correctAnswer = "TECNO";
        phoneImage.setImageResource(R.drawable.phone5);

        btnAnswer1.setText("TECNO");
        btnAnswer2.setText("SAMSUNG");
        btnAnswer3.setText("XIAOMI");

        btnSkip.setOnClickListener(v -> showRewardedAd(PhoneQuizActivity6.class));

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(this, PhoneQuizActivity6.class);
            startActivity(intent);
            finish();
        });
    }
}
