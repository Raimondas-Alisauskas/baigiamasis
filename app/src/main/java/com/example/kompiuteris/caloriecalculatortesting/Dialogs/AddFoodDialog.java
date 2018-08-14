package com.example.kompiuteris.caloriecalculatortesting.Dialogs;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.kompiuteris.caloriecalculatortesting.R;

public class AddFoodDialog extends Dialog {

    private Button okBtn;
    private Button cancelBtn;
    private EditText editWeight;
    private TextView mTitle;


    public AddFoodDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.added_food_dialog);
        mTitle = findViewById(R.id.dialogTitle);
        setCancelButton();
        setEditWeight();
        setOkBtn();
    }


    private void setCancelButton(){
        cancelBtn = findViewById(R.id.dialogCancel_btn);
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancel();
            }
        });
    }

    private void setEditWeight() {
        editWeight = findViewById(R.id.weightEditFood_editText);
    }

    private void setOkBtn() {
        okBtn = findViewById(R.id.okEditAddedFood_btn);
    }

    public void setOkBtnListener(View.OnClickListener onClickListener) {
        okBtn.setOnClickListener(onClickListener);
    }

    public void setDialogTitle(String title) {
        mTitle.setText("Set "+title+ " amount in grams");
    }

    public void updateEditWeight(String weight) {
        editWeight.setText(weight);
    }

    public String getEditWeight() {
        return editWeight.getText().toString();
    }




}
