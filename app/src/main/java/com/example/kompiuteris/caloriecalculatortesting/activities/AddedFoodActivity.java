package com.example.kompiuteris.caloriecalculatortesting.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.kompiuteris.caloriecalculatortesting.AddedFood;
import com.example.kompiuteris.caloriecalculatortesting.AddedFoodRecyclerView.AddedFoodRecyclerView;
import com.example.kompiuteris.caloriecalculatortesting.Database.FoodDatabase;
import com.example.kompiuteris.caloriecalculatortesting.R;
import com.example.kompiuteris.caloriecalculatortesting.TotalDailyCalories;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class AddedFoodActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private AddedFoodRecyclerView recyclerViewAdapter;
    private TextView calories;
    private TextView protein;
    private TextView fat;
    private TextView carbs;
    private TextView sugar;
    private TextView currentDate;
    private ImageButton backDateBtn;
    private ImageButton forwardDateBtn;
    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private Calendar calendar = Calendar.getInstance();





    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_added_foods);
        setTextViews();
        setButtons();
        updateCurrentDate();
        setbackDateBtnListener();
        setForwardDateBtnListener();
        setRecyclerView();
        setRecyclerViewAdapter(FoodDatabase.getInstance(this).getDataFromAddedFoodTable(currentDate.getText().toString()));
        updateTextViews();

    }

    private void setRecyclerView(){
        recyclerView = findViewById(R.id.addedFood_recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }

    private void setRecyclerViewAdapter(ArrayList<AddedFood> arrayList){
        recyclerViewAdapter = new AddedFoodRecyclerView(arrayList);
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    private void setTextViews() {
        calories = findViewById(R.id.caloric_intakeAddedFood_textView);
        protein = findViewById(R.id.protein_intakeAddedFood_textView);
        fat = findViewById(R.id.fat_intakeAddedFood_textView);
        carbs = findViewById(R.id.carbohydrates_intakeAddedFood_textView);
        sugar = findViewById(R.id.sugar_intakeAddedFood_textView);
        currentDate = findViewById(R.id.currentDateTextView);
    }

    private void updateTextViews() {
        TotalDailyCalories totalDailyCalories = FoodDatabase.getInstance(this).updateDailyIntake(currentDate.getText().toString());
        calories.setText(String.format("%s", totalDailyCalories.getmKcal()));
        protein.setText(String.format("%s", totalDailyCalories.getmProtein()));
        fat.setText(String.format("%s", totalDailyCalories.getMfat()));
        carbs.setText(String.format("%s", totalDailyCalories.getmCarbs()));
        sugar.setText(String.format("%s", totalDailyCalories.getmSugar()));
    }

    private void setButtons() {
        backDateBtn = findViewById(R.id.backDateBtn);
        forwardDateBtn = findViewById(R.id.forwardDateBtn);
    }

    private void updateCurrentDate() {
        currentDate.setText(FoodDatabase.getInstance(this).getTodayDate());
    }

    private void setbackDateBtnListener() {
        backDateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                changeDate(v,-1);
            }
        });
    }

    private void setForwardDateBtnListener() {
        forwardDateBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               changeDate(v,1);
            }
        });
    }

    private void changeDate(View v,int dayNumber) {
        calendar.add(Calendar.DAY_OF_MONTH, dayNumber);
        currentDate.setText(simpleDateFormat.format(calendar.getTimeInMillis()));
        setRecyclerViewAdapter(FoodDatabase.getInstance(v.getContext()).getDataFromAddedFoodTable(currentDate.getText().toString()));
        updateTextViews();
    }
}
