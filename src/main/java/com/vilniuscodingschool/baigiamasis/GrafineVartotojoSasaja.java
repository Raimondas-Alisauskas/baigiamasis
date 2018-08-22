package com.vilniuscodingschool.baigiamasis;

import java.util.Scanner;

public class GrafineVartotojoSasaja {

    public static void main(String[] args) {

        KnyguSaugykla knyguSaugykla = new KnyguSaugykla();

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

                PaieskuModulis uzklausaAutoriui = new PaieskuModulis();
                uzklausaAutoriui.IeskomPagalAutoriu(knyguSaugykla);
            }

            if (searchOption.equals("2")) {

                PaieskuModulis uzklausaPavadinimui = new PaieskuModulis();
                uzklausaPavadinimui.IeskomPagalPavadinima(knyguSaugykla);

            }
            if (searchOption.equals("3")) {

                PaieskuModulis uzklausaISBN = new PaieskuModulis();
                uzklausaISBN.IeskomPagalISBN(knyguSaugykla);

            }
            if (searchOption.equals("4")) {

                PaieskuModulis uzklausaLeidyklai = new PaieskuModulis();
                uzklausaLeidyklai.IeskomPagalLeidykla(knyguSaugykla);

            }
            if (searchOption.equals("5")) {

                PaieskuModulis uzklausaKalba = new PaieskuModulis();
                uzklausaKalba.IeskomPagalKalba(knyguSaugykla);

            }
            if (searchOption.equals("6")) {

                PaieskuModulis uzklausaZanras = new PaieskuModulis();
                uzklausaZanras.IeskomPagalZanra(knyguSaugykla);

            }

            System.out.println("\nPaieška baigta.\nAr norite ją pradėti iš naujo?");
            System.out.println("\nTaip - spauskite bet kokį klavišą ir jus būsite nukreipti į paieškos pradžią\nNe - paieškai baigti, spauskite n");

            String arTesiamPaieska = scanner.nextLine();
            if (arTesiamPaieska.equals("n")) {
                scanner.close();
                engageSearch = false;

            } else {
                engageSearch = true;
            }
        }
    }
}
