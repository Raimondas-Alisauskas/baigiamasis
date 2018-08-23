package com.vilniuscodingschool.baigiamasis;

public class BooksDescription extends BooksRepository {

    private String author;
    private String title;
    private String numberISBN;
    private String pressHouse;
    private String language;
    private String bookGenre;
    private int popularity;
    private int availability;
    private int numeration;

    BooksDescription(int numeracy, String author, String title, String numberISBN, String pressHouse, String language,
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

    String getAuthor() {
        return author;
    }

    String getTitle() {
        return title;
    }

    String getNumberISBN() {
        return numberISBN;
    }

    String getPressHouse() {
        return pressHouse;
    }

    String getLanguage() {
        return language;
    }

    String getBookGenre() {
        return bookGenre;
    }

    /*
    Part of the code for possible additional search options:

    public int getPopularity() {
        return popularity;
    }

    public int getAvailability() {
        return availability;
    }
    public int getNumeracy() {
        return numeration;
    }*/

    @Override
    public String toString() {
        return "Numeracy in library: " + numeration + "; Author: " + author + "; title: " + title + "; numberISBN: " + numberISBN + "; pressHouse " + pressHouse
                + "; language: " + language + "; bookGenre: " + bookGenre + "; popularity: " + popularity +
                "; availability: " + availability;
    }

}

