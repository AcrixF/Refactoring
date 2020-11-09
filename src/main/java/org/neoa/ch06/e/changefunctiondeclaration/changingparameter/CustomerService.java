package org.neoa.ch06.e.changefunctiondeclaration.changingparameter;

import java.util.List;

public class CustomerService {

    private List<String> states = List.of("MA","CT", "ME", "VT", "NH", "RI");

    public boolean inNewEngland(Customer customer) {
        return xxNEWinNewEngland(customer.getAddress().getState());
    }

    private boolean xxNEWinNewEngland(String stateCode) {
        return states.contains(stateCode);
    }
}
