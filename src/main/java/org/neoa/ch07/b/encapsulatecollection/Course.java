package org.neoa.ch07.b.encapsulatecollection;

import lombok.Getter;

@Getter
public class Course {
    private String name;
    private boolean isAdvance;

    public Course(String name, boolean isAdvance) {
        this.name = name;
        this.isAdvance = isAdvance;
    }
}
