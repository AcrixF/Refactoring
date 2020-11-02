package org.neoa.ch06.b.inlinefunction;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

class CustomerReportTest {

    private CustomerReport customerReport;

    @BeforeEach
    void setup() {
       customerReport = new CustomerReport();
    }

    @Test
    void reportLinesCompletesSuccessfulWhenNoCustomerDataExists() {
        Customer customer = new Customer();

        Map<String, String> result = customerReport.reportLines(customer);

        assertThat(result).isEmpty();
    }

    @Test
    void reportLinesCompletesSuccessfulWhenCustomerDataExists() {
        Customer customer = new Customer()
                .setName("Adrea")
                .setLocation("Mexico City");

        Map<String, String> result = customerReport.reportLines(customer);

        assertThat(result).isNotEmpty();
        assertThat(result.get("name")).isEqualTo(customer.getName());
        assertThat(result.get("location")).isEqualTo(customer.getLocation());
    }
}
