package com.guesswhat.app;

public class CompanyQuizActivity16 extends CompanyQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "ALDI";
        nextActivityClass = CompanyQuizActivity17.class;

        companyImage.setImageResource(R.drawable.company16);
        btnAnswer1.setText("SPAR");
        btnAnswer2.setText("ALDI");
        btnAnswer3.setText("LIDL");
    }
}
