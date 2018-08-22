package com.vcs.toptags.rest_controllers;

import com.google.gson.Gson;

import static com.vcs.toptags.actions.Actions.LAST_TOP_WORDS;


public class NewsService implements INewsService{

    public String getHTML() {

        return "<!DOCTYPE html><html><body><h1>Cia bus HTML</h1><p>gal.... ;)<b>" + "</p></body></html>";
    }


    public String getJSON() {
        Gson gson = new Gson();

        return gson.toJson(LAST_TOP_WORDS.getWordsDB());
    }
}
