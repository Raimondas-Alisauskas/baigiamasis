package com.vcs.bogdan.Ui;

import java.io.*;

public class AppFileReader {

    public static void main(String[] args) throws IOException {
        File f = new File("aaa.txt");
        if (f.exists()) {

            Reader reader = new FileReader(f);
            BufferedReader bufferedReader = new BufferedReader(reader);
            String line = bufferedReader.readLine();
            int counter = 0;
            while (null != line && line.isEmpty()) {
                System.out.println("" + ++counter + " ) " + line);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();

            System.out.println("Pabaiga");

        } else {

            if (f.createNewFile()) {
                System.out.println("Sukure: " + f.getPath());
            } else {
                System.out.println("Nesukure, nes jau egzistuoja:");
            }


            FileWriter fw = new FileWriter(f, true);
            fw.write("Viso gero");
            fw.flush();
            fw.close();
        }
    }
}
