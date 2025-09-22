package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class PhoneQuizActivity3 extends PhoneQuizActivity2 {

    private ImageView phoneImage;

    @Override
    protected void onStart() {
        super.onStart();

        phoneImage = findViewById(R.id.phoneImage);

        correctAnswer = "NOKIA";
        phoneImage.setImageResource(R.drawable.phone3);

        btnAnswer1.setText("HUAWEI");
        btnAnswer2.setText("HONOR");
        btnAnswer3.setText("NOKIA");

        btnSkip.setOnClickListener(v -> showRewardedAd(PhoneQuizActivity4.class));

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(this, PhoneQuizActivity4.class);
            startActivity(intent);
            finish();
        });
    }
}
