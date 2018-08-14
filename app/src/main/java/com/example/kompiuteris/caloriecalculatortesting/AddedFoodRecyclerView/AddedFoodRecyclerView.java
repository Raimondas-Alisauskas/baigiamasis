package com.example.kompiuteris.caloriecalculatortesting.AddedFoodRecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.kompiuteris.caloriecalculatortesting.AddedFood;
import com.example.kompiuteris.caloriecalculatortesting.R;

import java.util.ArrayList;

public class AddedFoodRecyclerView extends RecyclerView.Adapter<AddedFoodViewHolder> {

    private ArrayList<AddedFood> mAddedFoodArrayList;


    public AddedFoodRecyclerView(ArrayList<AddedFood> addedFoodArrayList) {
        mAddedFoodArrayList = addedFoodArrayList;
    }

    @Override
    public AddedFoodViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.added_food_recycler_view_item, parent, false);
        return new AddedFoodViewHolder(view, new AddedFoodViewModel());
    }

    @Override
    public void onBindViewHolder(AddedFoodViewHolder holder, int position) {
        holder.onBind(mAddedFoodArrayList.get(position), position);
    }

    @Override
    public int getItemCount() {
        return mAddedFoodArrayList == null ? 0 : mAddedFoodArrayList.size();
    }
}
