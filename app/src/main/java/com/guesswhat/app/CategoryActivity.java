package com.guesswhat.app;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CategoryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);

        // Return Button
        TextView returnText = findViewById(R.id.returnText);
        returnText.setOnClickListener(v -> {
            finish();
        });

        // Car category click
        ImageView carBox = findViewById(R.id.carCategoryBox);
        carBox.setOnClickListener(v -> {
            Intent intent = new Intent(CategoryActivity.this, CarQuizActivity.class);
            startActivity(intent);
        });

        // Phone category click
        ImageView phoneBox = findViewById(R.id.phoneCategoryBox);
        phoneBox.setOnClickListener(v -> {
            Intent intent = new Intent(CategoryActivity.this, PhoneQuizActivity1.class);
            startActivity(intent);
        });

        // ✅ PC category click
        ImageView pcBox = findViewById(R.id.pcCategoryBox);
        pcBox.setOnClickListener(v -> {
            Intent intent = new Intent(CategoryActivity.this, PCQuizActivity.class);
            startActivity(intent);
        });

        // Company
        ImageView companyBox = findViewById(R.id.moneyCategoryBox); // or use the correct ID from your layout
        companyBox.setOnClickListener(v -> {
            Intent intent = new Intent(CategoryActivity.this, CompanyQuizActivity1.class);
            startActivity(intent);
        });

        // Famous People
        ImageView FamousBox = findViewById(R.id.personCategoryBox); // or use the correct ID from your layout
        FamousBox.setOnClickListener(v -> {
            Intent intent = new Intent(CategoryActivity.this, FamousQuizActivity1.class);
            startActivity(intent);
        });

        // clothesCategoryBox
        ImageView ClothesBox = findViewById(R.id.clothesCategoryBox); // or use the correct ID from your layout
        ClothesBox.setOnClickListener(v -> {
            Intent intent = new Intent(CategoryActivity.this, ClothesQuizActivity1.class);
            startActivity(intent);
        });

        // foodCategoryBox
        ImageView FoodBox = findViewById(R.id.foodCategoryBox); // or use the correct ID from your layout
        FoodBox.setOnClickListener(v -> {
            Intent intent = new Intent(CategoryActivity.this, FoodQuizActivity1.class);
            startActivity(intent);
        });

        //footballCategoryBox
        ImageView FootballBox = findViewById(R.id.footballCategoryBox); // or use the correct ID from your layout
        FootballBox.setOnClickListener(v -> {
            Intent intent = new Intent(CategoryActivity.this, FootballQuizActivity1.class);
            startActivity(intent);
        });
    }
}
