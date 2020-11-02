package org.neoa.ch06.c.extractvariable;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Order {

    private int quantity;
    private double itemPrice;
}
