package org.neoa.ch06.c.extractvariable;

public class OrderCalculation {

    public double price(Order order) {
        // price is base price - quantity discount + shipping
        double basePrice = order.getQuantity() * order.getItemPrice();
        double quantityDiscount = Math.max(0, order.getQuantity() - 500) * order.getItemPrice() * 0.05;
        return basePrice -
                quantityDiscount +
                Math.min(basePrice * 0.01, 100);
    }
}
