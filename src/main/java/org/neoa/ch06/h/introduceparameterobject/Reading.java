package org.neoa.ch06.h.introduceparameterobject;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
public class Reading {
    private int temperature;
    private String time;
}


