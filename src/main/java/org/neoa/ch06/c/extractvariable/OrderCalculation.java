package org.neoa.ch06.c.extractvariable;

public class OrderCalculation {

    public double price(Order order) {
        double basePrice = order.getQuantity() * order.getItemPrice();
        double quantityDiscount = Math.max(0, order.getQuantity() - 500) * order.getItemPrice() * 0.05;
        double shipping = Math.min(basePrice * 0.01, 100);
        return basePrice - quantityDiscount + shipping;
    }
}
