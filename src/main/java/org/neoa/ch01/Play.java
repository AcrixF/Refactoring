package org.neoa.ch01;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Play {

    private String name;
    private PlayType type;

}
