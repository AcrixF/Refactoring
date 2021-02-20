package org.neoa.ch07.d.replacetempwithquery;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarShopServiceTest {

    private CarShopService carShopService;

    @BeforeEach
    void setup() {
        this.carShopService = new CarShopService();
    }

    @Test
    void calculateTotalReturnsZeroWhenNoOrders() {
        CarShop carShop = new CarShop();
        double total = carShopService.calculateTotal(carShop);
        assertThat(total).isZero();
    }

    @Test
    void calculateTotalReturnsExpectedWhenExistingOrders() {
        CarShop carShop = new CarShop();
        List<Order> orders = List.of(
                new Order(3, new Item("CPU ", 1500.75)),
                new Order(5, new Item("GPU", 2500.3))
        );

        carShop.setOrders(orders);

        double total = carShopService.calculateTotal(carShop);
        assertThat(total).isNotZero();
    }
}
