package org.neoa.ch06.c.ev;

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
