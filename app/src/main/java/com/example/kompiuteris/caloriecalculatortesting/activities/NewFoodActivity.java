package com.example.kompiuteris.caloriecalculatortesting.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.kompiuteris.caloriecalculatortesting.InputValidation;
import com.example.kompiuteris.caloriecalculatortesting.R;

import java.util.regex.Pattern;

public class NewFoodActivity extends AppCompatActivity {

    static final String FOOD_TITLE = "title";
    static final String FOOD_PROTEIN = "protein";
    static final String FOOD_FATS = "fats";
    static final String FOOD_CARBS = "carbs";
    static final String FOOD_SUGAR = "sugar";

    private EditText foodTitleEtxt;
    private EditText proteinEtxt;
    private EditText fatEtxt;
    private EditText carbsEtxt;
    private EditText sugarEtxt;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_food);
        setComponents();
        setSaveBtnOnClickListener();

    }

    private void setComponents() {
        foodTitleEtxt = findViewById(R.id.foodTitle_editText);
        proteinEtxt = findViewById(R.id.proteinFood_editText);
        fatEtxt = findViewById(R.id.fatFood_editText);
        carbsEtxt = findViewById(R.id.carbsFood_editText);
        sugarEtxt = findViewById(R.id.sugarFood_editText);
    }

    private boolean checkNumberFormat(String value) {
        if(value.startsWith(".") || (value.startsWith("0") && value.endsWith("0") && value.length() > 1) || value.endsWith(".") ) {
            return true;
        }
        return false;
    }

    private void setSaveBtnOnClickListener() {
        findViewById(R.id.saveFood_btn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                inputValidation();
                }
            }
        );
    }

    private void inputValidation() {
        if(foodTitleEtxt.getText().toString().trim().length() < 0 || foodTitleEtxt.getText().toString().isEmpty()) {
            Toast.makeText(NewFoodActivity.this, "Please insert food title", Toast.LENGTH_SHORT).show();
        } else if(proteinEtxt.getText().length() < 0 || proteinEtxt.getText().toString().isEmpty()) {
            Toast.makeText(NewFoodActivity.this, "Please insert grams of protein", Toast.LENGTH_SHORT).show();
        } else if(fatEtxt.getText().length() < 0 || fatEtxt.getText().toString().isEmpty()) {
            Toast.makeText(NewFoodActivity.this, "Please insert grams of fat", Toast.LENGTH_SHORT).show();
        } else if(carbsEtxt.getText().length() < 0 || carbsEtxt.getText().toString().isEmpty()) {
            Toast.makeText(NewFoodActivity.this, "Please insert grams of carbs", Toast.LENGTH_SHORT).show();
        } else if(checkNumberFormat(proteinEtxt.getText().toString()) ||  checkNumberFormat(fatEtxt.getText().toString()) ||
                  checkNumberFormat(carbsEtxt.getText().toString()) || checkNumberFormat(sugarEtxt.getText().toString())) {
                     Toast.makeText(NewFoodActivity.this, "Bad number format", Toast.LENGTH_SHORT).show();
        }else if(!sugarEtxt.getText().toString().isEmpty() && !carbsEtxt.getText().toString().isEmpty() &&
                checkNumberFormat(carbsEtxt.getText().toString())) {
            Toast.makeText(NewFoodActivity.this, "Bad number format sugar", Toast.LENGTH_SHORT).show();
        } else if(Double.parseDouble(sugarEtxt.getText().toString()) > Double.parseDouble(carbsEtxt.getText().toString())){
            Toast.makeText(NewFoodActivity.this, "Can't be more sugar than carbs!", Toast.LENGTH_SHORT).show();
        } else if(sugarEtxt.getText().length() == 0 || sugarEtxt.getText().toString().isEmpty()) {
            sugarEtxt.setText("0");
            setIntent();
        } else {
            setIntent();
        }
    }

    private void setIntent() {
        Intent intent = new Intent();
        intent.putExtra(FOOD_TITLE, foodTitleEtxt.getText().toString());
        intent.putExtra(FOOD_PROTEIN, Double.parseDouble(proteinEtxt.getText().toString()));
        intent.putExtra(FOOD_FATS, Double.parseDouble(fatEtxt.getText().toString()));
        intent.putExtra(FOOD_CARBS, Double.parseDouble(carbsEtxt.getText().toString()));
        intent.putExtra(FOOD_SUGAR, Double.parseDouble(sugarEtxt.getText().toString()));
        setResult(RESULT_OK, intent);
        finish();
    }
}
