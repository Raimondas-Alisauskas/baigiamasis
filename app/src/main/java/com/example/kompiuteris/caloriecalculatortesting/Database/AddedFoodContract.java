package com.example.kompiuteris.caloriecalculatortesting.Database;

import android.provider.BaseColumns;

public class AddedFoodContract {


    static final String TABLE_NAME = "AddedFood";

    public static class Columns {

        public static final String _ID = BaseColumns._ID;
        public static final String DAYS_ID = "daysID";
        public static final String ADDED_FOOD_TITLE = "title";
        public static final String ADDED_FOOD_PROTEIN = "protein";
        public static final String ADDED_FOOD_FAT = "fat";
        public static final String ADDED_FOOD_CARBS = "carbs";
        public static final String ADDED_FOOD_SUGAR = "sugar";
        public static final String ADDED_FOOD_WEIGHT = "weight";
        public static final String ADDED_FOOD_CALORIES = "kcal";


        private Columns(){

        }

    }

}
