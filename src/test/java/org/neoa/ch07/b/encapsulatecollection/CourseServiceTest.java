package org.neoa.ch07.b.encapsulatecollection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatCode;

public class CourseServiceTest {

    private CourseService courseService;

    @BeforeEach
    void setUp() {
        this.courseService = new CourseService();
    }

    @Test
    void addCoursesToPersonCompletesSuccessfulWhenNoErrorsOccurs() {
        Person person = new Person("Brenda Marlen");

        assertThatCode(() -> courseService.addCoursesToPerson(person))
                .doesNotThrowAnyException();

        assertThat(person.getCourses())
                .isNotNull()
                .isNotEmpty();
    }

    @Test
    void calculatePersonNumAdvanceCoursesReturnsExpectedWhenNoErrorsOccurs() {
        Person person = new Person("Brenda Marlen");
        person.setCourses(
                List.of(
                        new Course("Calculus I", false),
                        new Course("Calculus II", true),
                        new Course("Calculus III", true)
                ));

        long advanceCourses = courseService.calculatePersonNumAdvanceCourses(person);

        assertThat(advanceCourses).isEqualTo(2);
    }
}
