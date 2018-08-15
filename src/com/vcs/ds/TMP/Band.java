package com.vcs.ds.TMP;

import com.vcs.ds._10_model.input.RequestInput;
import com.vcs.ds._50_General.IdGenerator;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

import static java.time.LocalDateTime.now;

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

/*

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
*/
        String str;
        str = IdGenerator.generateIdKey("Cl ");
        System.out.println("6 " + str);



        Band2 obj = new Band2("a", "120", "",
                "", "", "", "");

        Map<String, String> mapas = new HashMap<>();
        mapas.put("client name", "a");

        RequestInput obj2 = new RequestInput();
        String s2 = new RequestInput().getClientName();

//        RequestInput ri;
//        String c = ri.getClientName();

        LocalDate.parse(new RequestInput().getDeadline());

    }

}
