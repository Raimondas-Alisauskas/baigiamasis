package com.example.kompiuteris.caloriecalculatortesting.AddedFoodRecyclerView;


import com.example.kompiuteris.caloriecalculatortesting.AddedFood;

public class AddedFoodViewModel {

    private AddedFood mAddedFood;
    private int mPosition;


    public AddedFoodViewModel() {

    }

    public AddedFood getAddedFood() {
        return mAddedFood;
    }

    public void setAddedFood(AddedFood mAddedFood) {
        this.mAddedFood = mAddedFood;
    }

    public int getPosition() {
        return mPosition;
    }

    public void setPosition(int mPosition) {
        this.mPosition = mPosition;
    }

    public String getAddedFoodTitle() {
        return mAddedFood.getFoodTitle();
    }

    public String getAddedFoodProtein() {
        return Double.toString(mAddedFood.getProtein());
    }

    public String getAddedFoodFat() {
        return Double.toString(mAddedFood.getFat());
    }

    public String getAddedFoodCarbs() {
        return Double.toString(mAddedFood.getCarbs());
    }

    public String getAddedFoodSugar() {
        return Double.toString(mAddedFood.getSugar());
    }

    public String getAddedFoodWeight() {
        return Integer.toString(mAddedFood.getWeight());
    }

    public String getAddedFoodKcal() {
        return Integer.toString(mAddedFood.getCalories());
    }
}
