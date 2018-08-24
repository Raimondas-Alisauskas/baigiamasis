package com.vcs.hplc;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class AverageCalculator<decimalFormat> {

    private double potency;

    public AverageCalculator(double potency) {
    }

//    public CalcResults calculate(RawData[] rsData, RawData[] tsData) {
//
//        CalcResults r = new CalcResults();
//        r.setIdentity(calculateIdentity(rsData, tsData));
//        r.setAssay(calculateAssay(rsData, tsData, potency));
//        return r;
//    }

    private double calculateIdentity(RawData[] refStdData, RawData[] testSampleData) {
        double resultIdentity = 0;
        AvgData avgSt = calculateAverage(refStdData);
        AvgData avgTs = calculateAverage(testSampleData);
        resultIdentity = (avgTs.getRetentionTime() / avgSt.getRetentionTime()) * 100;
        return resultIdentity;
    }

    private double calculateAssay(RawData[] refStdData, RawData[] testSampleData, double potency) {
        AvgData avgSt = calculateAverage(refStdData);
        AvgData avgTs = calculateAverage(testSampleData);
        return (avgTs.getArea() / avgSt.getArea()) * potency;
    }

    public AvgData calculateAverage(RawData[] data) {
        double sumRT = 0;
        double sumArea = 0;
//        retentionTime;
//        private double area;

        for (int i = 0; i < data.length; i++) {
            sumRT = sumRT + data[i].getRetentionTime();
            sumArea = sumArea + data[i].getArea();
        }

        AvgData averages = new AvgData();
        averages.setRetentionTime(sumRT / data.length);
        averages.setArea(sumArea / data.length);

        return averages;
    }

}







