package com.vcs.toptags.rest_controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


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
        public String getJSON() {
            return service.getJSON();
        }

}
