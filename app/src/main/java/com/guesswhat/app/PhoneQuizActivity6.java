package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class PhoneQuizActivity6 extends PhoneQuizActivity5 {

    private ImageView phoneImage;

    @Override
    protected void onStart() {
        super.onStart();

        phoneImage = findViewById(R.id.phoneImage);

        correctAnswer = "OPPO";
        phoneImage.setImageResource(R.drawable.phone6);

        btnAnswer1.setText("OPPO");
        btnAnswer2.setText("APPLE");
        btnAnswer3.setText("HUAWEI");

        btnSkip.setOnClickListener(v -> showRewardedAd(PhoneQuizActivity7.class));

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(this, PhoneQuizActivity7.class);
            startActivity(intent);
            finish();
        });
    }
}
