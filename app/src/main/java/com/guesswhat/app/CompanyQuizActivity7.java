package com.guesswhat.app;

public class CompanyQuizActivity7 extends CompanyQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "DISCORD";
        nextActivityClass = CompanyQuizActivity8.class;

        companyImage.setImageResource(R.drawable.company7);
        btnAnswer1.setText("TELEGRAM");
        btnAnswer2.setText("DISCORD");
        btnAnswer3.setText("SKYPE");
    }
}
