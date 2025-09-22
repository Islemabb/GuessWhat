package com.guesswhat.app;

public class CompanyQuizActivity3 extends CompanyQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "APPLE";
        nextActivityClass = CompanyQuizActivity4.class;

        companyImage.setImageResource(R.drawable.company3);
        btnAnswer1.setText("APPLE");
        btnAnswer2.setText("SAMSUNG");
        btnAnswer3.setText("HUAWEI");
    }
}
