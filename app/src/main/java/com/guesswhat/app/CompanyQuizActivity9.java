package com.guesswhat.app;

public class CompanyQuizActivity9 extends CompanyQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "MASTERCARD";
        nextActivityClass = CompanyQuizActivity10.class;

        companyImage.setImageResource(R.drawable.company9);
        btnAnswer1.setText("MASTERCARD");
        btnAnswer2.setText("VISA");
        btnAnswer3.setText("PAYPAL");
    }
}
