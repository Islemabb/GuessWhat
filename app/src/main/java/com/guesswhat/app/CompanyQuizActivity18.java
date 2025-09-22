package com.guesswhat.app;

public class CompanyQuizActivity18 extends CompanyQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "TELEGRAM";
        nextActivityClass = CompanyQuizActivity19.class;

        companyImage.setImageResource(R.drawable.company18);
        btnAnswer1.setText("TELEGRAM");
        btnAnswer2.setText("WHATSAPP");
        btnAnswer3.setText("SIGNAL");
    }
}
