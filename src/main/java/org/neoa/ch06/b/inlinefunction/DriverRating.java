package org.neoa.ch06.b.inlinefunction;

public class DriverRating {

    public int rating(Driver driver) {
        return moreThanFiveLateDeliveries(driver) ? 2 : 1;
    }

    private boolean moreThanFiveLateDeliveries(Driver dvr) {
        return dvr.getNumberOfLateDeliveries() > 5;
    }

}
