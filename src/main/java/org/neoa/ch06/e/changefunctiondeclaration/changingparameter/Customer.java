package org.neoa.ch06.e.changefunctiondeclaration.changingparameter;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Customer {

    private Address address;
}
