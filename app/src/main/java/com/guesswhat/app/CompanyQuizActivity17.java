package com.guesswhat.app;

public class CompanyQuizActivity17 extends CompanyQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "CARREFOUR";
        nextActivityClass = CompanyQuizActivity18.class;

        companyImage.setImageResource(R.drawable.company17);
        btnAnswer1.setText("TESCO");
        btnAnswer2.setText("CARREFOUR");
        btnAnswer3.setText("ALDI");
    }
}
