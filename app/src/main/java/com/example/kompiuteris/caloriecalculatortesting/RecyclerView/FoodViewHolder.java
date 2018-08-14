package com.example.kompiuteris.caloriecalculatortesting.RecyclerView;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.kompiuteris.caloriecalculatortesting.Dialogs.AddFoodDialog;
import com.example.kompiuteris.caloriecalculatortesting.Interfaces.AddFoodCalories;
import com.example.kompiuteris.caloriecalculatortesting.Dialogs.CustomDialog;
import com.example.kompiuteris.caloriecalculatortesting.Food;
import com.example.kompiuteris.caloriecalculatortesting.Database.FoodDatabase;
import com.example.kompiuteris.caloriecalculatortesting.Interfaces.ItemActionInterface;
import com.example.kompiuteris.caloriecalculatortesting.R;


public class FoodViewHolder extends RecyclerView.ViewHolder {

    private final FoodViewModel mFoodViewModel;

    private ItemActionInterface mItemActionInterface;
    private AddFoodCalories mAddFoodCaloriesInterface;

    private ImageButton addBtn;
    private ImageButton editBtn;
    private ImageButton delBtn;
    private TextView titleText;
    private TextView proteinTextRes;
    private TextView fatTextRes;
    private TextView carbsTextRes;
    private TextView sugarTextRes;
    private TextView caloriesTextRes;


    FoodViewHolder(View itemView, FoodViewModel foodViewModel) {
        super(itemView);
        mFoodViewModel = foodViewModel;
        findViews(itemView);
        setDelBtnOnClickListener();
        setEditBtn();
        setAddBtn();
    }

