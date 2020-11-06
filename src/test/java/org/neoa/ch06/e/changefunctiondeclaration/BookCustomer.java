package org.neoa.ch06.e.changefunctiondeclaration;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.neoa.ch06.e.changefunctiondeclaration.parameter.Book;
import org.neoa.ch06.e.changefunctiondeclaration.parameter.Customer;

import static org.assertj.core.api.Assertions.assertThat;

public class BookCustomer {

    private Book book;

    @BeforeEach
    void setup() {
        book = new Book();
    }

    @Test
    void addReservationFinishedSuccessfulWhenNoErrorsOccurs() {
        Customer customer = new Customer();

        book.addReservation(customer);

        assertThat(book.getReservations()).isNotEmpty();
    }

}