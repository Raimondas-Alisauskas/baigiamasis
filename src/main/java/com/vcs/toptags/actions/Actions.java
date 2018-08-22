package com.vcs.toptags.actions;

import com.vcs.toptags.db.IWordsDB;
import com.vcs.toptags.db.WordsDB;
import com.vcs.toptags.rest_controllers.CalculationThread;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Actions {

    public static IWordsDB LAST_TOP_WORDS = new WordsDB();

    private int dataScaningTime = 15;

    @PostConstruct
    public void actionsWithNewsWebPages() throws InterruptedException {

        //TODO Delete sout from Action.java and move it to web app.
        System.out.println("Program has started. Counting could take up to 3-5 min, so plz. be patient! :)");

        // Visu duomenu is puslapio gavimo metodas
        CalculationThread thread = new CalculationThread();
        thread.start();

    }

}