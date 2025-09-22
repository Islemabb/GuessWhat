package com.guesswhat.app;

public class CompanyQuizActivity1 extends CompanyQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "NVIDIA";
        nextActivityClass = CompanyQuizActivity2.class;

        companyImage.setImageResource(R.drawable.company1);
        btnAnswer1.setText("NVIDIA");
        btnAnswer2.setText("INTEL");
        btnAnswer3.setText("AMD");
    }
}
