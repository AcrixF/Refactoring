package org.neoa.ch07.b.encapsulatecollection;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Person {

    private String name;
    private List<Course> courses = new ArrayList<>();

    public Person(String name) {
        this.name = name;
    }

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

}
