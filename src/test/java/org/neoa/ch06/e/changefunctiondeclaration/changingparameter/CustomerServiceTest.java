package org.neoa.ch06.e.changefunctiondeclaration.changingparameter;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CustomerServiceTest {

    private CustomerService customerService;

    @BeforeEach
    void setup() {
        this.customerService = new CustomerService();
    }

    @Test
    void inNewEnglandReturnsTrueWhenCustomerStateIsRegistered() {
        Customer customer = new Customer()
                .setAddress(new Address().setState("MA"));

        boolean newEnglanders = customerService.xxNEWinNewEngland(customer.getAddress().getState());

        assertThat(newEnglanders).isTrue();
    }

    @Test
    void inNewEnglandReturnsFalseWhenCustomerStateIsNotRegistered() {
        Customer customer = new Customer()
                .setAddress(new Address().setState("MO"));

        boolean newEnglanders = customerService.inNewEngland(customer);

        assertThat(newEnglanders).isFalse();
    }

}
