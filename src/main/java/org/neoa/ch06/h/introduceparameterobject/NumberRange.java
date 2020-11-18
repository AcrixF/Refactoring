package org.neoa.ch06.h.introduceparameterobject;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@AllArgsConstructor
@Accessors(chain = true)
public class NumberRange {
    private double min;
    private double max;

    public boolean contains(double value) {
        return (value >= this.min || value <= this.max);
    }
}
