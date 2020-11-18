package org.neoa.ch06.i.combinefunctionintoclass;

public class ReadingService {

    public double calculateTeaMeter(Reading reading) {
        double baseCharge = reading.baseCharge();
        return baseCharge;
    }

    public double calculateTeaMeterWithOutTaxes(Reading reading) {
        double taxableCharge = reading.taxableChargeFn();
        return reading.baseCharge() - taxableCharge;
    }

}
