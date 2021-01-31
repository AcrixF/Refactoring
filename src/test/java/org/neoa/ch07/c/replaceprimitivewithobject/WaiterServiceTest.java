package org.neoa.ch07.c.replaceprimitivewithobject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class WaiterServiceTest {

    private final static String HIGH = "high";
    private final static String RUSH = "rush";
    private final static String LOW = "low";

    private WaiterService waiterService;

    @BeforeEach
    void setup() {
        waiterService = new WaiterService();
    }

    @Test
    void summaryOrderPriorityReturnsExpectedPriorityNumber() {
        List<Order> orders = List.of(
                new Order(HIGH),
                new Order(HIGH),
                new Order(RUSH),
                new Order(LOW)
        );

        Waiter waiter = new Waiter();
        waiter.addOrders(orders);

        long result = waiterService.summaryOrderPriority(waiter);

        assertThat(result).isEqualTo(3);
    }
}
