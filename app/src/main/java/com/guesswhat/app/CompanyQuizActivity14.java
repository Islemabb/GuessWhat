package com.guesswhat.app;

public class CompanyQuizActivity14 extends CompanyQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "BIEDRONKA";
        nextActivityClass = CompanyQuizActivity15.class;

        companyImage.setImageResource(R.drawable.company14);
        btnAnswer1.setText("ALDI");
        btnAnswer2.setText("LIDL");
        btnAnswer3.setText("BIEDRONKA");
    }
}
