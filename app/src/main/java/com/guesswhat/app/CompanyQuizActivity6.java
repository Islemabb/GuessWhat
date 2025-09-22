package com.guesswhat.app;

public class CompanyQuizActivity6 extends CompanyQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "META";
        nextActivityClass = CompanyQuizActivity7.class;

        companyImage.setImageResource(R.drawable.company6);
        btnAnswer1.setText("META");
        btnAnswer2.setText("SNAPCHAT");
        btnAnswer3.setText("TIKTOK");
    }
}
