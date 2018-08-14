package com.example.kompiuteris.caloriecalculatortesting.Dialogs;

import android.app.Dialog;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.kompiuteris.caloriecalculatortesting.R;


public class CustomDialog extends Dialog {

    private Button okBtn;
    private Button cancelBtn;
    private EditText editTitle;
    private EditText editProtein;
    private EditText editFat;
    private EditText editCarbs;
    private EditText editSugar;

    public CustomDialog(@NonNull Context context) {
        super(context);
        setContentView(R.layout.custom_dialog);
        setCancelButton();
        setOkBtn();
        setEditTexts();
    }

    private void setCancelButton(){
        cancelBtn = findViewById(R.id.cancelEditFood_btn);
        cancelBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cancel();
            }
        });
    }

    private void setEditTexts() {
        editTitle = findViewById(R.id.foodEditTitle_editText);
        editProtein = findViewById(R.id.proteinEditFood_editText);
        editFat = findViewById(R.id.fatEditFood_editText);
        editCarbs = findViewById(R.id.carbsEditFood_editText);
        editSugar = findViewById(R.id.sugarEditFood_editText);
    }

    private void setOkBtn() {
        okBtn = findViewById(R.id.okEditFood_btn);
    }

    public void setOkBtnListener(View.OnClickListener onClickListener) {
        okBtn.setOnClickListener(onClickListener);
    }

    public void updateTitle(String title) {
        editTitle.setText(title);
    }

    public void updateProtein(String protein) {
        editProtein.setText(protein);
    }
    public void updateFat(String fat) {
        editFat.setText(fat);
    }
    public void updateCarbs(String carbs) {
        editCarbs.setText(carbs);
    }
    public void updateSugar(String sugar) {
        editSugar.setText(sugar);
    }

    public String getEditTitle() {
        return editTitle.getText().toString();
    }

    public String getEditProtein() {
        return editProtein.getText().toString();
    }

    public String getEditFat() {
        return editFat.getText().toString();
    }

    public String getEditCarbs() {
        return editCarbs.getText().toString();
    }

    public String getEditSugar() {
        return editSugar.getText().toString();
    }
}
