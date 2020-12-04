package org.neoa.ch06.k.splitphase;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Product {
    private double basePrice;
    private double discountRate;
    private double discountThreshold;
}
