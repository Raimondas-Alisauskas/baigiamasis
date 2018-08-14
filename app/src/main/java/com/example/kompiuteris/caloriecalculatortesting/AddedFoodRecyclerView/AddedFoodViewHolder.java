package com.example.kompiuteris.caloriecalculatortesting.AddedFoodRecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.example.kompiuteris.caloriecalculatortesting.AddedFood;
import com.example.kompiuteris.caloriecalculatortesting.R;


public class AddedFoodViewHolder extends RecyclerView.ViewHolder {

    private AddedFoodViewModel mAddedFoodViewModel;

    private TextView titleText;
    private TextView proteinText;
    private TextView fatText;
    private TextView carbsText;
    private TextView sugarText;
    private TextView proteinTextRes;
    private TextView fatTextRes;
    private TextView carbsTextRes;
    private TextView sugarTextRes;
    private TextView caloriesText;
    private TextView caloriesTextRes;
    private TextView weightText;
    private TextView weightTextRes;

    public AddedFoodViewHolder(View itemView, AddedFoodViewModel addedFoodViewModel) {
        super(itemView);
        mAddedFoodViewModel = addedFoodViewModel;
        findViews(itemView);
    }

    private void findViews(View v) {
        titleText = v.findViewById(R.id.addedFood_title_textView);
        proteinText = v.findViewById(R.id.addedFood_protein_textView);
        fatText = v.findViewById(R.id.addedFood_fat_textView);
        carbsText = v.findViewById(R.id.addedFood_carbs_textView);
        sugarText = v.findViewById(R.id.addedFood_sugar_textView);
        proteinTextRes = v.findViewById(R.id.addedFood_protein_textView_result);
        fatTextRes = v.findViewById(R.id.addedFood_fat_textView_result);
        carbsTextRes = v.findViewById(R.id.addedFood_carbs_textView_result);
        sugarTextRes = v.findViewById(R.id.addedFood_sugar_textView_result);
        caloriesText = v.findViewById(R.id.addedFood_calories_textView);
        caloriesTextRes = v.findViewById(R.id.addedFood_calories_textView_result);
        weightText = v.findViewById(R.id.addedFood_weight_textView);
        weightTextRes = v.findViewById(R.id.addedFood_weight_textView_result);
    }

    private void setTitleView(String title) {
        titleText.setText(title);
    }

    private void setProteinView(String protein) {
        proteinTextRes.setText(protein);
    }

    private void setFatView(String fat) {
        fatTextRes.setText(fat);
    }

    private void setCarbsView(String carbs) {
        carbsTextRes.setText(carbs);
    }

    private void setSugarView(String sugar) {
        sugarTextRes.setText(sugar);
    }

    private void setCaloriesView(String kcal) {
        caloriesTextRes.setText(kcal);
    }

    private void setWeightView(String weight) {
        weightTextRes.setText(weight);
    }

    public void onBind(AddedFood addedfood, int position) {
        mAddedFoodViewModel.setAddedFood(addedfood);
        mAddedFoodViewModel.setPosition(position);
        setTitleView(mAddedFoodViewModel.getAddedFoodTitle());
        setProteinView(mAddedFoodViewModel.getAddedFoodProtein());
        setFatView(mAddedFoodViewModel.getAddedFoodFat());
        setCarbsView(mAddedFoodViewModel.getAddedFoodCarbs());
        setSugarView(mAddedFoodViewModel.getAddedFoodSugar());
        setCaloriesView(mAddedFoodViewModel.getAddedFoodKcal());
        setWeightView(mAddedFoodViewModel.getAddedFoodWeight());
    }
}
