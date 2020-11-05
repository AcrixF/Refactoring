package org.neoa.ch06.c.extractvariable;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class OrderCalculationTest {

    private OrderCalculation orderCalculation;

    @BeforeEach
    void setup() {
        orderCalculation = new OrderCalculation();
    }

    @Test
    void priceReturnExpectedWhenOrderHasAllData() {
        Order order = new Order()
                .setItemPrice(50.50)
                .setQuantity(3);

        double result = orderCalculation.price(order);

        assertThat(result).isEqualTo(153.015);
    }

}
