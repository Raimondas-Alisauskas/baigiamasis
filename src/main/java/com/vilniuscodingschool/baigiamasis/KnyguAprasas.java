package com.vilniuscodingschool.baigiamasis;

public class KnyguAprasas extends KnyguSaugykla {

    private String author;
    private String title;
    private String numberISBN;
    private String pressHouse;
    private String language;
    private String bookGenre;
    private int popularity;
    private int availability;
    private int numeration;

    public KnyguAprasas(int numeracy, String author, String title, String numberISBN, String pressHouse, String language,
                        String bookGenre, int popularity, int availability) {
        this.author = author;
        this.title = title;
        this.numberISBN = numberISBN;
        this.pressHouse = pressHouse;
        this.language = language;
        this.bookGenre = bookGenre;
        this.popularity = popularity;
        this.availability = availability;
        this.numeration = numeracy;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getNumberISBN() {
        return numberISBN;
    }

    public String getPressHouse() {
        return pressHouse;
    }

    public String getLanguage() {
        return language;
    }

    public String getBookGenre() {
        return bookGenre;
    }

    public int getPopularity() {
        return popularity;
    }

    public int getAvailability() {
        return availability;
    }
    public int getNumeracy() {
        return numeration;
    }

    @Override
    public String toString() {
        return "Numeracy in library: " + numeration + "; Author: " + author + "; title: " + title + "; numberISBN: " + numberISBN + "; pressHouse " + pressHouse
                + "; language: " + language + "; bookGenre: " + bookGenre + "; popularity: " + popularity +
                "; availability: " + availability;
    }

}

