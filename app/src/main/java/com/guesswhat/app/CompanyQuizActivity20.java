package com.guesswhat.app;

import android.content.Intent;

public class CompanyQuizActivity20 extends CompanyQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "STEAM";
        nextActivityClass = CategoryActivity.class;

        companyImage.setImageResource(R.drawable.company20);
        btnAnswer1.setText("ORIGIN");
        btnAnswer2.setText("EPIC GAMES");
        btnAnswer3.setText("STEAM");
    }
}
