package org.neoa.ch07.c.replaceprimitivewithobject;

public class WaiterService {

    public long summaryOrderPriority(Waiter waiter) {
        return waiter.getOrders()
                .stream()
                .filter(order -> order.getPriorityValue().equals("high") || order.getPriorityValue().equals("rush"))
                .count();
    }

}
