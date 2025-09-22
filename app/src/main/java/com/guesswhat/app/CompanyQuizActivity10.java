package com.guesswhat.app;

public class CompanyQuizActivity10 extends CompanyQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "ALIBABA";
        nextActivityClass = CompanyQuizActivity11.class;

        companyImage.setImageResource(R.drawable.company10);
        btnAnswer1.setText("JD.COM");
        btnAnswer2.setText("AMAZON");
        btnAnswer3.setText("ALIBABA");
    }
}
