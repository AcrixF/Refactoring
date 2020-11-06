package org.neoa.ch06.e.changefunctiondeclaration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CircleTest {

    private Circle circle;

    @BeforeEach
    void setup() {
        circle = new Circle();
    }

    @Test
    void circumferenceReturnsExpectedWhenNoErrorsOccurs() {

        double circumference = circle.circum(3);

        assertThat(circumference).isEqualTo(18.84955592153876);

    }
}
