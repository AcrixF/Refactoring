package org.neoa.ch07.d.replacetempwithquery;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Item {
    private String name;
    private Double price;

    public Item(String name, Double price) {
        this.name = name;
        this.price = price;
    }
}
