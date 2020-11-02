package org.neoa.ch06.b.inlinefunction;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Customer {
    private String name;
    private String location;
}
