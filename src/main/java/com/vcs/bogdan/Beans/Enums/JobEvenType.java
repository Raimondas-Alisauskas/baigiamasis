package com.vcs.bogdan.Beans.Enums;

public enum JobEvenType {
    START(0), UPDATE(1), FINISH(2);

    private int index;

    JobEvenType(int index) {
        this.index = index;
    }

}