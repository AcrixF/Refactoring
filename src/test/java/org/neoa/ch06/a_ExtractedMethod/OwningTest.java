package org.neoa.ch06.a_ExtractedMethod;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

class OwningTest {

    private Owing owing;

    @BeforeEach
    void setUp() {
        owing = new Owing();
    }

    @Test
    void printOwningFinishedSuccessfulWhenNoErrorsOccur() {
        Invoice invoice = new Invoice()
                .setCustomer("BigOC")
                .setOrders(
                        List.of(
                                new Order().setAmount(1000),
                                new Order().setAmount(3400),
                                new Order().setAmount(1250)));

        String result =  owing.printOwning(invoice);

        Approvals.verify(result);
    }

}
