package com.vilniuscodingschool.baigiamasis.lib;

import com.vilniuscodingschool.baigiamasis.repo.BooksDescription;

import java.util.ArrayList;
import java.util.List;

public class BooksRepository {


    public List<BooksDescription> BooksCatalogue() {

        List<BooksDescription> book = new ArrayList<>();
        book.add(new BooksDescription(1, "Antoine de Saint-Exupéry", "Mažasis princas", "9789955089629", "Alma littera", "LT", "Vaikams", 5, 1));
        book.add(new BooksDescription(2, "Pranas Kūris", "Misija ...(ne)kasdieniška diplomato kasdienybė... ", "9789986868644", "Santara", "LT", "Dalykinis", 4, 1));
        book.add(new BooksDescription(3, "Dailius Dargis", "Kruvinasis mafijos maršrutas", "9786099517513", "balsas.lt", "LT", "Dokumentika", 3, 1));
        book.add(new BooksDescription(4, "Vaida Kurpienė, Martynas Praškevičius, Aistė Šeibokaitė", "Balansas. Skanus maistas ir sveikos gyvensenos idėjos aktyviems žmonėms", "9786099548470", "Aukso žuvys", "LT", "Receptai", 4, 1));
        book.add(new BooksDescription(5, "Jonas Blonskis, Vytautas Bukšnaitis, Vacius Jusas", "Programavimo įvadas", "9786090209561", "KTU leidykla Technologija", "LT", "Mokomoji", 3, 1));
        book.add(new BooksDescription(6, "Laurent Gounelle", "Les Dieux Voyagent Toujours Incognito", "9782266219150", "French and European Publications Inc", "FR", "Psichologija", 7, 1));
        book.add(new BooksDescription(7, "Alain De Botton ", "The Art of Travel", "9780375725340", "Vintage", "EN", "Keliautojams", 7, 1));

        return book;

    }
}
