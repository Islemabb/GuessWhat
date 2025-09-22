package com.guesswhat.app;

public class FamousQuizActivity2 extends FamousQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "CRISTIANO RONALDO";
        nextActivityClass = FamousQuizActivity3.class;

        pcImage.setImageResource(R.drawable.famous2);
        btnAnswer1.setText("MBAPPE");
        btnAnswer2.setText("CRISTIANO RONALDO");
        btnAnswer3.setText("NEYMAR");
    }
}
