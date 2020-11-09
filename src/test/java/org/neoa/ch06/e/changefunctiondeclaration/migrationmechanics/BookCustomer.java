package org.neoa.ch06.e.changefunctiondeclaration.migrationmechanics;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class BookCustomer {

    private Book book;

    @BeforeEach
    void setup() {
        book = new Book();
    }

    @Test
    void addReservationFinishedSuccessfulWhenNoErrorsOccurs() {

        book.addReservation(new Customer(), false);

        assertThat(book.getReservations()).isNotEmpty();
    }

    @Test
    void addReservationFinishedSuccessfulWhenNoCustomerExist() {

        book.addReservation(null, true);

        assertThat(book.getReservations()).isEmpty();
    }

}
