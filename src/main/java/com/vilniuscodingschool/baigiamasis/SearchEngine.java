package com.vilniuscodingschool.baigiamasis;

import java.util.*;

class SearchEngine {

    private Scanner scanner = new Scanner(System.in);

    void SearchOfAuthor(BooksRepository booksRepository) {

        System.out.println("Atlikti paieškai pakanka įvesti autoriaus pirmąsias vardo raides");

        String searchByAuthor = scanner.nextLine();

        SearchCriteria parameters = new SearchCriteria();
        parameters.setSearchAuthor(searchByAuthor);

        List<BooksDescription> searchResult = search(booksRepository.BooksCatalogue(), parameters);

        if (!searchResult.isEmpty()) {
            for (BooksDescription book : searchResult) {

                System.out.println(book);
            }
        } else {
            System.out.println("Nieko nerasta.");

        }
    }

    void SearchOfTitle(BooksRepository booksRepository) {

        System.out.println("Paieškai atlikti pakanka įvesti ieškomos knygos pavadinimo pirmąsias raides.");

        String searchByTitle = scanner.nextLine();

        SearchCriteria parameters = new SearchCriteria();
        parameters.setSearchTitle(searchByTitle);

        List<BooksDescription> searchResult = search(booksRepository.BooksCatalogue(), parameters);

        if (!searchResult.isEmpty()) {
            for (BooksDescription book : searchResult) {

                System.out.println(book);
            }
        } else {
            System.out.println("Nieko nerasta.");
        }

    }

    void SearchOfISBN(BooksRepository booksRepository) {

        System.out.println("Įveskite ieškomos knygos ISBN numerį.");

        String searchByISBN = scanner.nextLine();

        SearchCriteria paramForSearch = new SearchCriteria();
        paramForSearch.setSearchISBN(searchByISBN);

        List<BooksDescription> searchResult = search(booksRepository.BooksCatalogue(), paramForSearch);

        if (!searchResult.isEmpty()) {
            for (BooksDescription book : searchResult) {

                System.out.println(book);
            }
        } else {
            System.out.println("Nieko nerasta.");
        }
    }


    void SearchOfPressHouse(BooksRepository booksRepository) {

        System.out.println("Įveskite ieškomos knygos leidyklos pavadinimo pirmąsias raides.");

        String searchByPressHouse = scanner.nextLine();

        SearchCriteria paramForSearch = new SearchCriteria();
        paramForSearch.setSearchPressHouse(searchByPressHouse);

        List<BooksDescription> searchResult = search(booksRepository.BooksCatalogue(), paramForSearch);

        if (!searchResult.isEmpty()) {
            for (BooksDescription book : searchResult) {

                System.out.println(book);
            }
        } else {
            System.out.println("Nieko nerasta.");
        }
    }

    void SearchOfLanguage(BooksRepository booksRepository) {

        System.out.println("Įveskite ieškomos knygos kalbos kalbą.");
        System.out.println("Galimi kalbų indeksai:");

        Languages objectLanguages = new Languages();
        List<String> languageList = objectLanguages.getLDescription();
        System.out.println(languageList);

        String searchByLanguage = scanner.nextLine();

        SearchCriteria searchLang = new SearchCriteria();
        searchLang.setSearchLanguage(searchByLanguage);

        System.out.println("Ieškosime knygų pagal kalbos indeksą: " + searchLang.getSearchLanguage());

        SearchCriteria paramForSearch = new SearchCriteria();
        paramForSearch.setSearchLanguage(searchByLanguage);

        List<BooksDescription> searchResult = search(booksRepository.BooksCatalogue(), paramForSearch);

        if (!searchResult.isEmpty()) {
            for (BooksDescription book : searchResult) {

                System.out.println(book);
            }
        } else {
            System.out.println("Nieko nerasta.");
        }
    }

    void SearchOfGenre(BooksRepository booksRepository) {

        System.out.println("Įveskite knygos žanrą: ");
        System.out.println("Galimi žanrai:");

        Genres objectGenres = new Genres();
        List<String> listGenres = objectGenres.getGDescription();
        System.out.println(listGenres);

        String searchByGenre = scanner.nextLine();

        SearchCriteria paramForSearch = new SearchCriteria();
        paramForSearch.setSearchGenre(searchByGenre);

        List<BooksDescription> searchResult = search(booksRepository.BooksCatalogue(), paramForSearch);

        if (!searchResult.isEmpty()) {
            for (BooksDescription book : searchResult) {

                System.out.println(book);
            }
        } else {
            System.out.println("Nieko nerasta.");
        }

    }

    private List<BooksDescription> search(List<BooksDescription> books, SearchCriteria k) {

        boolean elegible = true;

        List<BooksDescription> currentBooks = new ArrayList<>();

        for (BooksDescription description : books) {

            boolean verifying = false;

            if (k.getSearchAuthor() != null) {
                if (description.getAuthor().startsWith(k.getSearchAuthor())) {
                    verifying = true;
                } else {
                    elegible = false;
                }
            }

            if (k.getSearchTitle() != null) {
                if (description.getTitle().startsWith(k.getSearchTitle())) {
                    verifying = true;
                } else {
                    elegible = false;
                }
            }

            if (k.getSearchISBN() != null) {
                if (description.getNumberISBN().startsWith(k.getSearchISBN())) {
                    verifying = true;
                } else {
                    elegible = false;
                }
            }

            if (k.getSearchPressHouse() != null) {
                if (description.getPressHouse().startsWith(k.getSearchPressHouse())) {
                    verifying = true;
                } else {
                    elegible = false;
                }
            }

            if (k.getSearchLanguage() != null) {
                if (description.getLanguage().startsWith(k.getSearchLanguage())) {
                    verifying = true;
                } else {
                    elegible = false;
                }
            }

            if (k.getSearchGenre() != null) {
                if (description.getBookGenre().startsWith(k.getSearchGenre())) {
                    verifying = true;
                } else {
                    elegible = false;
                }
            }

            if (verifying && elegible) {
                // adding result into currentBooks list
                currentBooks.add(description);
            }

            elegible = true;
        }

        return currentBooks;
    }

}
