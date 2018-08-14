package com.example.kompiuteris.caloriecalculatortesting;


public class TotalDailyCalories {

    private Double mProtein;
    private Double mfat;
    private Double mCarbs;
    private Double mSugar;
    private int mKcal;

    public TotalDailyCalories(Double protein, Double fat, Double carbs, Double sugar, int kcal) {
        mProtein = protein;
        mfat = fat;
        mCarbs = carbs;
        mSugar = sugar;
        mKcal = kcal;
    }

    public Double getmProtein() {
        return mProtein;
    }

    public void setmProtein(Double mProtein) {
        this.mProtein = mProtein;
    }

    public Double getMfat() {
        return mfat;
    }

    public void setMfat(Double mfat) {
        this.mfat = mfat;
    }

    public Double getmCarbs() {
        return mCarbs;
    }

    public void setmCarbs(Double mCarbs) {
        this.mCarbs = mCarbs;
    }

    public Double getmSugar() {
        return mSugar;
    }

    public void setmSugar(Double mSugar) {
        this.mSugar = mSugar;
    }

    public int getmKcal() {
        return mKcal;
    }

    public void setmKcal(int mKcal) {
        this.mKcal = mKcal;
    }
}
