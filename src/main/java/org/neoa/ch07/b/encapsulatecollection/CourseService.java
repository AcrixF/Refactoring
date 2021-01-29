package org.neoa.ch07.b.encapsulatecollection;

import java.util.List;

public class CourseService {

    private final static List<String> courses = List.of(
            "Calculus I",
            "Calculus II",
            "Calculus III",
            "Geometry",
            "Trigonometry",
            "Differential Equations");

    public long calculatePersonNumAdvanceCourses(Person person) {
        return person.getCourses()
                .stream()
                .filter(Course::isAdvance)
                .count();
    }

    public void addCoursesToPerson(Person person) {
        for (String course: courses) {
            person.addCourse(new Course(course, false));
        }
    }

}
