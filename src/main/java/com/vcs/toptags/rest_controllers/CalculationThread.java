package com.vcs.toptags.rest_controllers;

import com.vcs.toptags.actions.ActionsWithDataSources;

import java.util.concurrent.TimeUnit;

import static com.vcs.toptags.actions.Actions.LAST_TOP_WORDS;

public class CalculationThread extends Thread {

    public void run() {

        getNewData();
        try {
            TimeUnit.MINUTES.sleep(15);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void getNewData() {

        LAST_TOP_WORDS.setWordsDB((new ActionsWithDataSources()).actionsWithNewsWebPages());
    }
}
