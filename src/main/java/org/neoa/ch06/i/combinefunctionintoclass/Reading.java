package org.neoa.ch06.i.combinefunctionintoclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@AllArgsConstructor
@Accessors(chain = true)
public class Reading {
    private String name;
    private int quantity;
    private int month;
    private int year;

    public double baseCharge() {
        return baseRate(getMonth(), getYear()) * getQuantity();
    }

    public double taxableChargeFn() {
        return Math.max(0, baseCharge() - taxThreshold(getYear()));
    }

    public double baseRate(int month, int year) {
        return month / year;
    }

    public double taxThreshold(int year) {
        return (Math.PI / year) * 100;
    }
}
