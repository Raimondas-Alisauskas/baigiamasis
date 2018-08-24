package com.vcs.hplc;

public class FileNameConverter {

//    File file = null;
//    String filename = null;
//
//    public String readFile(String filename) {
//        filename = file.getName();
//        return filename;
//    }
//
//
//
////    public String sortFiles (String filename) {
////        List<String> fileList = new ArrayList<>();
//
//
//        if (filename.contains("RS")) {
////            return fileListRS;
//
//        }
//    }

    String pdf = "PF_023 \n" +
            "\n" +
            "Project Name:    PF023Reported by User:  QC_analyst\n" +
            "\n" +
            "Report Method:  PF_023 Date Printed:\n" +
            "\n" +
            "16801 7/20/2018Report Method ID: 16801\n" +
            "\n" +
            "12:40:48 PM Europe/VilniusPage: 1 of 1\n" +
            "\n" +
            "S A M P L E      I N F O R M A T I O N\n" +
            "\n" +
            " Melatonin Reference Standard_2Sample Name:\n" +
            "Label:                     RS_2  180718 PF023 QCP134 1 year st\n" +
            "\n" +
            "Vial:  4 Acq. Method Set:  PF_023\n" +
            "Processing Method: 1Injection #:  PF_023 Assay\n" +
            "\n" +
            " 5.00 ulInjection Volume: Channel Name:  W2489 ChA\n" +
            "Run Time:  20.0 Minutes Proc. Chnl. Descr.:  W2489 ChA 225nm\n" +
            "\n" +
            " QC_analystAcquired By:System ID No.:         EQ009\n" +
            " 7/18/2018 3:29:12 PM EEST Column Name:         Agilent Eclipse plus        \n" +
            "\n" +
            "Agilent Eclipse Plus C18 5um \n" +
            "\n" +
            "Date Acquired:\n" +
            " 7/19/2018 3:30:35 PM EESTDate Processed: Column Serial No.:   USUXS02399 \n" +
            "\n" +
            "M\n" +
            "e\n" +
            "\n" +
            "la\n" +
            "to\n" +
            "\n" +
            "n\n" +
            "in\n" +
            "\n" +
            " -\n" +
            " 6\n" +
            "\n" +
            ".9\n" +
            "9\n" +
            "\n" +
            "5\n" +
            "\n" +
            "A\n" +
            "U\n" +
            "\n" +
            "0.00\n" +
            "\n" +
            "0.20\n" +
            "\n" +
            "0.40\n" +
            "\n" +
            "0.60\n" +
            "\n" +
            "0.80\n" +
            "\n" +
            "1.00\n" +
            "\n" +
            "1.20\n" +
            "\n" +
            "1.40\n" +
            "\n" +
            "1.60\n" +
            "\n" +
            "1.80\n" +
            "\n" +
            "2.00\n" +
            "\n" +
            "Minutes\n" +
            "\n" +
            "0.00 2.00 4.00 6.00 8.00 10.00 12.00 14.00 16.00 18.00 20.00\n" +
            "\n" +
            "1\n" +
            "\n" +
            "2\n" +
            "\n" +
            "Sum\n" +
            "\n" +
            "Peak Name RT Area % Area Height EP Plate Count Symmetry\n" +
            "\n" +
            "Benzyl alcohol\n" +
            "\n" +
            "Melatonin\n" +
            "\n" +
            "4.000\n" +
            "\n" +
            "6.995 28367928\n" +
            "\n" +
            "28367928.4\n" +
            "\n" +
            "100.00 2001656 5569 1.1\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n" +
            "\n";


    public static void main(String[] args) {
        FileNameConverter aa = new FileNameConverter();
        System.out.println(aa.isRSByContent(aa.pdf));
    }

    public Boolean isRSByContent(String pdfContent) {

        boolean RS = pdfContent.contains("RS_"); //is failo vidaus Label:
        boolean TS = pdfContent.contains("TS_");

        if (RS && !TS) {
            return true;
        }

        if (!RS && TS) {
            return false;
        }
        return null;
    }

    public String[] extractPeakTable(String pdf) {
        StringBuffer buffer = new StringBuffer();
        //buffer.extractPeakTable(S);

        String controlText = "Melatonin/n";
        //String extractedString = null;

        int i = pdf.indexOf(controlText);
        if (i < 0) {
            System.out.println(pdf);
            throw new RuntimeException("Nepavyko istraukti duomenu");
        }
        pdf = pdf.substring(i);
        // jau nukirptas virsus
        pdf = pdf.replace("/n", " ");
        String[] skaiciukaiStr = pdf.split(" ");
        return skaiciukaiStr;
    }

    public double[] convertStrtoNo(String[] skaiciukaiStr) {

        String[] skaiciukuIlgis = new String[skaiciukaiStr.length];
        double[] convertedSkaiciukai = new double[skaiciukuIlgis.length];

        for (int i = 0; i < convertedSkaiciukai.length; i++) {

            convertedSkaiciukai[i] = Double.parseDouble(skaiciukuIlgis[i]);
        }
        return convertedSkaiciukai;
    }


    public float[] getRTvalues() {
        // RT reiksmes gali buti nuo 0 iki 90, 3 sk po kablelio
        //Area reiksmes gali buti double, svekas sk.




        return null;
    }


}





