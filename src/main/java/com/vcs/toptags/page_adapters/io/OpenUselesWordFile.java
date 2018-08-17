package com.vcs.toptags.page_adapters.io;

import java.io.*;
import java.util.ArrayList;

public class OpenUselesWordFile {

    public ArrayList<String> getUselesWordsList(){

        return loadList();
    }

    // --------- Duomenu ATKURIMAS ---------

    public ArrayList<String> loadList(){

        final String FILE_NAME = "useleswords.txt";
//        System.out.println(FILE_NAME);
        try{
            File file = new File(FILE_NAME);

            // Patikrinimas ar failas egzistuoja
            if(file.exists()){
//               System.out.println("File Egzists!!!");
                //	Jeigu failas egzistuoja - tai nieko nedarome

            } else {
                // jei failas neegzituoja, tai yra sukuriamas, kad nekiltu klaidos
                file.createNewFile();
//                System.out.println("File Created!!!");
            }
        } catch(IOException ioe){
            System.out.println(ioe.getMessage());
        }

     // Atkuriame duomenys is failo
        ArrayList loadArray = new ArrayList<String>();

        try{
            FileInputStream is = new FileInputStream(FILE_NAME);
            BufferedReader reader = new BufferedReader(new InputStreamReader(is, "Unicode"));

            // Perkeliam visus irasus i ArrayList
            String readline;
            while((readline = reader.readLine()) != null){
                loadArray.add(readline);
            }

        } catch (FileNotFoundException fnfe){
            System.out.println(fnfe.getMessage());
        } catch (IOException ioe){
            System.out.println(ioe.getMessage());
        }

        return loadArray;