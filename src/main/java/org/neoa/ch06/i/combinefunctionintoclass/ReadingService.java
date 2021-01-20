package org.neoa.ch06.i.combinefunctionintoclass;

public class ReadingService {

    public double calculateTeaMeter(Reading reading) {
        return reading.baseCharge();
    }

    public double calculateTeaMeterWithOutTaxes(Reading reading) {
        double taxableCharge = reading.taxableChargeFn();
        return reading.baseCharge() - taxableCharge;
    }

}
