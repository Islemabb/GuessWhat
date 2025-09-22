package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class PhoneQuizActivity8 extends PhoneQuizActivity7 {

    private ImageView phoneImage;

    @Override
    protected void onStart() {
        super.onStart();

        phoneImage = findViewById(R.id.phoneImage);

        correctAnswer = "HONOR";
        phoneImage.setImageResource(R.drawable.phone8);

        btnAnswer1.setText("INFINIX");
        btnAnswer2.setText("HONOR");
        btnAnswer3.setText("NOKIA");

        btnSkip.setOnClickListener(v -> showRewardedAd(PhoneQuizActivity9.class));

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(this, PhoneQuizActivity9.class);
            startActivity(intent);
            finish();
        });
    }
}
