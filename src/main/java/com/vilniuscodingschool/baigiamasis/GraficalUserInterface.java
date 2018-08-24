package com.vilniuscodingschool.baigiamasis;

import java.util.Arrays;
import java.util.Scanner;

public class GraficalUserInterface {

    public static void main(String[] args) {
        // is main iskelti
        // padalinti i packages
        // paieškos selectinime panaikinti "neaiškius skaičius" >>>>>>>>>>>> iškelta į atskirą enums klasę SearchOptions
        // iskelti i enums >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>> PADARYTA
        // saraso dinamiskumas
        // search engine yra kodo duplikatai - padaryti vienna universalu su handler

        BooksRepository booksRepository = new BooksRepository();

        Scanner scanner = new Scanner(System.in);

        boolean engageSearch = true;

        while (engageSearch) {

            System.out.println("Knygas galite ieškoti pagal šiuos kriterijus, prašome išsirinkti\n(tiesiog nukopijuokite atitinkantį paieškos kriterijų ir paspauskite Enter): ");
            System.out.println(Arrays.toString(SearchOptions.values()));

            String searchOption = scanner.nextLine();

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
             else {

                System.out.println("Jūs pasirinkote nežinomą paieškos būdą! -> " + searchOption + " <-");

            }

            System.out.println("\nPaieška baigta.\nAr norite ją pradėti iš naujo?");
            System.out.println("\nTaip - spauskite bet kokį klavišą ir jus būsite nukreipti į paieškos pradžią\nNe - paieškai baigti, spauskite n + Enter");

            String resumeSearch = scanner.nextLine();

            if (resumeSearch.equals("n")) {
                scanner.close();
                engageSearch = false;

            } else {
                engageSearch = true;
            }
        }
    }
}
