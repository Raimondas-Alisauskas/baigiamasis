package com.example.kompiuteris.caloriecalculatortesting.Models;

import android.view.View;
import android.widget.TextView;

import com.example.kompiuteris.caloriecalculatortesting.Database.FoodDatabase;
import com.example.kompiuteris.caloriecalculatortesting.TotalDailyCalories;

import java.sql.Date;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class MainActivityModel {



    public MainActivityModel() {

    }

    public static String convertCalcToMacro(String calories, String macros, int calorieValue) {
        Double kcal = Double.parseDouble(calories);
        Double iMacros = Double.parseDouble(macros);
        int result = (int)(((kcal * (iMacros / 100)) / calorieValue));
        NumberFormat formatter = new DecimalFormat("#0");
        return formatter.format(result);
    }
}
