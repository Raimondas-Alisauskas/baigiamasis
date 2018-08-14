package com.example.kompiuteris.caloriecalculatortesting.Database;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.kompiuteris.caloriecalculatortesting.AddedFood;
import com.example.kompiuteris.caloriecalculatortesting.Food;
import com.example.kompiuteris.caloriecalculatortesting.TotalDailyCalories;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;

public class FoodDatabase extends SQLiteOpenHelper {

    public static final String DATABASE_NAME = "CalorieCalculator.db";
    public static final int DATABASE_VERSION = 1;

    private static FoodDatabase instance = null;

    private SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    private String createFoodTable = "CREATE TABLE " + FoodsContract.TABLE_NAME + " ("
                                + FoodsContract.Columns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "
                                + FoodsContract.Columns.FOODS_TITLE + " TEXT NOT NULL, "
                                + FoodsContract.Columns.FOODS_PROTEIN + " DOUBLE NOT NULL, "
                                + FoodsContract.Columns.FOODS_FAT + " DOUBLE NOT NULL, "
                                + FoodsContract.Columns.FOODS_CARBS + " DOUBLE NOT NULL, "
                                + FoodsContract.Columns.FOODS_SUGAR + " DOUBLE NOT NULL, "
                                + FoodsContract.Columns.FOODS_WEIGHT + " INTEGER NOT NULL, "
                                + FoodsContract.Columns.FOODS_CALORIES + " INTEGER NOT NULL);";

    private String createDaysTable = "CREATE TABLE " + DayContract.TABLE_NAME + " ("
                                + DayContract.Columns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "
                                + DayContract.Columns.DATE + " DATE NOT NULL);";

    private String createAddedFoodTable = "CREATE TABLE " + AddedFoodContract.TABLE_NAME + " ("
                                + AddedFoodContract.Columns._ID + " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, "
                                + AddedFoodContract.Columns.ADDED_FOOD_TITLE + " TEXT NOT NULL, "
                                + AddedFoodContract.Columns.ADDED_FOOD_PROTEIN + " DOUBLE NOT NULL, "
                                + AddedFoodContract.Columns.ADDED_FOOD_FAT + " DOUBLE NOT NULL, "
                                + AddedFoodContract.Columns.ADDED_FOOD_CARBS + " DOUBLE NOT NULL, "
                                + AddedFoodContract.Columns.ADDED_FOOD_SUGAR + " DOUBLE NOT NULL, "
                                + AddedFoodContract.Columns.ADDED_FOOD_WEIGHT + " INTEGER NOT NULL, "
                                + AddedFoodContract.Columns.ADDED_FOOD_CALORIES + " INTEGER NOT NULL, "
                                + AddedFoodContract.Columns.DAYS_ID + " INTEGER, "  + "FOREIGN KEY "
                                + "(" +AddedFoodContract.Columns.DAYS_ID+")" + " REFERENCES "
                                + DayContract.TABLE_NAME +"("+DayContract.Columns._ID+"));";

    private String todayDateQuery = "SElECT " + DayContract.Columns.DATE + " FROM " + DayContract.TABLE_NAME +
            " WHERE " + DayContract.Columns.DATE + " = " +
            "'"+simpleDateFormat.format(Calendar.getInstance().getTimeInMillis()) + "';";

    private String checkIfDateExistsQuery = "SELECT * FROM " + DayContract.TABLE_NAME + " WHERE " +
            DayContract.Columns.DATE + " = " + "'";

    private String getDayIdQuery = "SELECT " + DayContract.Columns._ID + " FROM " +
            DayContract.TABLE_NAME + " WHERE " + DayContract.Columns.DATE +
            " = '";

    private String getDataFromAddedFoodTbQuery = "SELECT * FROM " + DayContract.TABLE_NAME + " INNER JOIN " + AddedFoodContract.TABLE_NAME
            + " ON " + DayContract.TABLE_NAME + "." + DayContract.Columns._ID + " = "
            + AddedFoodContract.TABLE_NAME + "." + AddedFoodContract.Columns.DAYS_ID + " WHERE "
            + DayContract.Columns.DATE + " = " + "'";

    private String getDataFromFoodTbQuery = "SELECT * FROM " + FoodsContract.TABLE_NAME + ";";

    private String deleteRowQuery = "DELETE FROM " + FoodsContract.TABLE_NAME + " WHERE " + FoodsContract.Columns.FOODS_TITLE +
            " = " + "'";

