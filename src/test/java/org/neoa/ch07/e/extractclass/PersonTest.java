package org.neoa.ch07.e.extractclass;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class PersonTest {

    @Test
    void personDataIsComplete() {
        Person person = new Person();
        person.setName("Brenda Marlen");
        person.setTelephoneNumber("7224483526");
        person.setOfficeAreaCode("+52");
        person.setOfficeNumber("5612621293");


        assertThat(person.getName()).isNotEmpty();
        assertThat(person.getTelephoneNumber()).isNotEmpty();
        assertThat(person.getOfficeAreaCode()).isNotEmpty();
        assertThat(person.getOfficeNumber()).isNotEmpty();
    }

}
