package org.neoa.ch07.c.replaceprimitivewithobject;

public class Order {
    private Priority priority;

    public Order(String priority) {
        this.setPriority(priority);
    }

    public String getPriorityValue() {
        return this.priority.toString();
    }

    public void setPriority(String priority) {
        this.priority = new Priority(priority);
    }
}
