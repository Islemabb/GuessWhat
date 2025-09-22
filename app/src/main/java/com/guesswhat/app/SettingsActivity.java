package com.guesswhat.app;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class SettingsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        TextView returnText = findViewById(R.id.returnText);
        returnText.setOnClickListener(v -> {
            finish(); // Go back to MainActivity
        });

    }
}
