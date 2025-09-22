package com.guesswhat.app;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

// Added for sound effects
import android.media.MediaPlayer;

public class FootballQuizActivity extends AppCompatActivity {

    protected Button btnAnswer1, btnAnswer2, btnAnswer3, btnHint, btnSkip, btnRefill, btnNext;
    protected ImageView heart1, heart2, heart3, pcImage;
    private TextView returnText;

    protected String correctAnswer = "MANCHESTER UNITED";
    protected Class<?> nextActivityClass = FootballQuizActivity2.class;

    private boolean questionAnswered = false;
    private RewardedAd rewardedAd;
    protected String currentRewardType = "";
    protected Class<?> rewardTargetClass = null;

    // Sound effects
    private MediaPlayer sfxCorrect, sfxWrong;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_football_quiz);

        MobileAds.initialize(this, initializationStatus -> {});
        loadRewardedAd();

        returnText = findViewById(R.id.returnText);
        btnAnswer1 = findViewById(R.id.btnAnswer1);
        btnAnswer2 = findViewById(R.id.btnAnswer2);
        btnAnswer3 = findViewById(R.id.btnAnswer3);
        btnHint = findViewById(R.id.btnHint);
        btnSkip = findViewById(R.id.btnSkip);
        btnRefill = findViewById(R.id.btnRefillHearts);
        btnNext = findViewById(R.id.btnNext);
        heart1 = findViewById(R.id.heart1);
        heart2 = findViewById(R.id.heart2);
        heart3 = findViewById(R.id.heart3);
        pcImage = findViewById(R.id.pcImage);
        pcImage.setImageResource(R.drawable.football1);

        // Load sound effects
        sfxCorrect = MediaPlayer.create(this, R.raw.correct);
        sfxWrong   = MediaPlayer.create(this, R.raw.wrong);

        restoreHearts();

        returnText.setOnClickListener(v -> finish());

        btnAnswer1.setOnClickListener(v -> checkAnswer(btnAnswer1));
        btnAnswer2.setOnClickListener(v -> checkAnswer(btnAnswer2));
        btnAnswer3.setOnClickListener(v -> checkAnswer(btnAnswer3));

        btnHint.setOnClickListener(v -> {
            currentRewardType = "hint";
            rewardTargetClass = null;
            showRewardedAd();
        });

        btnSkip.setOnClickListener(v -> {
            currentRewardType = "skip";
            rewardTargetClass = nextActivityClass;
            showRewardedAd();
        });

        btnRefill.setOnClickListener(v -> {
            currentRewardType = "refill";
            rewardTargetClass = null;
            showRewardedAd();
        });

        btnNext.setOnClickListener(v -> {
            if (nextActivityClass != null) {
                Intent intent = new Intent(FootballQuizActivity.this, nextActivityClass);
                startActivity(intent);
            } else {
                Intent intent = new Intent(FootballQuizActivity.this, CategoryActivity.class);
                startActivity(intent);
            }
            finish();
        });
    }

    private void loadRewardedAd() {
        AdRequest adRequest = new AdRequest.Builder().build();
        RewardedAd.load(this, "ca-app-pub-2412951628571370/3760238805", adRequest,
                new RewardedAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull RewardedAd ad) {
                        rewardedAd = ad;
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        rewardedAd = null;
                    }
                });
    }

    protected void showRewardedAd() {
        if (rewardedAd != null) {
            rewardedAd.setFullScreenContentCallback(new FullScreenContentCallback() {
                @Override
                public void onAdDismissedFullScreenContent() {
                    loadRewardedAd();
                }
            });

            rewardedAd.show(this, rewardItem -> {
                switch (currentRewardType) {
                    case "hint":
                        disableOneWrongAnswer();
                        break;
                    case "skip":
                        if (rewardTargetClass != null) {
                            Intent intent = new Intent(FootballQuizActivity.this, rewardTargetClass);
                            startActivity(intent);
                        } else {
                            Intent intent = new Intent(FootballQuizActivity.this, CategoryActivity.class);
                            startActivity(intent);
                        }
                        finish();
                        break;
                    case "refill":
                        if (AppState.hearts < 3) {
                            AppState.hearts++;
                            restoreHearts();
                            Toast.makeText(this, "+1 heart restored!", Toast.LENGTH_SHORT).show();
                        }
                        break;
                }
            });

        } else {
            Toast.makeText(this, "Ad not ready yet", Toast.LENGTH_SHORT).show();
        }
    }

    private void disableOneWrongAnswer() {
        if (!btnAnswer1.getText().toString().equals(correctAnswer)) {
            disableButton(btnAnswer1);
        } else if (!btnAnswer2.getText().toString().equals(correctAnswer)) {
            disableButton(btnAnswer2);
        } else {
            disableButton(btnAnswer3);
        }
    }

    private void disableButton(Button btn) {
        btn.setEnabled(false);
        btn.setBackgroundColor(Color.GRAY);
    }

    private void checkAnswer(Button selectedBtn) {
        if (questionAnswered) return;

        if (AppState.hearts <= 0) {
            Toast.makeText(this, "You need to refill your hearts!", Toast.LENGTH_SHORT).show();
            return;
        }

        questionAnswered = true;
        btnNext.setVisibility(View.VISIBLE);

        String selected = selectedBtn.getText().toString();
        if (selected.equals(correctAnswer)) {
            selectedBtn.setBackgroundColor(Color.parseColor("#4CAF50"));

            // Play correct sound
            if (sfxCorrect != null) {
                if (sfxCorrect.isPlaying()) sfxCorrect.seekTo(0);
                sfxCorrect.start();
            }

            Toast.makeText(this, "✅ Correct!", Toast.LENGTH_SHORT).show();
        } else {
            selectedBtn.setBackgroundColor(Color.parseColor("#F44336"));

            // Play wrong sound
            if (sfxWrong != null) {
                if (sfxWrong.isPlaying()) sfxWrong.seekTo(0);
                sfxWrong.start();
            }

            Toast.makeText(this, "❌ Wrong!", Toast.LENGTH_SHORT).show();
            removeHeart();
        }
    }

    private void removeHeart() {
        if (AppState.hearts == 3) {
            heart3.setImageDrawable(null);
        } else if (AppState.hearts == 2) {
            heart2.setImageDrawable(null);
        } else if (AppState.hearts == 1) {
            heart1.setImageDrawable(null);
        }
        AppState.hearts--;
    }

    protected void restoreHearts() {
        heart1.setImageDrawable(null);
        heart2.setImageDrawable(null);
        heart3.setImageDrawable(null);

        if (AppState.hearts >= 1) heart1.setImageResource(R.drawable.heart_red);
        if (AppState.hearts >= 2) heart2.setImageResource(R.drawable.heart_red);
        if (AppState.hearts == 3) heart3.setImageResource(R.drawable.heart_red);
    }

    protected void showRewardedAd(Class<?> targetClass) {
        this.rewardTargetClass = targetClass;
        this.currentRewardType = "skip";
        showRewardedAd();
    }

    // Release sounds when activity is destroyed
    @Override
    protected void onDestroy() {
        super.onDestroy();
        if (sfxCorrect != null) {
            sfxCorrect.release();
            sfxCorrect = null;
        }
        if (sfxWrong != null) {
            sfxWrong.release();
            sfxWrong = null;
        }
    }
}
