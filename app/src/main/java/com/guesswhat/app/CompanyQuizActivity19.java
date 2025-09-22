package com.guesswhat.app;

public class CompanyQuizActivity19 extends CompanyQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "NUTELLA";
        nextActivityClass = CompanyQuizActivity20.class;

        companyImage.setImageResource(R.drawable.company19);
        btnAnswer1.setText("KINDER");
        btnAnswer2.setText("OREO");
        btnAnswer3.setText("NUTELLA");
    }
}
