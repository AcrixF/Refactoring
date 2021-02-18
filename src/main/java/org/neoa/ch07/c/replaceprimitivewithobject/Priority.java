package org.neoa.ch07.c.replaceprimitivewithobject;

import java.util.Map;

public class Priority {
    private final Map<String, Integer> legalValues = Map.of(
            "low", 1 ,
            "normal", 2,
            "high", 3,
            "rush", 4);

    private String value;

    public Priority(String value) {
       setValue(value);
    }

    public Priority(Priority priority) {
        setValue(priority.priorityValue());
    }

    public void setValue(String value) {
        if (legalValues.containsKey(value))
            this.value = value;
        else
            throw new IllegalPriorityException("Illegal Priority Type");
    }

    public String priorityValue() {
        return value;
    }

    public int getIndex() {
        return legalValues.get(this.value);
    }

    public boolean equals(Priority other) {
        return this.getIndex() == other.getIndex();
    }

    public boolean higherThan(Priority other) {
        return this.getIndex() > other.getIndex();
    }

    public boolean lowerThan(Priority other) {
        return this.getIndex() < other.getIndex();
    }
}
