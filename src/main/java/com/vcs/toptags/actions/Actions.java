package com.vcs.toptags.actions;

import com.vcs.toptags.db.IWordsDB;
import com.vcs.toptags.db.WordsDB;
import com.vcs.toptags.io.PrintAll;
import com.vcs.toptags.page_adapters.INewsPage;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Actions {

    public static IWordsDB LAST_TOP_WORDS = new WordsDB();

    private int dataScaningTime = 15;

    public void actionsWithNewsWebPages() {

        //TODO Delete sout from Action.java and move it to web app.
        System.out.println("Program has started. Counting could take up to 3-5 min, so plz. be patient! :)");


        getNewData();


        // TODO DELETE PrintIt
        for (int i = 0; i < LAST_TOP_WORDS.getWordsDB().size(); i++) {
            printIt(LAST_TOP_WORDS.getWordsDB().get(i));
        }
    }

    private void getNewData() {

        (new ActionsWithDataSources()).actionsWithNewsWebPages();

    }

    private void printIt(INewsPage newsPage) {
        // Print Top Words
        new PrintAll().printTopWords(newsPage);

    }


}