package org.neoa.ch06.k.splitphase;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class ShippingMethod {
    private double discountThreshold;
    private double discountedFee;
    private double feePerCase;
}