package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class PhoneQuizActivity2 extends PhoneQuizActivity {

    private ImageView phoneImage;

    @Override
    protected void onStart() {
        super.onStart();

        phoneImage = findViewById(R.id.phoneImage);

        correctAnswer = "SAMSUNG";
        phoneImage.setImageResource(R.drawable.phone2);

        btnAnswer1.setText("NOKIA");
        btnAnswer2.setText("SAMSUNG");
        btnAnswer3.setText("OPPO");

        btnSkip.setOnClickListener(v -> showRewardedAd(PhoneQuizActivity3.class));

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(this, PhoneQuizActivity3.class);
            startActivity(intent);
            finish();
        });
    }
}
