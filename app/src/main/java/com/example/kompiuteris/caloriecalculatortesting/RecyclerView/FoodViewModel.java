package com.example.kompiuteris.caloriecalculatortesting.RecyclerView;

import com.example.kompiuteris.caloriecalculatortesting.Food;

public class FoodViewModel {

    private Food mFood;
    private int mPosition;

    public FoodViewModel() {

    }

    public Food getFood() {
        return mFood;
    }

    public void setFood(Food food) {
        mFood = food;
    }

    public int getPosition() {
        return mPosition;
    }

    public void setPosition(int position) {
        mPosition = position;
    }

    public String getFoodTitle() {
        return mFood.getmTitle();
    }

    public String getFoodProtein() {
        return Double.toString(mFood.getmProtein());
    }

    public String getFoodFat() {
        return Double.toString(mFood.getmFat());
    }

    public String getFoodCarbs() {
        return Double.toString(mFood.getmCarbs());
    }

    public String getFoodSugar() {
        return Double.toString(mFood.getmSugar());
    }

    public String getFoodWeight() {
        return Integer.toString(mFood.getmWeight());
    }

    public String getFoodKcal() {
        return Integer.toString(mFood.getKcal());
    }
}
