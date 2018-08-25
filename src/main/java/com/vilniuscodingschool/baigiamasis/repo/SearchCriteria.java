package com.vilniuscodingschool.baigiamasis.repo;

public class SearchCriteria {

    // susieti su searchOptions enums'ais?

    private String searchAuthor;
    private String searchTitle;
    private String searchISBN;
    private String searchPressHouse;
    private String searchLanguage;
    private String searchGenre;

    public void setSearchAuthor(String searchAuthor) {
        this.searchAuthor = searchAuthor;
    }
    public String getSearchAuthor() {
        return searchAuthor;
    }

    public void setSearchTitle(String searchTitle) {
        this.searchTitle = searchTitle;
    }
    public String getSearchTitle() {
        return searchTitle;
    }

    public void setSearchISBN(String searchISBN) {
        this.searchISBN = searchISBN;
    }
    public String getSearchISBN() {
        return searchISBN;
    }

    public void setSearchPressHouse(String searchPressHouse) {
        this.searchPressHouse = searchPressHouse;
    }
    public String getSearchPressHouse() {
        return searchPressHouse;
    }

    public void setSearchLanguage(String searchLanguage) {
        this.searchLanguage = searchLanguage;
    }
    public String getSearchLanguage() {
        return searchLanguage;
    }

    public void setSearchGenre(String searchGenre) {
        this.searchGenre = searchGenre;
    }

    public String getSearchGenre() {
        return searchGenre;
    }
}
