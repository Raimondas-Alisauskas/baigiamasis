package com.vilniuscodingschool.baigiamasis;

class SearchCriteria {

    // susieti su searchOptions enums'ais?

    private String searchAuthor;
    private String searchTitle;
    private String searchISBN;
    private String searchPressHouse;
    private String searchLanguage;
    private String searchGenre;

    void setSearchAuthor(String searchAuthor) {
        this.searchAuthor = searchAuthor;
    }
    String getSearchAuthor() {
        return searchAuthor;
    }

    void setSearchTitle(String searchTitle) {
        this.searchTitle = searchTitle;
    }
    String getSearchTitle() {
        return searchTitle;
    }

    void setSearchISBN(String searchISBN) {
        this.searchISBN = searchISBN;
    }
    String getSearchISBN() {
        return searchISBN;
    }

    void setSearchPressHouse(String searchPressHouse) {
        this.searchPressHouse = searchPressHouse;
    }
    String getSearchPressHouse() {
        return searchPressHouse;
    }

    void setSearchLanguage(String searchLanguage) {
        this.searchLanguage = searchLanguage;
    }
    String getSearchLanguage() {
        return searchLanguage;
    }

    void setSearchGenre(String searchGenre) {
        this.searchGenre = searchGenre;
    }

    String getSearchGenre() {
        return searchGenre;
    }
}
