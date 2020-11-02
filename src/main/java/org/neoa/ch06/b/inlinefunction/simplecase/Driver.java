package org.neoa.ch06.b.inlinefunction.simplecase;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Driver {
    private int numberOfLateDeliveries;
}
