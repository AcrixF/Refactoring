package org.neoa.ch01;

import org.approvaltests.Approvals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

class BillTest {

    private Bill bill;

    @BeforeEach
    void setup() {
        bill = new Bill();
    }

    @Test
    void statementReturnExpectedWhenNoErrorsOccurs() {

        Map<String, Play> plays = Map.of(
                "hamlet", new Play().setName("Hamlet").setType(PlayType.TRAGEDY),
                "as-like", new Play().setName("As You Like It").setType(PlayType.COMEDY),
                "othello", new Play().setName("Othello").setType(PlayType.TRAGEDY));

        Invoice invoice = new Invoice()
                .setCustomer("BigCo")
                .setPerformances(
                        List.of(
                                new Performance().setPlayID("hamlet").setAudience(55),
                                new Performance().setPlayID("as-like").setAudience(35),
                                new Performance().setPlayID("othello").setAudience(40)));

        String result = bill.statement(invoice, plays);

        Approvals.verify(result);

    }

}
