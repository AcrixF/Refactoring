package org.neoa.ch07.c.replaceprimitivewithobject;

public class Order {
    private Priority priority;

    public Order(String priority) {
        this.setPriority(priority);
    }

    public Priority getPriority() {
        return this.priority;
    }

    public String getPriorityValue() {
        return this.priority.priorityValue();
    }

    public void setPriority(String priority) {
        this.priority = new Priority(priority);
    }
}
