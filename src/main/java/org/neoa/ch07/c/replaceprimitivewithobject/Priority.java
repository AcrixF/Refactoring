package org.neoa.ch07.c.replaceprimitivewithobject;

public class Priority {
    private String value;

    public Priority(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}
