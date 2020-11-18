package org.neoa.ch06.i.combinefunctionintoclass;

public class ReadingService {

    public double calculateTeaMeter(String name, int quantity, int month, int year) {
        double baseCharge = baseRate(month, year) * quantity;
        return baseCharge;
    }

    public double calculateTeaMeterWithOutTaxes(String name, int quantity, int month, int year) {
        double base = baseRate(month, year) * quantity;
        double taxableCharge = Math.max(0, base - taxThreshold(year));
        return base  - taxableCharge;
    }

    private double baseRate(int month, int year) {
        return month / year;
    }

    private double taxThreshold(int year) {
        return (Math.PI / year) * 100;
    }

}
