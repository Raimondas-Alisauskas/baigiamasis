package com.vcs.ds.TMP;

import com.vcs.ds._30_proposal.ProposalPriceCalculator;
import com.vcs.ds._50_General.IdGenerator;
import sun.nio.cs.Surrogate;

import javax.crypto.KeyGeneratorSpi;
import java.sql.Time;
import java.sql.Timestamp;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.UUID;

import static java.time.LocalDateTime.now;
import static javax.swing.text.html.HTML.Tag.I;

public class Band {


    public static void main(String[] args) {


//    private double ma(double materialCost, double mass) {
//        double a;
//        return a = materialCost * mass;
//    }
//
//
//    public static int minFunction(int n1, int n2) {
//        int min;
//        if (n1 > n2)
//            min = n2;
//        else
//            min = n1;
//
//        return min;
//    }
//     double c = ma(20, 30);


        System.out.println("1 " + UUID.randomUUID());
        UUID k = UUID.randomUUID();
        System.out.println("11 " + k.version());
        System.out.println("2 " + System.currentTimeMillis());
        long x = System.currentTimeMillis();
        System.out.println("21 " + x);
        System.out.println("22 " + Time.from(Instant.ofEpochMilli(x)));

        System.out.println("3 " + System.nanoTime());
        System.out.println("31 " + Instant.now());
        System.out.println("32 " + Timestamp.from(Instant.now()));
        System.out.println("34 " + Instant.now().getEpochSecond());
        System.out.println("35 " + Instant.now());

        System.out.println("4 " + LocalDateTime.now());
        System.out.println("5 " + LocalDateTime.now().getYear());
        //System.out.println("6 " + UUID.randomUUID().timestamp());
        Timestamp.from(Instant.now());

        String a;
        a = IdGenerator.idKeyGen("Cl");
        System.out.println("6 " + a);


    }

}
