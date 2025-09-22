package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class PhoneQuizActivity4 extends PhoneQuizActivity3 {

    private ImageView phoneImage;

    @Override
    protected void onStart() {
        super.onStart();

        phoneImage = findViewById(R.id.phoneImage);

        correctAnswer = "HUAWEI";
        phoneImage.setImageResource(R.drawable.phone4);

        btnAnswer1.setText("HONOR");
        btnAnswer2.setText("HUAWEI");
        btnAnswer3.setText("INFINIX");

        btnSkip.setOnClickListener(v -> showRewardedAd(PhoneQuizActivity5.class));

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(this, PhoneQuizActivity5.class);
            startActivity(intent);
            finish();
        });
    }
}
