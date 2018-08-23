package com.vilniuscodingschool.baigiamasis;

import java.util.Scanner;

public class GraficalUserInterface {

    public static void main(String[] args) {

        BooksRepository booksRepository = new BooksRepository();

        Scanner scanner = new Scanner(System.in);

        boolean engageSearch = true;

        while (engageSearch) {

            System.out.println("Knygas galite ieškoti pagal šiuos kriterijus, prašome išsirinkti\n(tiesiog paspauskite skaičių atitinkantį paieškos kriterijų ir paspauskite Enter): ");
            System.out.println("1 - autorius\n2 - pavadinimas\n3 - ISBN\n4 - leidykla\n5 - kalba\n6 - žanras");

            String searchOption = scanner.nextLine();

            if (searchOption.equals("1") || searchOption.equals("2") || searchOption.equals("3") || searchOption.equals("4") || searchOption.equals("5") || searchOption.equals("6")) {

                System.out.println("Jūsų pasirinktas paieškos būdas: " + searchOption);
                System.out.println("Paieškai pradėti spauskite ENTER.");

                scanner.nextLine();

            } else {

                System.out.println("Jūs pasirinkote nežinomą paieškos būdą! -> " + searchOption);
            }

            if (searchOption.equals("1")) {

                SearchEngine requestAuthor = new SearchEngine();
                requestAuthor.SearchOfAuthor(booksRepository);
            }

            if (searchOption.equals("2")) {

                SearchEngine requestTitle = new SearchEngine();
                requestTitle.SearchOfTitle(booksRepository);

            }
            if (searchOption.equals("3")) {

                SearchEngine requestISBN = new SearchEngine();
                requestISBN.SearchOfISBN(booksRepository);

            }
            if (searchOption.equals("4")) {

                SearchEngine requestPressHouse = new SearchEngine();
                requestPressHouse.SearchOfPressHouse(booksRepository);

            }
            if (searchOption.equals("5")) {

                SearchEngine requestLanguage = new SearchEngine();
                requestLanguage.SearchOfLanguage(booksRepository);

            }
            if (searchOption.equals("6")) {

                SearchEngine requestGenre = new SearchEngine();
                requestGenre.SearchOfGenre(booksRepository);

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
