package org.neoa.ch06.e.changefunctiondeclaration.parameter;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
public class Book {

    private List<Customer> reservations = new ArrayList<>();

    public void zz_addReservation(Customer customer, boolean isPriority) {
        if (!isPriority && isPriority) throw new AssertionError();

        if (!Objects.isNull(customer))
            this.reservations.add(customer);
    }

}
