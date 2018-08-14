package com.vcs.hplc;

public class RawData {


    private String peakName;
    private double retentionTime;
    private double area;

    public String getPeakName() {
        return peakName;
    }

    public void setPeakName(String peakName) {
        this.peakName = peakName;
    }

    public double getRetentionTime() {
        return retentionTime;
    }

    public void setRetentionTime(double retentionTime) {
        this.retentionTime = retentionTime;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
