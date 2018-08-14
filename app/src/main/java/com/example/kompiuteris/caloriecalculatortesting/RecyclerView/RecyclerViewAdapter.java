package com.example.kompiuteris.caloriecalculatortesting.RecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kompiuteris.caloriecalculatortesting.Interfaces.AddFoodCalories;
import com.example.kompiuteris.caloriecalculatortesting.Food;
import com.example.kompiuteris.caloriecalculatortesting.Interfaces.ItemActionInterface;
import com.example.kompiuteris.caloriecalculatortesting.R;

import java.util.ArrayList;


public class RecyclerViewAdapter extends RecyclerView.Adapter<FoodViewHolder> implements ItemActionInterface {

    private ArrayList<Food> mFoodArrayList;
    private ArrayList<Food> mFoodFilteredArrayList;
    private AddFoodCalories mAddFoodCaloriesInterface;

    public RecyclerViewAdapter(ArrayList<Food> foodArrayList, AddFoodCalories addFoodCaloriesInterface) {
        mFoodArrayList = foodArrayList;
        mFoodFilteredArrayList = mFoodArrayList;
        mAddFoodCaloriesInterface = addFoodCaloriesInterface;
    }

    @Override
    public FoodViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_recyclerview_item, parent, false);
        FoodViewHolder foodViewHolder = new FoodViewHolder(view, new FoodViewModel());
        foodViewHolder.setItemActionInterface(this);
        foodViewHolder.setAddFoodCaloriesInterface(mAddFoodCaloriesInterface);
        return foodViewHolder;
    }

    @Override
    public void onBindViewHolder(FoodViewHolder holder, int position) {
        holder.onBind(mFoodArrayList.get(position), position);
    }

    @Override
    public int getItemCount() {
        return mFoodArrayList == null ? 0 : mFoodArrayList.size();
    }

    public ArrayList<Food> getmFoodArrayList() {
        return mFoodArrayList;
    }

    public void setmFoodArrayList(ArrayList<Food> foodArrayList) {
        mFoodArrayList = foodArrayList;
    }

    public void notifyDataChanges(ArrayList<Food> foodArrayList) {
        if (mFoodArrayList != null) {
            mFoodArrayList.clear();
            mFoodArrayList.addAll(foodArrayList);
        } else {
            mFoodArrayList = foodArrayList;
        }
        notifyDataSetChanged();
    }

    @Override
    public void onItemDelete(int position) {
        mFoodArrayList.remove(position);
        notifyItemRemoved(position);
        notifyItemRangeChanged(position, mFoodArrayList.size());
    }

    public void filterArrayList(String searchText) {

        ArrayList<Food> mainArrayList = new ArrayList<>();
        for (Food food : mFoodFilteredArrayList) {
            if (food.getmTitle().toLowerCase().contains(searchText)) {
                mainArrayList.add(food);
            }
        }
        if (searchText.isEmpty()) {
            setmFoodArrayList(mFoodFilteredArrayList);
        } else {
            setmFoodArrayList(mainArrayList);
        }
        notifyDataSetChanged();

    }
}
