package org.neoa.ch06.i.combinefunctionintoclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@AllArgsConstructor
@Accessors(chain = true)
public class Reading {
    private String name;
    private int quantity;
    private int month;
    private int year;
}
