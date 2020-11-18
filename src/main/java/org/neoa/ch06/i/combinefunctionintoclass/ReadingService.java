package org.neoa.ch06.i.combinefunctionintoclass;

public class ReadingService {

    public double calculateTeaMeter(Reading reading) {
        double baseCharge = calculateBaseCharge(reading);
        return baseCharge;
    }

    public double calculateTeaMeterWithOutTaxes(Reading reading) {
        double base = calculateBaseCharge(reading);
        double taxableCharge = Math.max(0, base - taxThreshold(reading.getYear()));
        return base  - taxableCharge;
    }

    private double calculateBaseCharge(Reading reading) {
        return baseRate(reading.getMonth(), reading.getYear()) * reading.getQuantity();
    }

    private double baseRate(int month, int year) {
        return month / year;
    }

    private double taxThreshold(int year) {
        return (Math.PI / year) * 100;
    }

}
