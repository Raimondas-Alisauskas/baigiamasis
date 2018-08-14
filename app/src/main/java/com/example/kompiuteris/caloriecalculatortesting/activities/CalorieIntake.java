package com.example.kompiuteris.caloriecalculatortesting.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.kompiuteris.caloriecalculatortesting.InputValidation;
import com.example.kompiuteris.caloriecalculatortesting.R;

import java.util.regex.Pattern;

public class CalorieIntake extends AppCompatActivity {

    static final String DAILY_CALORIES = "calories";
    static final String DAILY_PROTEIN = "protein";
    static final String DAILY_FATS = "fats";
    static final String DAILY_CARBS = "carbs";

    private EditText kcalEtxt;
    private EditText proteinEtxt;
    private EditText fatEtxt;
    private EditText carbsEtxt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorie_intake);
        setComponents();
        setSaveBtnOnClickListener();
    }

    private void setComponents() {
        kcalEtxt = findViewById(R.id.calorie_editText);
        proteinEtxt = findViewById(R.id.protein_editText);
        fatEtxt = findViewById(R.id.fat_editText);
        carbsEtxt = findViewById(R.id.carbs_editText);
    }

    private void setSaveBtnOnClickListener() {
        findViewById(R.id.save_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               inputValidation();
            }
        });
    }

    private void inputValidation() {
        if(kcalEtxt.getText().toString().trim().length() < 0 || kcalEtxt.getText().toString().isEmpty()) {
            Toast.makeText(CalorieIntake.this, "Please set calories", Toast.LENGTH_SHORT).show();
        } else if(proteinEtxt.getText().toString().length() < 0 || proteinEtxt.getText().toString().isEmpty()) {
            Toast.makeText(CalorieIntake.this, "Please set protein intake", Toast.LENGTH_SHORT).show();
        } else if(fatEtxt.getText().length() < 0 || fatEtxt.getText().toString().isEmpty()) {
            Toast.makeText(CalorieIntake.this, "Please set fat intake", Toast.LENGTH_SHORT).show();
        } else if(carbsEtxt.getText().length() < 0 || carbsEtxt.getText().toString().isEmpty()) {
            Toast.makeText(CalorieIntake.this, "Please set carb intake", Toast.LENGTH_SHORT).show();
        } else if(Integer.parseInt(proteinEtxt.getText().toString())+ Integer.parseInt(fatEtxt.getText().toString())
                +Integer.parseInt(carbsEtxt.getText().toString()) != 100) {
            Toast.makeText(CalorieIntake.this, "Macros intake should be 100%", Toast.LENGTH_SHORT).show();
        } else {
            setIntent();
        }
    }

    private void setIntent() {
        Intent intent = new Intent();
        intent.putExtra(DAILY_CALORIES, kcalEtxt.getText().toString());
        intent.putExtra(DAILY_PROTEIN, proteinEtxt.getText().toString());
        intent.putExtra(DAILY_FATS, fatEtxt.getText().toString());
        intent.putExtra(DAILY_CARBS, carbsEtxt.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}