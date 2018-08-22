package com.vcs.toptags.rest_controllers;

import org.springframework.stereotype.Component;


@Component
public class NewsService implements INewsService {

    public String getHTML() {

        return "<!DOCTYPE html><html><body><h1>Cia bus HTML</h1><p>gal.... ;)<b>" + "</p></body></html>";
    }
}
