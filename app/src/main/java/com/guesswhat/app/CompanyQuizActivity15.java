package com.guesswhat.app;

public class CompanyQuizActivity15 extends CompanyQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "ROCKSTAR GAMES";
        nextActivityClass = CompanyQuizActivity16.class;

        companyImage.setImageResource(R.drawable.company15);
        btnAnswer1.setText("UBISOFT");
        btnAnswer2.setText("ROCKSTAR GAMES");
        btnAnswer3.setText("ELECTRONIC ARTS");
    }
}
