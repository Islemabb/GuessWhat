package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class PhoneQuizActivity7 extends PhoneQuizActivity6 {

    private ImageView phoneImage;

    @Override
    protected void onStart() {
        super.onStart();

        phoneImage = findViewById(R.id.phoneImage);

        correctAnswer = "XIAOMI";
        phoneImage.setImageResource(R.drawable.phone7);

        btnAnswer1.setText("TECNO");
        btnAnswer2.setText("LENOVO");
        btnAnswer3.setText("XIAOMI");

        btnSkip.setOnClickListener(v -> showRewardedAd(PhoneQuizActivity8.class));

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(this, PhoneQuizActivity8.class);
            startActivity(intent);
            finish();
        });
    }
}
