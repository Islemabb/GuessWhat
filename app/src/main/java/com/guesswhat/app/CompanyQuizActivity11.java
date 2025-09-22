package com.guesswhat.app;

public class CompanyQuizActivity11 extends CompanyQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "SHOPIFY";
        nextActivityClass = CompanyQuizActivity12.class;

        companyImage.setImageResource(R.drawable.company11);
        btnAnswer1.setText("SHOPIFY");
        btnAnswer2.setText("EBAY");
        btnAnswer3.setText("MAGENTO");
    }
}
