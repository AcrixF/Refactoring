package org.neoa.ch06.b.inlinefunction;

import java.util.HashMap;
import java.util.Map;

public class CustomerReport {

    public Map<String, String> reportLines(Customer customer) {
        Map<String, String> lines = new HashMap<>();
        gatherCustomerData(lines, customer);
        return lines;
    }

    private void gatherCustomerData(Map<String, String> out, Customer customer) {
        out.computeIfAbsent("name", name -> customer.getName());
        out.computeIfAbsent("location",  location -> customer.getLocation());
    }

}
