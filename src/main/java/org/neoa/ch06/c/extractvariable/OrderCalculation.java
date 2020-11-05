package org.neoa.ch06.c.extractvariable;

public class OrderCalculation {

    public double price(Order order) {
        return basePrice(order) - quantityDiscount(order) + shipping(order);
    }

    private double shipping(Order order) {
        return Math.min(basePrice(order) * 0.01, 100);
    }

    private double quantityDiscount(Order order) {
        return Math.max(0, order.getQuantity() - 500) * order.getItemPrice() * 0.05;
    }

    private double basePrice(Order order) {
        return order.getQuantity() * order.getItemPrice();
    }
}
