package com.vcs.toptags.rest_controllers;

import com.vcs.toptags.page_adapters.INewsPage;
import com.vcs.toptags.page_adapters.INewsPageTopWords;
import com.vcs.toptags.page_adapters.NewsPageTopWords;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.vcs.toptags.actions.Actions.LAST_TOP_WORDS;


@RestController
@RequestMapping("/")
public class TagRest {

    @Autowired
    private NewsService service;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getHTML() {
        return service.getHTML();
    }

    @RequestMapping(value = "/json", method = RequestMethod.GET)
    public List<INewsPage> getJSON() {
        return LAST_TOP_WORDS.getWordsDB();
    }

    @RequestMapping(value = "/json/{web}", method = RequestMethod.GET)
    public INewsPageTopWords getPage(@PathVariable("web") String web) {

        for (INewsPage page : LAST_TOP_WORDS.getWordsDB()) {
            if (page.getWebDomain().contains(web)) {

                return new NewsPageTopWords(page.getFilteredTopWordsArray());
            }
        }
        //TODO change return null to smth.
        return new NewsPageTopWords();
    }

    @RequestMapping(value = "/{text}", method = RequestMethod.GET)
    public String wrongText(@PathVariable("text") String textFromRequest) {
        return "<!DOCTYPE html><html><body><h1>Neteisingas pletinys</h1><tr><td><p>tokio pletinio nera:<b> " + textFromRequest +
                "</p></td>Naudok: <b>/</b>  arba  <b>/json  arba  <b>/jason/web_page_name</b></tr></body></html>";
    }
}
