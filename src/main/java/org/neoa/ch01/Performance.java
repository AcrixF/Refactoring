package org.neoa.ch01;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@EqualsAndHashCode(of = { "playID" })
public class Performance {
    private String playID;
    private int audience;
}
