package org.neoa.ch06.b.inlinefunction.simplecase;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class DriverRatingTest {

    private DriverRating driverRating = null;

    @BeforeEach
    void setup() {
        driverRating = new DriverRating();
    }

    @Test
    void ratingReturnsExpectedWhenDriverHasLessThanFiveLateDeliveries() {
        Driver driver = new Driver()
                .setNumberOfLateDeliveries(3);

        int result = driverRating.rating(driver);

        assertThat(result).isEqualTo(1);
    }

    @Test
    void ratingReturnsExpectedWhenDriverHasMoreThanFiveLateDeliveries() {
        Driver driver = new Driver()
                .setNumberOfLateDeliveries(6);

        int result = driverRating.rating(driver);

        assertThat(result).isEqualTo(2);
    }



}
