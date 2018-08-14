package com.vilniuscodingschool.baigiamasis;

import java.util.ArrayList;
import java.util.List;

// sasaja -> collections -> MainMap
public class KnyguSaugykla {


    public static void KnyguSaugykla(String[] args) {

        List<KnyguAprasas> book = new ArrayList<>();
        book.add(new KnyguAprasas("Antoine de Saint-Exupéry", "Mažasis princas", "9789955089629", "Alma littera", "LT", "Vaikams", 5, 1));
        book.add(new KnyguAprasas("Pranas Kūris", "Misija ...(ne)kasdieniška diplomato kasdienybė... ", "9789986868644", "Santara", "LT", "Dalykinė literatūra", 4, 1));
        book.add(new KnyguAprasas("Dailius Dargis", "Kruvinasis mafijos maršrutas", "9786099517513", "balsas.lt", "LT", "Dokumentika", 3, 1));
        book.add(new KnyguAprasas("Vaida Kurpienė, Martynas Praškevičius, Aistė Šeibokaitė", "Balansas. Skanus maistas ir sveikos gyvensenos idėjos aktyviems žmonėms", "9786099548470", "Aukso žuvys", "LT", "Receptai", 4, 1));
        book.add(new KnyguAprasas("Jonas Blonskis, Vytautas Bukšnaitis, Vacius Jusas", "Programavimo įvadas", "9786090209561", "KTU leidykla Technologija", "LT", "Mokomoji literatūra", 3, 1));
        book.add(new KnyguAprasas("Laurent Gounelle", "Les Dieux Voyagent Toujours Incognito", "9782266219150", "French and European Publications Inc", "FR", "Psichologija", 7, 1));
        book.add(new KnyguAprasas("Laurent Gounelle", "Les Dieux Voyagent Toujours Incognito", "9782266219150", "French and European Publications Inc", "FR", "Psichologija", 7, 1));
        book.add(new KnyguAprasas("Alain De Botton ", "The Art of Travel", "9780375725340", "Vintage", "EN", "Kelionės", 7, 1));


        // paieškos pagal autorių inicializavimas
       /* Map<String, List<KnyguAprasas>> bookByAuthor = new HashMap<>();
        for (KnyguAprasas knygos : book) {

            if (!bookByAuthor.containsKey(knygos.getAuthor())) {
                // Jei nera - itraukiam: vardas kaip key, o value kaip tuscias ArrayList()
                // nes sekancioj eilutej pridesim i ta ArrayList'a reiksme
                bookByAuthor.put(knygos.getAuthor(), new ArrayList<>());
            }
            // Cia itraukiam Person objekta pagal varda
            bookByAuthor.get(knygos.getAuthor()).add(knygos);



            System.out.println(knygos);
        }
*/
    }

}
