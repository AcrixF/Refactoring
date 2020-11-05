package org.neoa.ch06.a.en;

import java.time.LocalDate;

public class Owing {

    public String printOwing(Invoice invoice) {
        String result = "";

        result = addBanner(result);

        int outstanding = calculateOutstanding(invoice);

        recordDueDate(invoice);

        result = addDetails(invoice, result, outstanding);

        return result;
    }

    private int calculateOutstanding(Invoice invoice) {
        int result = 0;
        for (Order order: invoice.getOrders()) {
            result += order.getAmount();
        }
        return result;
    }

    private void recordDueDate(Invoice invoice) {
        LocalDate today = Clock.today();
        invoice.setDueDate(today.plusDays(30));
    }

    private String addDetails(Invoice invoice, String result, int outstanding) {
        result += "name: " + invoice.getCustomer() + "\n";
        result += "amount: " + outstanding + "\n";
        result += "due: " + invoice.getDueDate().toString() + "\n";
        return result;
    }

    private String addBanner(String result) {
        result += "*************************\n";
        result += "***** Customer Owes *****\n";
        result += "*************************\n";
        return result;
    }

}
