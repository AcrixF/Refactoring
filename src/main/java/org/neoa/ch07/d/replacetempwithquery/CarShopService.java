package org.neoa.ch07.d.replacetempwithquery;

public class CarShopService {

    public double calculateTotal(CarShop carShop) {
        return carShop.getOrders().stream()
                .mapToDouble(Order::calculatePrice)
                .sum();
    }

}
