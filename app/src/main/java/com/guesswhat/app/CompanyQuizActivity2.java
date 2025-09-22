package com.guesswhat.app;

public class CompanyQuizActivity2 extends CompanyQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "MICROSOFT";
        nextActivityClass = CompanyQuizActivity3.class;

        companyImage.setImageResource(R.drawable.company2);
        btnAnswer1.setText("GOOGLE");
        btnAnswer2.setText("MICROSOFT");
        btnAnswer3.setText("APPLE");
    }
}
