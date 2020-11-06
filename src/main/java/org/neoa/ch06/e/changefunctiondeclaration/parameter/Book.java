package org.neoa.ch06.e.changefunctiondeclaration.parameter;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
public class Book {

    private List<Customer> reservations = new ArrayList<>();

    public void addReservation(Customer customer) {
        zz_addReservation(customer, false);
    }

    private void zz_addReservation(Customer customer, boolean isPriority) {
        if (!Objects.isNull(customer))
            this.reservations.add(customer);
    }

}
