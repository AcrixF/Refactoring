package org.neoa.ch06.b.inlinefunction;

public class DriverRating {

    public int rating(Driver driver) {
        return driver.getNumberOfLateDeliveries() > 5 ? 2 : 1;
    }

}
