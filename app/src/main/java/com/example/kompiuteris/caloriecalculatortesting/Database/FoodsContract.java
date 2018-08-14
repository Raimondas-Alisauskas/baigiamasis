package com.example.kompiuteris.caloriecalculatortesting.Database;

import android.provider.BaseColumns;

public class FoodsContract {

    static final String TABLE_NAME = "Foods";

    public static class Columns {

        public static final String _ID = BaseColumns._ID;
        public static final String FOODS_TITLE = "title";
        public static final String FOODS_CALORIES = "kcal";
        public static final String FOODS_PROTEIN = "protein";
        public static final String FOODS_FAT = "fat";
        public static final String FOODS_CARBS = "carbs";
        public static final String FOODS_SUGAR = "sugar";
        public static final String FOODS_WEIGHT = "weight";



        private Columns(){

        }

    }


}
