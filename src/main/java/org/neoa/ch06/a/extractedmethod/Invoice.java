package org.neoa.ch06.a.extractedmethod;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class Invoice {

    private List<Order> orders = new ArrayList<>();
    private LocalDate dueDate;
    private String customer;
}
