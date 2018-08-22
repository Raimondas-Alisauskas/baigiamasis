package com.vilniuscodingschool.baigiamasis;

import java.util.ArrayList;
import java.util.List;

public class KnyguSaugykla {


    public List<KnyguAprasas> KnyguSarasas() {

        List<KnyguAprasas> book = new ArrayList<>();
        book.add(new KnyguAprasas(1, "Antoine de Saint-Exupéry", "Mažasis princas", "9789955089629", "Alma littera", "LT", "Vaikams", 5, 1));
        book.add(new KnyguAprasas(2, "Pranas Kūris", "Misija ...(ne)kasdieniška diplomato kasdienybė... ", "9789986868644", "Santara", "LT", "Dalykinė", 4, 1));
        book.add(new KnyguAprasas(3, "Dailius Dargis", "Kruvinasis mafijos maršrutas", "9786099517513", "balsas.lt", "LT", "Dokumentika", 3, 1));
        book.add(new KnyguAprasas(4, "Vaida Kurpienė, Martynas Praškevičius, Aistė Šeibokaitė", "Balansas. Skanus maistas ir sveikos gyvensenos idėjos aktyviems žmonėms", "9786099548470", "Aukso žuvys", "LT", "Receptai", 4, 1));
        book.add(new KnyguAprasas(5, "Jonas Blonskis, Vytautas Bukšnaitis, Vacius Jusas", "Programavimo įvadas", "9786090209561", "KTU leidykla Technologija", "LT", "Mokomoji", 3, 1));
        book.add(new KnyguAprasas(6, "Laurent Gounelle", "Les Dieux Voyagent Toujours Incognito", "9782266219150", "French and European Publications Inc", "FR", "Psichologija", 7, 1));
        book.add(new KnyguAprasas(7, "Alain De Botton ", "The Art of Travel", "9780375725340", "Vintage", "EN", "Kelionės", 7, 1));

        return book;

    }
}
