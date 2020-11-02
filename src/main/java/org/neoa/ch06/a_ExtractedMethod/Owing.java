package org.neoa.ch06.a_ExtractedMethod;

import java.time.LocalDate;

public class Owing {

    public String printOwning(Invoice invoice) {
        String result = "";
        int outstanding = 0;

        result = addBanner(result);

        for (Order order: invoice.getOrders()) {
            outstanding += order.getAmount();
        }

        LocalDate today = Clock.today();
        invoice.setDueDate(today.plusDays(30));

        result = addDetails(invoice, result, outstanding);

        return result;
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
