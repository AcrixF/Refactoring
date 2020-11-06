package org.neoa.ch06.a.extractfunction;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class OwningTest {

    private Owing owing;

    @BeforeEach
    void setUp() {
        owing = new Owing();
    }

    @Test
    void printOwningFinishedSuccessWhenOrdersIsEmpty() {

        Invoice invoice = new Invoice()
                .setCustomer("BigOC");

        String result = owing.printOwing(invoice);

        assertThat(result).isNotNull();
        assertThat(invoice.getDueDate()).isNotNull();
        assertThat(invoice.getDueDate()).isEqualTo(LocalDate.now().plusDays(30));
    }

    @Test
    void printOwningFinishedSuccessfulWhenNoErrorsOccur() {
        LocalDate localDate = LocalDate.parse("2020-12-04");

        Invoice invoice = new Invoice()
                .setCustomer("BigOC")
                .setDueDate(localDate)
                .setOrders(
                        List.of(
                                new Order().setAmount(1000),
                                new Order().setAmount(3400),
                                new Order().setAmount(1250)));

        String result = owing.printOwing(invoice);

        Approvals.verify(result);
    }

}