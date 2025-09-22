package com.guesswhat.app;

public class CompanyQuizActivity5 extends CompanyQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "AMAZON";
        nextActivityClass = CompanyQuizActivity6.class;

        companyImage.setImageResource(R.drawable.company5);
        btnAnswer1.setText("EBAY");
        btnAnswer2.setText("SHOPIFY");
        btnAnswer3.setText("AMAZON");
    }
}
