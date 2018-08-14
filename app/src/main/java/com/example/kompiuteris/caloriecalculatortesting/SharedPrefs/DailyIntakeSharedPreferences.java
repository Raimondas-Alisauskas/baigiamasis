package com.example.kompiuteris.caloriecalculatortesting.SharedPrefs;

import android.content.SharedPreferences;

public class DailyIntakeSharedPreferences {

    public static final String DAILY_INTAKE_SHARED_PREFERENCES = "sharedPreferences";
    public static final String CALORIE_INTAKE = "calorieIntake";
    public static final String PROTEIN_INTAKE = "proteinIntake";
    public static final String FAT_INTAKE = "fatIntake";
    public static final String CARBS_INTAKE = "carbsIntake";

    private SharedPreferences mPrefs;

    public DailyIntakeSharedPreferences(SharedPreferences sharedPreferences) {
        mPrefs = sharedPreferences;
    }

    public void addData(String kcal, String protein, String fat, String carbs) {
        mPrefs.edit().putString(CALORIE_INTAKE, kcal).apply();
        mPrefs.edit().putString(PROTEIN_INTAKE,protein).apply();
        mPrefs.edit().putString(FAT_INTAKE,fat).apply();
        mPrefs.edit().putString(CARBS_INTAKE,carbs).apply();
    }

    public String loadData(String keyValue){
        return mPrefs.getString(keyValue, "0");
    }
}
