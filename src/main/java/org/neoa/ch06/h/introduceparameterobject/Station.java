package org.neoa.ch06.h.introduceparameterobject;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class Station {
    private String name;
    private List<Reading> readings = new ArrayList<>();
}
