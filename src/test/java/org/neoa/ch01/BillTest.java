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

        Performance performanceOne =  new Performance();
        performanceOne.setPlayID("hamlet");
        performanceOne.setAudience(55);

        Performance performanceTwo = new Performance();
        performanceTwo.setPlayID("as-like");
        performanceTwo.setAudience(35);

        Performance performanceThree = new Performance();
        performanceThree.setPlayID("othello");
        performanceThree.setAudience(40);


        Invoice invoice = new Invoice()
                .setCustomer("BigCo")
                .setPerformances(
                        List.of(performanceOne, performanceTwo, performanceThree));

        String result = bill.statement(invoice, plays);

        Approvals.verify(result);

    }

}
