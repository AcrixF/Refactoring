package org.neoa.ch06.a_ExtractedMethod;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Order {

    private int amount;
}
