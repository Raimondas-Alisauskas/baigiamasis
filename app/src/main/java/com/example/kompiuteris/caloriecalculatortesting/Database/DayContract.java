package com.example.kompiuteris.caloriecalculatortesting.Database;

import android.provider.BaseColumns;

public class DayContract {


    static final String TABLE_NAME = "Days";

    public static class Columns {

        public static final String _ID = BaseColumns._ID;
        public static final String DATE = "date";


        private Columns(){

        }

    }



}
