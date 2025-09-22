package com.guesswhat.app;

import android.content.Intent;

public class FootballQuizActivity15 extends FootballQuizActivity {
    @Override
    protected void onStart() {
        super.onStart();
        correctAnswer = "MANCHESTER CITY";
        nextActivityClass = CategoryActivity.class;

        pcImage.setImageResource(R.drawable.football15);
        btnAnswer1.setText("LIVERPOOL");
        btnAnswer2.setText("MANCHESTER CITY");
        btnAnswer3.setText("TOTTENHAM HOTSPUR");
    }


}
