package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseQuizActivity extends AppCompatActivity {

    protected Button btnAnswer1, btnAnswer2, btnAnswer3;
    protected Button btnHint, btnSkip, btnRefillHearts, btnNext;
    protected ImageView heart1, heart2, heart3;
    protected String correctAnswer;
    protected String currentRewardType = "";
    protected Class<?> rewardTargetClass;

    protected abstract int getLayoutResourceId(); // New: let children choose layout

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutResourceId()); // Load layout dynamically

        // Common button references
        btnAnswer1 = findViewById(R.id.btnAnswer1);
        btnAnswer2 = findViewById(R.id.btnAnswer2);
        btnAnswer3 = findViewById(R.id.btnAnswer3);
        btnHint = findViewById(R.id.btnHint);
        btnSkip = findViewById(R.id.btnSkip);
        btnRefillHearts = findViewById(R.id.btnRefillHearts);
        btnNext = findViewById(R.id.btnNext);
        heart1 = findViewById(R.id.heart1);
        heart2 = findViewById(R.id.heart2);
        heart3 = findViewById(R.id.heart3);

        // Dummy ad button behavior
        btnHint.setOnClickListener(v -> Toast.makeText(this, "Hint Ad", Toast.LENGTH_SHORT).show());
        btnRefillHearts.setOnClickListener(v -> Toast.makeText(this, "Refill Ad", Toast.LENGTH_SHORT).show());
    }

    protected void showRewardedAd(Class<?> targetClass) {
        this.rewardTargetClass = targetClass;
        currentRewardType = "skip";
        showRewardedAd();
    }

    protected void showRewardedAd() {
        if (rewardTargetClass != null) {
            Intent intent = new Intent(this, rewardTargetClass);
            startActivity(intent);
            finish();
        }
    }
}
