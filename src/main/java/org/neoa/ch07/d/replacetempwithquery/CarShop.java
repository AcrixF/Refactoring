package org.neoa.ch07.d.replacetempwithquery;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class CarShop {

    private List<Order> orders = new ArrayList<>();
}
