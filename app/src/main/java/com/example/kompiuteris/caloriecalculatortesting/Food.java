package com.example.kompiuteris.caloriecalculatortesting;



public class Food {

    private int mId;
    private String mTitle;
    private double mProtein;
    private double mFat;
    private double mCarbs;
    private double mSugar;
    private int mWeight;
    private int mKcal;

    public Food(int id, String title, double protein, double fat, double carbs, double sugar) {
        mId = id;
        mTitle = title;
        mProtein = protein;
        mFat = fat;
        mCarbs = carbs;
        mSugar = sugar;
        mWeight = 100;
        setKcal();
    }

    private void setKcal() {
        mKcal = (int) ((mProtein * 4) + (mFat * 9) + (mCarbs * 4));
    }

    public int getKcal() {
        return mKcal;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public void setmKcalForEdit(int result) {
        mKcal = result;
    }

    public double getmProtein() {
        return mProtein;
    }

    public void setmProtein(double mProtein) {
        this.mProtein = mProtein;
    }

    public double getmFat() {
        return mFat;
    }

    public void setmFat(double mFat) {
        this.mFat = mFat;
    }

    public double getmCarbs() {
        return mCarbs;
    }

    public void setmCarbs(double mCarbs) {
        this.mCarbs = mCarbs;
    }

    public double getmSugar() {
        return mSugar;
    }

    public void setmSugar(double mSugar) {
        this.mSugar = mSugar;
    }

    public int getmWeight() {
        return mWeight;
    }

    public void setmWeight(int mWeight) {
        this.mWeight = mWeight;
    }
}
