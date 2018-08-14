package com.vcs.bogdan.Beans.Enums;

public enum DeductionType {

    TAX(0), SIFEE(1), SIFNEE(2), SIFER(3), HIFEE(4), HIFER(5), GFI(6);

    int index;

    DeductionType(int index){
        this.index = index;
    }

    public int getIndex(){
        return index;
    }
}
