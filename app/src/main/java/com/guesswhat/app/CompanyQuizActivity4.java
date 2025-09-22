package com.guesswhat.app;

public class CompanyQuizActivity4 extends CompanyQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "ALPHABET";
        nextActivityClass = CompanyQuizActivity5.class;

        companyImage.setImageResource(R.drawable.company4);
        btnAnswer1.setText("AMAZON");
        btnAnswer2.setText("MICROSOFT");
        btnAnswer3.setText("ALPHABET");
    }
}
