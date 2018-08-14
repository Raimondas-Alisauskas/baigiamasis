package com.vilniuscodingschool.baigiamasis;

import java.util.Scanner;


public class GrafineVartotojoSasaja {

    public static void main(String[] args) {

        // sukuriame objektą
        Scanner scanner = new Scanner(System.in);

        boolean engageSearch = true;

        while (engageSearch) {

            System.out.println("Knygas galite ieškoti pagal šiuos kriterijus, prašome išsirinkti (tiesiog nukopijuokite į ekraną pasirinktą būdą ir paspauskite Enter): ");
            System.out.println("autorius, pavadinimas, ISBN, leidykla, kalba, žanras.");

            String searchOption = scanner.nextLine();

            if (searchOption.equals("autorius") || searchOption.equals("pavadinimas") || searchOption.equals("ISBN") || searchOption.equals("leidykla") || searchOption.equals("kalba") || searchOption.equals("žanras")) {

                System.out.println("Jūsų pasirinktas paieškos būdas: " + "'" + searchOption + "'");
                System.out.println("Paieškai pradėti spauskite bet kurį klavišą.");

                String userOption = scanner.nextLine();

            } else

                System.out.println("Jūs pasirinkote nežinomą paieškos būdą!");



            if (searchOption.equals("autorius")) {

                System.out.println("Įveskite ieškomo autoriaus vardą arba pavardę: ");

                String searchAuthor = scanner.nextLine();




                scanner.nextLine();

                // atspausdinam paieškos rezultatą

                scanner.close();
                break;


            }


            if (searchOption.equals("pavadinimas")) {

                System.out.println("Įveskite ieškomos knygos pavadinimą: ");

                String searchTitle = scanner.nextLine();

                scanner.nextLine();

                // atspausdinam paieškos rezultatą

                scanner.close();
                break;


            }
            if (searchOption.equals("ISBN")) {

                System.out.println("Įveskite ieškomos knygos ISBN: ");

                String searchISBN = scanner.nextLine();

                scanner.nextLine();

                // atspausdinam paieškos rezultatą

                scanner.close();
                break;


            }
            if (searchOption.equals("leidykla")) {

                System.out.println("Įveskite ieškomos knygos leidyklos pavadinimą: ");

                String searchPressHouse = scanner.nextLine();

                scanner.nextLine();

                // atspausdinam paieškos rezultatą

                scanner.close();
                break;


            }
            if (searchOption.equals("kalba")) {

                System.out.println("Įveskite ieškomos knygos kalbą: ");
                // gal reiktų System.out.println(kalbos); kalbos iš List????


                String searchLanguage = scanner.nextLine();
                scanner.nextLine();

                // atspausdinam paieškos rezultatą

                scanner.close();
                break;


            }
            if (searchOption.equals("žanras")) {

                System.out.println("Įveskite knygos žanrą: ");
                // gal reiktų System.out.println(zanrai); žanrai iš List????

                String searchGenre = scanner.nextLine();
                scanner.nextLine();

                // atspausdinam paieškos rezultatą

                scanner.close();
                break;

            }

        }

        engageSearch = true;
    }
}
