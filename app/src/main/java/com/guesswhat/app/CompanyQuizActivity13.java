package com.guesswhat.app;

public class CompanyQuizActivity13 extends CompanyQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "SPOTIFY";
        nextActivityClass = CompanyQuizActivity14.class;

        companyImage.setImageResource(R.drawable.company13);
        btnAnswer1.setText("SPOTIFY");
        btnAnswer2.setText("DEEZER");
        btnAnswer3.setText("TIDAL");
    }
}
