package com.vcs.bogdan.Beans.Enums;

public enum SalaryCalcType {
    HOUR(0), DAY(1), MONTH(2);

    private int index;

    SalaryCalcType(int index) {
        this.index = index;
    }

    public int getIndex() {
        return index;
    }
}
