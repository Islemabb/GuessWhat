package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

public class PhoneQuizActivity1 extends PhoneQuizActivity {

    private ImageView phoneImage;

    @Override
    protected void onStart() {
        // Step 1: Connect UI before calling super
        phoneImage = findViewById(R.id.phoneImage);
        btnAnswer1 = findViewById(R.id.btnAnswer1);
        btnAnswer2 = findViewById(R.id.btnAnswer2);
        btnAnswer3 = findViewById(R.id.btnAnswer3);

        // Step 2: Call super — now buttons are ready!
        super.onStart();

        // Step 3: Set image and correct answer
        phoneImage.setImageResource(R.drawable.phone1);
        correctAnswer = "APPLE";

        // Step 4: Set answers
        btnAnswer1.setText("APPLE");
        btnAnswer2.setText("SAMSUNG");
        btnAnswer3.setText("NOKIA");

        // Step 5: Set next page + skip logic
        nextActivityClass = PhoneQuizActivity2.class;
        btnSkip.setOnClickListener(v -> showRewardedAd(PhoneQuizActivity2.class));
    }
}
