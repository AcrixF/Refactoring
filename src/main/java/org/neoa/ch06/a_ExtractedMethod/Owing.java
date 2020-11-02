package org.neoa.ch06.a_ExtractedMethod;

import java.time.LocalDate;

public class Owing {

    public String printOwning(Invoice invoice) {
        String result = "";
        int outstanding = 0;

        result += "*************************\n";
        result += "***** Customer Owes *****\n";
        result += "*************************\n";

        for (Order order: invoice.getOrders()) {
            outstanding += order.getAmount();
        }

        LocalDate today = Clock.today();
        invoice.setDueDate(today.plusDays(30));

        result += "name: " + invoice.getCustomer() + "\n";
        result += "amount: " + outstanding + "\n";
        result += "due: " + invoice.getDueDate().toString() + "\n";

        return result;
    }

}
