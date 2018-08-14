package com.example.kompiuteris.caloriecalculatortesting.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import com.example.kompiuteris.caloriecalculatortesting.Interfaces.AddFoodCalories;
import com.example.kompiuteris.caloriecalculatortesting.Models.MainActivityModel;
import com.example.kompiuteris.caloriecalculatortesting.SharedPrefs.DailyIntakeSharedPreferences;
import com.example.kompiuteris.caloriecalculatortesting.Food;
import com.example.kompiuteris.caloriecalculatortesting.Database.FoodDatabase;
import com.example.kompiuteris.caloriecalculatortesting.R;
import com.example.kompiuteris.caloriecalculatortesting.RecyclerView.RecyclerViewAdapter;
import com.example.kompiuteris.caloriecalculatortesting.TotalDailyCalories;

import java.sql.Date;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements AddFoodCalories, SearchView.OnQueryTextListener {

    private static final Integer SET_CALORIES_REQUEST_CODE = 10000;
    private static final Integer SET_FOOD_REQUEST_CODE = 10001;

    private final int FAT_VALUE = 9;
    private final int CARB_PROTEIN_VALUE = 4;

    private Date date;
    private FloatingActionButton fab;
    private TextView kcalTxt;
    private TextView proteiTxt;
    private TextView fatTxt;
    private TextView carbsTxt;
    private TextView kcalTodayTxt;
    private TextView proteiTodayTxt;
    private TextView fatTodayTxt;
    private TextView carbsTodayTxt;
    private TextView sugarTodayTxt;
    private SharedPreferences sharedPreferences;
    private DailyIntakeSharedPreferences dailyIntakeSharedPreferences;
    private RecyclerView recyclerView;
    private RecyclerViewAdapter recyclerViewAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setSupportActionBar((Toolbar) findViewById(R.id.custom_toolbar));
        setTextViews();
        date = new Date(Calendar.getInstance().getTimeInMillis());
        checkTime();
        updateCalorieIntakeViews();
        fab = findViewById(R.id.floatingActionButton);
        setAddNewFoodBtnListener();
        sharedPreferences = getSharedPreferences(DailyIntakeSharedPreferences.DAILY_INTAKE_SHARED_PREFERENCES,MODE_PRIVATE);
        setDailyIntakeSharedPreferences(sharedPreferences);
        updateTextViews(dailyIntakeSharedPreferences);
        setRecyclerViewAdapter(FoodDatabase.getInstance(this).getdataFromFoodTable());
        setRecyclerView();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if(resultCode == RESULT_OK && requestCode == SET_CALORIES_REQUEST_CODE && data != null) {
            dailyIntakeSharedPreferences.addData(data.getStringExtra(CalorieIntake.DAILY_CALORIES),
                    data.getStringExtra(CalorieIntake.DAILY_PROTEIN),
                    data.getStringExtra(CalorieIntake.DAILY_FATS),
                    data.getStringExtra(CalorieIntake.DAILY_CARBS));
            updateTextViews(dailyIntakeSharedPreferences);
        } else if(resultCode == RESULT_OK && requestCode == SET_FOOD_REQUEST_CODE && data != null) {
           FoodDatabase.getInstance(this).insertDataToFoodTable( data.getStringExtra(NewFoodActivity.FOOD_TITLE),
                    data.getDoubleExtra(NewFoodActivity.FOOD_PROTEIN,0),
                    data.getDoubleExtra(NewFoodActivity.FOOD_FATS, 0),
                    data.getDoubleExtra(NewFoodActivity.FOOD_CARBS,0),
                    data.getDoubleExtra(NewFoodActivity.FOOD_SUGAR,0));
                recyclerViewAdapter.notifyDataChanges(FoodDatabase.getInstance(this).getdataFromFoodTable());
        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
         getMenuInflater().inflate(R.menu.menu_main, menu);
         MenuItem menuItem = menu.findItem(R.id.action_search);
         SearchView searchView =  (SearchView) menuItem.getActionView();
         searchView.setOnQueryTextListener(this);
         return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()){
            case R.id.action_set_caloric_intake:
                startCalorieSetIntent();
                break;
            case R.id.action_added_food_activity:
                setAddedFoodIntent();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void setTextViews() {
        kcalTxt = findViewById(R.id.caloric_intake_textView);
        proteiTxt = findViewById(R.id.protein_intake_textView);
        fatTxt = findViewById(R.id.fat_intake_textView);
        carbsTxt = findViewById(R.id.carbohydrates_intake_textView);
        kcalTodayTxt = findViewById(R.id.caloric_intakeToday_textView);
        proteiTodayTxt = findViewById(R.id.protein_intakeToday_textView);
        fatTodayTxt =  findViewById(R.id.fat_intakeToday_textView);
        carbsTodayTxt = findViewById(R.id.carbohydrates_intakeToday_textView);
        sugarTodayTxt = findViewById(R.id.sugar_intakeToday_textView);
    }

    private void updateTextViews(DailyIntakeSharedPreferences dailyIntakeSharedPreferences) {
        kcalTxt.setText(dailyIntakeSharedPreferences.loadData(DailyIntakeSharedPreferences.CALORIE_INTAKE));
        proteiTxt.setText(MainActivityModel.convertCalcToMacro(dailyIntakeSharedPreferences.loadData(DailyIntakeSharedPreferences.CALORIE_INTAKE), dailyIntakeSharedPreferences.loadData(DailyIntakeSharedPreferences.PROTEIN_INTAKE), CARB_PROTEIN_VALUE));
        fatTxt.setText(MainActivityModel.convertCalcToMacro(dailyIntakeSharedPreferences.loadData(DailyIntakeSharedPreferences.CALORIE_INTAKE),dailyIntakeSharedPreferences.loadData(DailyIntakeSharedPreferences.FAT_INTAKE), FAT_VALUE));
        carbsTxt.setText(MainActivityModel.convertCalcToMacro(dailyIntakeSharedPreferences.loadData(DailyIntakeSharedPreferences.CALORIE_INTAKE),dailyIntakeSharedPreferences.loadData(DailyIntakeSharedPreferences.CARBS_INTAKE), CARB_PROTEIN_VALUE));
    }

    private void updateCalorieIntakeViews() {
        TotalDailyCalories totalDailyCalories = FoodDatabase.getInstance(this).updateDailyIntake(date.toString());
        kcalTodayTxt.setText(String.format("%s", totalDailyCalories.getmKcal()));
        proteiTodayTxt.setText(String.format("%s", totalDailyCalories.getmProtein()));
        fatTodayTxt.setText(String.format("%s", totalDailyCalories.getMfat()));
        carbsTodayTxt.setText(String.format("%s", totalDailyCalories.getmCarbs()));
        sugarTodayTxt.setText(String.format("%s", totalDailyCalories.getmSugar()));
    }

    private void startCalorieSetIntent() {
        Intent intent = new Intent(MainActivity.this, CalorieIntake.class);
        startActivityForResult(intent, SET_CALORIES_REQUEST_CODE);
    }

    private void setAddedFoodIntent() {
        Intent intent = new Intent(MainActivity.this, AddedFoodActivity.class);
        startActivity(intent);
    }



    private void setDailyIntakeSharedPreferences(SharedPreferences sharedPreferences){
        dailyIntakeSharedPreferences = new DailyIntakeSharedPreferences(sharedPreferences);
    }

    private void setRecyclerViewAdapter(ArrayList<Food> arrayList){
        recyclerViewAdapter = new RecyclerViewAdapter(arrayList,this);
    }

    private void setRecyclerView(){
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(recyclerViewAdapter);
    }

    private void setAddNewFoodBtnListener() {
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, NewFoodActivity.class);
                startActivityForResult(intent, SET_FOOD_REQUEST_CODE);
            }
        });
    }


    @Override
    public void addFood(Food food) {
        FoodDatabase.getInstance(this).insertDataToAddedFoodTable(food.getmTitle(),
                FoodDatabase.getInstance(this).getDayId(date),
                food.getmProtein(),food.getmFat(),food.getmCarbs(),
                food.getmSugar(),food.getKcal(),food.getmWeight());
        updateCalorieIntakeViews();

    }

    private void checkTime() {
        if(!FoodDatabase.getInstance(this).checkIfDateCreated(date)) {
            FoodDatabase.getInstance(this).insertDataToDayTable(date);
        }
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String newText) {
        recyclerViewAdapter.filterArrayList(newText);
        return true;
    }
}
