package org.neoa.ch06.b.inlinefunction.simplecase;

public class DriverRating {

    public int rating(Driver driver) {
        return driver.getNumberOfLateDeliveries() > 5 ? 2 : 1;
    }

}
