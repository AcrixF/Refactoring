package org.neoa.ch06.c.extractvariable;

public class OrderCalculation {

    public double price(Order order) {
        // price is base price - quantity discount + shipping
        double basePrice = order.getQuantity() * order.getItemPrice();
        return basePrice -
                Math.max(0, order.getQuantity() - 500) * order.getItemPrice() * 0.05 +
                Math.min(basePrice * 0.01, 100);
    }
}