    private String updateDailyIntakeQuery = "SELECT "  +"SUM("+AddedFoodContract.TABLE_NAME+"."+ AddedFoodContract.Columns.ADDED_FOOD_PROTEIN +")," +
            " SUM(" +AddedFoodContract.TABLE_NAME+"."+ AddedFoodContract.Columns.ADDED_FOOD_FAT +")," +
            " SUM(" +AddedFoodContract.TABLE_NAME+"."+ AddedFoodContract.Columns.ADDED_FOOD_CARBS +"), " +
            " SUM(" +AddedFoodContract.TABLE_NAME+"."+ AddedFoodContract.Columns.ADDED_FOOD_SUGAR +")," +
            " SUM(" +AddedFoodContract.TABLE_NAME+"."+ AddedFoodContract.Columns.ADDED_FOOD_CALORIES +")" + " FROM " + DayContract.TABLE_NAME + " INNER JOIN " + AddedFoodContract.TABLE_NAME
            + " ON " + DayContract.TABLE_NAME + "." + DayContract.Columns._ID + " = "
            + AddedFoodContract.TABLE_NAME + "." + AddedFoodContract.Columns.DAYS_ID + " WHERE "
            + DayContract.Columns.DATE + " = " + "'";

    private FoodDatabase(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public  static FoodDatabase getInstance(Context context) {
        if(instance == null) {
            instance = new FoodDatabase(context);
        }
        return instance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
            db.execSQL(createFoodTable);
            db.execSQL(createDaysTable);
            db.execSQL(createAddedFoodTable);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

    public void insertDataToDayTable(Date date) {
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        contentValues.put(DayContract.Columns.DATE,simpleDateFormat.format(date));
        db.insert(DayContract.TABLE_NAME,null,contentValues);
        db.close();
    }

    public String getTodayDate() {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(todayDateQuery, null);
        cursor.moveToFirst();
        return cursor.getString(cursor.getColumnIndex(DayContract.Columns.DATE));
    }

 /*   public ArrayList<String> getDataFromDayTable() {
        ArrayList<String> datesArrayList = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery("SElECT " + DayContract.Columns.DATE + " FROM " + DayContract.TABLE_NAME + ";", null);
        while(cursor.moveToNext()) {
            String date = cursor.getString(cursor.getColumnIndexOrThrow(DayContract.Columns.DATE));
            datesArrayList.add(date);
        }
        cursor.close();
        db.close();
        return datesArrayList;

    }
    */

    public boolean checkIfDateCreated(Date date) {
        Boolean result = false;
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(checkIfDateExistsQuery + simpleDateFormat.format(date) + "';", null );
        if(cursor.moveToFirst()) {
            result = true;
            cursor.close();
        }

        return result;
    }

    public int getDayId(Date date) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery( getDayIdQuery + simpleDateFormat.format(date)+ "';", null);
        cursor.moveToFirst();
        int dayId = cursor.getInt(cursor.getColumnIndexOrThrow(DayContract.Columns._ID));
        cursor.close();
        return dayId;
    }

    public void insertDataToAddedFoodTable(String title, int dayId, Double protein, Double fat, Double carbs, Double sugar,
                                           int kcal, int weight){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(AddedFoodContract.Columns.ADDED_FOOD_TITLE, title);
        contentValues.put(AddedFoodContract.Columns.DAYS_ID, dayId);
        contentValues.put(AddedFoodContract.Columns.ADDED_FOOD_PROTEIN, protein);
        contentValues.put(AddedFoodContract.Columns.ADDED_FOOD_FAT, fat);
        contentValues.put(AddedFoodContract.Columns.ADDED_FOOD_CARBS, carbs);
        contentValues.put(AddedFoodContract.Columns.ADDED_FOOD_SUGAR, sugar);
        contentValues.put(AddedFoodContract.Columns.ADDED_FOOD_CALORIES, kcal);
        contentValues.put(AddedFoodContract.Columns.ADDED_FOOD_WEIGHT, weight);
        db.insert(AddedFoodContract.TABLE_NAME,null, contentValues);
        db.close();
    }

    public ArrayList<AddedFood> getDataFromAddedFoodTable(String date){
        ArrayList<AddedFood> addedFoodArrayList = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery( getDataFromAddedFoodTbQuery + date + "';", null);
        while(cursor.moveToNext()) {
            addedFoodArrayList.add(initAddedFoodWithCursor(cursor));
        }
        cursor.close();
        db.close();

        return addedFoodArrayList;
    };


    public void insertDataToFoodTable(String title, Double protein, Double fat, Double carbs, Double sugar){
        SQLiteDatabase db = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();
        int resultCalories = (int) Math.round(((protein + carbs) * 4 ) + (fat * 9));

        contentValues.put(FoodsContract.Columns.FOODS_TITLE, title);
        contentValues.put(FoodsContract.Columns.FOODS_PROTEIN, protein);
        contentValues.put(FoodsContract.Columns.FOODS_FAT, fat);
        contentValues.put(FoodsContract.Columns.FOODS_CARBS, carbs);
        contentValues.put(FoodsContract.Columns.FOODS_SUGAR, sugar);
        contentValues.put(FoodsContract.Columns.FOODS_WEIGHT, 100);
        contentValues.put(FoodsContract.Columns.FOODS_CALORIES, resultCalories);
        db.insert(FoodsContract.TABLE_NAME,null, contentValues);
        db.close();
    }

    public ArrayList<Food> getdataFromFoodTable(){
        ArrayList<Food> foodArrayList = new ArrayList<>();
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery(getDataFromFoodTbQuery, null);
        while(cursor.moveToNext()) {
            foodArrayList.add(initFoodWithCursor(cursor));
        }
        cursor.close();
        db.close();

        return foodArrayList;
    };

    public void deleteRowFromFoodTable(String foodTitle) {
        SQLiteDatabase db = this.getWritableDatabase();
        String delRowSql = deleteRowQuery  +foodTitle +"';";
        db.execSQL(delRowSql);
        db.close();
    }

    public void updateRowFoodTable(int recordId , String title, Double protein, Double fat, Double carbs, Double sugar, int kcal) {
        SQLiteDatabase db = this.getWritableDatabase();
        String updateRowSql = "UPDATE " + FoodsContract.TABLE_NAME + " SET " +
                FoodsContract.Columns.FOODS_TITLE + " = " + "'"+title+"'" + ", " + FoodsContract.Columns.FOODS_PROTEIN + " = " + "'"+protein+"'"
                + ", " + FoodsContract.Columns.FOODS_FAT + " = " + "'"+fat+"'" + ", " + FoodsContract.Columns.FOODS_CARBS + " = " + "'"+carbs+"'"
                + ", " + FoodsContract.Columns.FOODS_SUGAR + " = " + "'"+sugar+"'" + ", " + FoodsContract.Columns.FOODS_CALORIES + " = "
                + "'"+kcal+"'" + " WHERE " + FoodsContract.Columns._ID + " = " + recordId +";";
        db.execSQL(updateRowSql);
        db.close();
    }

    public TotalDailyCalories updateDailyIntake(String date) {
        SQLiteDatabase db = this.getWritableDatabase();
        Cursor cursor = db.rawQuery( updateDailyIntakeQuery + date + "';", null);
        cursor.moveToFirst();
        TotalDailyCalories totalDailyCalories = new TotalDailyCalories(
                cursor.getDouble(0),
                cursor.getDouble(1),
                cursor.getDouble(2),
                cursor.getDouble(3),
                cursor.getInt(4));
        cursor.close();
        return totalDailyCalories;
    }


    private AddedFood initAddedFoodWithCursor(Cursor cursor){
       return  new AddedFood(cursor.getInt(cursor.getColumnIndexOrThrow(AddedFoodContract.Columns._ID)),
                cursor.getInt(cursor.getColumnIndexOrThrow(AddedFoodContract.Columns.DAYS_ID)),
                cursor.getString(cursor.getColumnIndexOrThrow(AddedFoodContract.Columns.ADDED_FOOD_TITLE)),
                cursor.getDouble(cursor.getColumnIndexOrThrow(AddedFoodContract.Columns.ADDED_FOOD_PROTEIN)),
                cursor.getDouble(cursor.getColumnIndexOrThrow(AddedFoodContract.Columns.ADDED_FOOD_FAT)),
                cursor.getDouble(cursor.getColumnIndexOrThrow(AddedFoodContract.Columns.ADDED_FOOD_CARBS)),
                cursor.getDouble(cursor.getColumnIndexOrThrow(AddedFoodContract.Columns.ADDED_FOOD_SUGAR)),
                cursor.getInt(cursor.getColumnIndexOrThrow(AddedFoodContract.Columns.ADDED_FOOD_CALORIES)),
                cursor.getInt(cursor.getColumnIndexOrThrow(AddedFoodContract.Columns.ADDED_FOOD_WEIGHT)));
    }

    private Food initFoodWithCursor(Cursor cursor){
        return new Food(cursor.getInt(cursor.getColumnIndexOrThrow(FoodsContract.Columns._ID)),
                cursor.getString(cursor.getColumnIndexOrThrow(FoodsContract.Columns.FOODS_TITLE)),
                cursor.getDouble(cursor.getColumnIndexOrThrow(FoodsContract.Columns.FOODS_PROTEIN)),
                cursor.getDouble(cursor.getColumnIndexOrThrow(FoodsContract.Columns.FOODS_FAT)),
                cursor.getDouble(cursor.getColumnIndexOrThrow(FoodsContract.Columns.FOODS_CARBS)),
                cursor.getDouble(cursor.getColumnIndexOrThrow(FoodsContract.Columns.FOODS_SUGAR)));
    }
}