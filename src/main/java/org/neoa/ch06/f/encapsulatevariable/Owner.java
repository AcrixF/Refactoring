package org.neoa.ch06.f.encapsulatevariable;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Owner {
    private String firstName;
    private String lastName;
}
