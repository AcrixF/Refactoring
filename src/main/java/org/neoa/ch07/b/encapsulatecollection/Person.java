package org.neoa.ch07.b.encapsulatecollection;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

    public void addCourse(Course course) {
        this.courses.add(course);
    }

    public void removeCourse(Course course) {
        if (!courses.contains(course))
            throw new RuntimeException("Course not registered");
        this.courses.remove(course);
    }

    public List<Course> getCourses() {
        return courses.stream().collect(Collectors.toList());
    }

}
