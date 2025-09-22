package com.guesswhat.app;

public class CompanyQuizActivity8 extends CompanyQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "WALMART";
        nextActivityClass = CompanyQuizActivity9.class;

        companyImage.setImageResource(R.drawable.company8);
        btnAnswer1.setText("COSTCO");
        btnAnswer2.setText("TARGET");
        btnAnswer3.setText("WALMART");
    }
}
