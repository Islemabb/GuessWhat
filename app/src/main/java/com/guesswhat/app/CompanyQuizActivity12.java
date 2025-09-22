package com.guesswhat.app;

public class CompanyQuizActivity12 extends CompanyQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "LIDL";
        nextActivityClass = CompanyQuizActivity13.class;

        companyImage.setImageResource(R.drawable.company12);
        btnAnswer1.setText("TESCO");
        btnAnswer2.setText("LIDL");
        btnAnswer3.setText("CARREFOUR");
    }
}
