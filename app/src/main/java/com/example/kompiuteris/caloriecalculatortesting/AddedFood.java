package com.example.kompiuteris.caloriecalculatortesting;

public class AddedFood {

    private int mId;
    private int mDayId;
    private String mFoodTitle;
    private int mCalories;
    private Double mProtein;
    private Double mFat;
    private Double mCarbs;
    private Double mSugar;
    private int mWeight;


    public AddedFood(int id, int dayId, String foodTitle,Double protein, Double fat, Double carbs, Double sugar,  int calories,  int weight) {
        mId = id;
        mDayId = dayId;
        mFoodTitle = foodTitle;
        mCalories = calories;
        mProtein = protein;
        mFat = fat;
        mCarbs = carbs;
        mSugar = sugar;
        mWeight = weight;
    }

    public int getId() {
        return mId;
    }

    public void setId(int mId) {
        this.mId = mId;
    }

    public int getDayId() {
        return mDayId;
    }

    public void setDayId(int mDayId) {
        this.mDayId = mDayId;
    }

    public String getFoodTitle() {
        return mFoodTitle;
    }

    public void setFoodTitle(String mFoodTitle) {
        this.mFoodTitle = mFoodTitle;
    }

    public int getCalories() {
        return mCalories;
    }

    public void setCalories(int mCalories) {
        this.mCalories = mCalories;
    }

    public Double getProtein() {
        return mProtein;
    }

    public void setProtein(Double mProtein) {
        this.mProtein = mProtein;
    }

    public Double getFat() {
        return mFat;
    }

    public void setFat(Double mFat) {
        this.mFat = mFat;
    }

    public Double getCarbs() {
        return mCarbs;
    }

    public void setCarbs(Double mCarbs) {
        this.mCarbs = mCarbs;
    }

    public Double getSugar() {
        return mSugar;
    }

    public void setSugar(Double mSugar) {
        this.mSugar = mSugar;
    }

    public int getWeight() {
        return mWeight;
    }

    public void setWeight(int mWeight) {
        this.mWeight = mWeight;
    }
}
