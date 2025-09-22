package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class PhoneQuizActivity9 extends PhoneQuizActivity8 {

    private ImageView phoneImage;

    @Override
    protected void onStart() {
        super.onStart();

        phoneImage = findViewById(R.id.phoneImage);

        correctAnswer = "INFINIX";
        phoneImage.setImageResource(R.drawable.phone9);

        btnAnswer1.setText("LENOVO");
        btnAnswer2.setText("APPLE");
        btnAnswer3.setText("INFINIX");

        btnSkip.setOnClickListener(v -> showRewardedAd(PhoneQuizActivity10.class));

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(this, PhoneQuizActivity10.class);
            startActivity(intent);
            finish();
        });
    }
}
