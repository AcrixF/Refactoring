package org.neoa.ch07.c.replaceprimitivewithobject;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Waiter {

    private List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public void addOrders(List<Order> orders) {
        orders.forEach(this::addOrder);
    }

    public void remoOrder(Order order) {
        if (!orders.contains(order))
            throw new RuntimeException("Order does not exist");
        this.orders.remove(order);
    }
}
