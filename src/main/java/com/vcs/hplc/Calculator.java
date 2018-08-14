package com.vcs.hplc;

public class Calculator {

    public CalcResults calculate(RawData[] rsData, RawData[] tsData) {

        CalcResults r = new CalcResults();
        r.setIdentity(calculateIdentity(rsData, tsData));
        r.setAssay(calculateAssay(rsData, tsData));
        return r;
    }

    public double calculateIdentity(RawData[] refStdData, RawData[] testSampleData) {
// apsiskaiciuoti refStd reiksmiu average ir testSmple reiksmiu average
        // identity = (RT ref std. reiksmiu average / RT sample reiksmiu avg) *100

        for (int i = 0; i < refStdData.length; i++) { //ciklas reikalingas ejimui per array elementus

            System.out.println("RS nr: " + i);
            System.out.println("RT reiksme: " + refStdData[i].getRetentionTime());
        }
        for (int i = 0; i < testSampleData.length; i++) { //ciklas reikalingas ejimui per array elementus

            System.out.println("TS nr: " + i);
            System.out.println("Reiksme: " + testSampleData[i].getRetentionTime()); //supaprastintas variantas
        }

        //apskaiciuoti Ref STD ir TS Retention Time (RT) masyvo elementu average reiksmes:
        // Standarto masyvas: RawData[] refStdDataRT = new RawData[3]
        //Test Sample masyvas: RawData[] testSampleDataRT = new RawData[3]
        //Apskaiciuoti RefSTD ir TS standard deviation
        //Apskaiciuoti Identity pagal formule (AverageRTStd/AverageRTTs)*100

        //        float resolution = rsData[0].getResolution(); //pasiimam duomenis: kokiu formatu? Masyvo?
//        float r
        return 0;

    }

    public double averageRT(RawData[] refStdDataRT){
        double sum = 0;

        for (int i = 0; i < refStdDataRT.length; i++){
            sum = sum + refStdDataRT[i].getRetentionTime();
        }
        double averageRTStd = sum / refStdDataRT.length;

        System.out.println("Average Of RS RT" + averageRTStd);
        return averageRTStd;
    }

//    public double averageRT(RawData[] testSampleDataRT){
//        double sum = 0;
//
//        for (int i = 0; i < testSampleDataRT.length; i++){
//            sum = sum + testSampleDataRT[i].getResolution();
//        }
//        double testSampleDataRT = sum / testSampleDataRT.length;
//
//        System.out.println("Average Of RS RT" + testSampleDataRT);
//        return testSampleDataRT;
//    }


    //double avg1 = averageRT(refStdData); //isikelti i main metoda, kad iskviestu
    //double avg2 = averageRT(testSampleData);
    //double ratio = avg2/avg1*100;
        //System.out.println(ratio);

///////////////////////////////////////ASSAY////////////////////////////////////////////////////////////////////{


        public double calculateAssay(RawData[]refStdData, RawData[]testSampleData){

            for (int i = 0; i < refStdData.length; i++) { //ciklas reikalingas ejimui per array elementus
                System.out.println("RS nr: " + i);
                System.out.println("Area reiksme: " + refStdData[i].getArea());

            }
            for (int i = 0; i < testSampleData.length; i++) { //ciklas reikalingas ejimui per array elementus
                System.out.println("TS nr: " + i);
                System.out.println("Area: " + testSampleData[i].getArea()); //supaprastintas variantas
            }

            //        float resolution = rsData[0].getResolution(); //pasiimam duomenis: kokiu formatu? Masyvo?
//        float r
            return 0;
        }
}




