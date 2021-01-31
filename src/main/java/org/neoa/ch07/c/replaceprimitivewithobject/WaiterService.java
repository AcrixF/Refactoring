package org.neoa.ch07.c.replaceprimitivewithobject;

public class WaiterService {

    public long summaryOrderPriority(Waiter waiter) {
        return waiter.getOrders()
                .stream()
                .filter(order -> order.getPriority().equals("high") || order.getPriority().equals("rush"))
                .count();
    }

}
