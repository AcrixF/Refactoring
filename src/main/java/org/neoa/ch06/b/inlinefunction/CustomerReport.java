package org.neoa.ch06.b.inlinefunction;

import java.util.HashMap;
import java.util.Map;

public class CustomerReport {

    public Map<String, String> reportLines(Customer customer) {
        Map<String, String> lines = new HashMap<>();
        lines.computeIfAbsent("name", name -> customer.getName());
        lines.computeIfAbsent("location",  location -> customer.getLocation());
        gatherCustomerData(lines, customer);
        return lines;
    }

    private void gatherCustomerData(Map<String, String> out, Customer customer) {
    }

}