    private void findViews(View v) {
        addBtn = v.findViewById(R.id.add_btn);
        editBtn = v.findViewById(R.id.edit_btn);
        delBtn = v.findViewById(R.id.delete_btn);
        titleText = v.findViewById(R.id.food_title_textView);
        proteinTextRes = v.findViewById(R.id.food_protein_textView_result);
        fatTextRes = v.findViewById(R.id.food_fat_textView_result);
        carbsTextRes = v.findViewById(R.id.food_carbs_textView_result);
        sugarTextRes = v.findViewById(R.id.food_sugar_textView_result);
        caloriesTextRes = v.findViewById(R.id.food_calories_textView_result);
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

    public void onBind(Food food, int position) {
        mFoodViewModel.setFood(food);
        mFoodViewModel.setPosition(position);
        setTitleView(mFoodViewModel.getFoodTitle());
        setProteinView(mFoodViewModel.getFoodProtein());
        setFatView(mFoodViewModel.getFoodFat());
        setCarbsView(mFoodViewModel.getFoodCarbs());
        setSugarView(mFoodViewModel.getFoodSugar());
        setCaloriesView(mFoodViewModel.getFoodKcal());
    }

    private void setDelBtnOnClickListener() {
        delBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mItemActionInterface.onItemDelete(mFoodViewModel.getPosition());
                FoodDatabase.getInstance(v.getContext()).deleteRowFromFoodTable(mFoodViewModel.getFood().getmTitle());
            }
        });
    }

    public void setItemActionInterface(ItemActionInterface itemActionInterface) {
        mItemActionInterface = itemActionInterface;
    }

    public void setAddFoodCaloriesInterface(AddFoodCalories addFoodCaloriesInterface) {
        mAddFoodCaloriesInterface = addFoodCaloriesInterface;
    }

    private void setCustomDialogFields(CustomDialog customDialog) {
        customDialog.updateTitle(mFoodViewModel.getFoodTitle());
        customDialog.updateProtein(mFoodViewModel.getFoodProtein());
        customDialog.updateFat(mFoodViewModel.getFoodFat());
        customDialog.updateCarbs(mFoodViewModel.getFoodCarbs());
        customDialog.updateSugar(mFoodViewModel.getFoodSugar());
    }

    private void setCustomDialogListener(final CustomDialog customDialog) {
        customDialog.setOkBtnListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                customDialogFieldValidation(customDialog);
            }
        });
    }

    private int calculateKcal(CustomDialog customDialog) {
        return (int) Math.round(((Double.parseDouble(customDialog.getEditProtein()) * 4) +
                Double.parseDouble(customDialog.getEditFat()) * 9) +
                Double.parseDouble(customDialog.getEditCarbs()) * 4);
    }

    private void setNewFoodValues(CustomDialog customDialog) {
        int kcal = calculateKcal(customDialog);
        mFoodViewModel.getFood().setmTitle(customDialog.getEditTitle());
        mFoodViewModel.getFood().setmProtein(Double.parseDouble(customDialog.getEditProtein()));
        mFoodViewModel.getFood().setmFat(Double.parseDouble(customDialog.getEditFat()));
        mFoodViewModel.getFood().setmCarbs(Double.parseDouble(customDialog.getEditCarbs()));
        mFoodViewModel.getFood().setmSugar(Double.parseDouble(customDialog.getEditSugar()));
        mFoodViewModel.getFood().setmKcalForEdit(kcal);
        setTitleView(customDialog.getEditTitle());
        setProteinView(customDialog.getEditProtein());
        setFatView(customDialog.getEditFat());
        setCarbsView(customDialog.getEditCarbs());
        setSugarView(customDialog.getEditSugar());
        setCaloriesView(Integer.toString(kcal));
        FoodDatabase.getInstance(customDialog.getContext()).updateRowFoodTable(mFoodViewModel.getFood().getmId(), mFoodViewModel.getFood().getmTitle(),
                mFoodViewModel.getFood().getmProtein(), mFoodViewModel.getFood().getmFat(),
                mFoodViewModel.getFood().getmCarbs(), mFoodViewModel.getFood().getmSugar(),
                mFoodViewModel.getFood().getKcal());
        customDialog.dismiss();
    }

    private boolean checkNumberFormat(String value) {
        return (value.startsWith(".") || (value.startsWith("0") && value.endsWith("0") && value.length() > 1) || value.endsWith("."));
    }

    private void customDialogFieldValidation(CustomDialog customDialog) {
        if (checkNumberFormat(customDialog.getEditProtein()) || checkNumberFormat(customDialog.getEditCarbs()) ||
                checkNumberFormat(customDialog.getEditFat()) || checkNumberFormat(customDialog.getEditSugar())) {
            Toast.makeText(customDialog.getContext(), "Bad number format", Toast.LENGTH_SHORT).show();
        } else if (Double.parseDouble(customDialog.getEditCarbs()) >= Double.parseDouble(customDialog.getEditSugar())) {
            setNewFoodValues(customDialog);
        } else {
            Toast.makeText(customDialog.getContext(), "Can't be more sugars than carbs!", Toast.LENGTH_SHORT).show();
        }
    }

    private void showEditDialog(View v) {
        final CustomDialog customDialog = new CustomDialog(v.getContext());
        setCustomDialogFields(customDialog);
        setCustomDialogListener(customDialog);
        customDialog.show();
    }

    private void setEditBtn() {
        editBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showEditDialog(v);
            }
        });
    }

    private void checkAddItemWeight(View v, AddFoodDialog addFoodDialog) {
        if (addFoodDialog.getEditWeight().isEmpty()) {
            Toast.makeText(v.getContext(), "Please insert weight", Toast.LENGTH_SHORT).show();
        } else if (checkNumberFormat(addFoodDialog.getEditWeight()) || addFoodDialog.getEditWeight().equals("0")) {
            Toast.makeText(v.getContext(), "Bad number format", Toast.LENGTH_SHORT).show();
        } else if (addFoodDialog.getEditWeight().equals("100")) {
            mAddFoodCaloriesInterface.addFood(mFoodViewModel.getFood());
            addFoodDialog.dismiss();
        } else {
            mAddFoodCaloriesInterface.addFood(calculateFoodMacros(Integer.parseInt(addFoodDialog.getEditWeight())));
            addFoodDialog.dismiss();
        }
    }

    private void showAddFoodDialog(View v) {
        final AddFoodDialog addFoodDialog = new AddFoodDialog(v.getContext());
        addFoodDialog.setDialogTitle(mFoodViewModel.getFoodTitle());
        addFoodDialog.updateEditWeight(mFoodViewModel.getFoodWeight());
        addFoodDialog.setOkBtnListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkAddItemWeight(v, addFoodDialog);
            }
        });
        addFoodDialog.show();
    }

    private Food calculateFoodMacros(int weight) {
        Food newFood = new Food(mFoodViewModel.getFood().getmId(),
                mFoodViewModel.getFoodTitle(),
                mFoodViewModel.getFood().getmProtein() * weight / 100,
                mFoodViewModel.getFood().getmFat() * weight / 100,
                mFoodViewModel.getFood().getmCarbs() * weight / 100,
                mFoodViewModel.getFood().getmSugar() * weight / 100);
        newFood.setmWeight(weight);
        return newFood;
    }

    private void setAddBtn() {
        addBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showAddFoodDialog(v);
            }
        });
    }
}