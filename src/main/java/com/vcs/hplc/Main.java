package com.vcs.hplc;

public class Main {

    public static void main(String[] args) {

        // susikuriam raw tipo objekta testavimui - RS'ui ir TS'ui
        RawData refStdData1 = new RawData();
        RawData refStdData2 = new RawData();
        RawData refStdData3 = new RawData();

        RawData testSampleData1 = new RawData();
        RawData testSampleData2 = new RawData();
        RawData testSampleData3 = new RawData();


        RawData[] refStdDataRT = new RawData[3]; //po viena 3-ju elementu masyva
        RawData[] testSampleDataRT = new RawData[3];

        refStdData1.setRetentionTime(6.995); //priskyrems reiksmes RT / apsimetam kad is failo
        refStdData2.setRetentionTime(6.995);
        refStdData3.setRetentionTime(6.996);

        testSampleData1.setRetentionTime(7.007);
        testSampleData2.setRetentionTime(7.006);
        testSampleData3.setRetentionTime(7.008);


        refStdDataRT[0] = refStdData1; //priskyrems konkreciai pozicijai elementa - failas(lentele)
        refStdDataRT[1] = refStdData2;
        refStdDataRT[2] = refStdData3;

        testSampleDataRT[0] = testSampleData1; //priskyrems konkreciai pozicijai elementa - failas(lentele)
        testSampleDataRT[1] = testSampleData2;
        testSampleDataRT[2] = testSampleData3;

        /////////////////////////////////////////////////Area

        RawData[] refStdDataArea = new RawData[3]; //po viena 3-ju elementu masyva
        RawData [] testSampleDataArea = new RawData[3];

        refStdData1.setArea(28293262); //priskyrems reiksmes RT / apsimetam kad is failo
        refStdData2.setArea(28367928);
        refStdData3.setArea(28277256);

        testSampleData1.setArea(28182131);
        testSampleData2.setArea(28186569);
        testSampleData3.setArea(28122557);


        refStdDataArea[0] = refStdData1; //priskyrems konkreciai pozicijai elementa - failas(lentele)
        refStdDataArea[1] = refStdData2;
        refStdDataArea[2] = refStdData3;

        testSampleDataArea[0] = testSampleData1; //priskyrems konkreciai pozicijai elementa - failas(lentele)
        testSampleDataArea[1] = testSampleData2;
        testSampleDataArea[2] = testSampleData3;


        //Metodo iskvietimas
        Calculator rssverage = new Calculator ();
        rssverage.calculateIdentity(refStdDataRT, testSampleDataRT);








    }
}
