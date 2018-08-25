package com.vilniuscodingschool.baigiamasis.front;

import com.vilniuscodingschool.baigiamasis.lib.BooksRepository;
import com.vilniuscodingschool.baigiamasis.repo.SearchOptions;
import com.vilniuscodingschool.baigiamasis.search.SearchEngine;

import java.util.Arrays;
import java.util.Scanner;

public class GraficalUserInterface {

    public static void communication() {

        BooksRepository booksRepository = new BooksRepository();

        Scanner userInput = new Scanner(System.in);

        boolean engageSearch = true;

        while (engageSearch) {

            System.out.println("Knygas galite ieškoti pagal šiuos kriterijus, prašome išsirinkti\n(tiesiog nukopijuokite atitinkantį paieškos kriterijų ir paspauskite Enter): ");
            System.out.println(Arrays.toString(SearchOptions.values()));


            String searchOption = userInput.nextLine();

            if ((SearchOptions.Autorius).toString().equals(searchOption)) {

                SearchEngine requestAuthor = new SearchEngine();
                requestAuthor.SearchOfAuthor(booksRepository);

            }

            if ((SearchOptions.Pavadinimas).toString().equals(searchOption)) {

                SearchEngine requestTitle = new SearchEngine();
                requestTitle.SearchOfTitle(booksRepository);


            }
            if ((SearchOptions.ISBN).toString().equals(searchOption)) {

                SearchEngine requestISBN = new SearchEngine();
                requestISBN.SearchOfISBN(booksRepository);


            }
            if ((SearchOptions.Leidykla).toString().equals(searchOption)) {

                SearchEngine requestPressHouse = new SearchEngine();
                requestPressHouse.SearchOfPressHouse(booksRepository);


            }
            if ((SearchOptions.Kalba).toString().equals(searchOption)) {

                SearchEngine requestLanguage = new SearchEngine();
                requestLanguage.SearchOfLanguage(booksRepository);


            }
            if ((SearchOptions.Tipas).toString().equals(searchOption)) {

                SearchEngine requestGenre = new SearchEngine();
                requestGenre.SearchOfGenre(booksRepository);

            }

            System.out.println("\nPaieška baigta.\nAr norite ją pradėti iš naujo?");
            System.out.println("\nn + ENTER -> paieškai baigti.\nspauskite Enter -> jus būsite nukreipti į paieškos pradžią.");

            String resumeSearch = userInput.nextLine();

            if (resumeSearch.equals("n")) {

                userInput.close();
                engageSearch = false;

            } else {

                engageSearch = true;

            }

        }
    }
}

