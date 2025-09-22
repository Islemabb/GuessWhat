package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

public class PhoneQuizActivity10 extends PhoneQuizActivity9 {

    private ImageView phoneImage;

    @Override
    protected void onStart() {
        super.onStart();

        phoneImage = findViewById(R.id.phoneImage);

        correctAnswer = "LENOVO";
        phoneImage.setImageResource(R.drawable.phone10);

        btnAnswer1.setText("LENOVO");
        btnAnswer2.setText("TECNO");
        btnAnswer3.setText("XIAOMI");

        btnSkip.setOnClickListener(v -> {
            Intent intent = new Intent(this, CategoryActivity.class);
            startActivity(intent);
            finish();
        });

        btnNext.setOnClickListener(v -> {
            Intent intent = new Intent(this, CategoryActivity.class);
            startActivity(intent);
            finish();
        });
    }
}
