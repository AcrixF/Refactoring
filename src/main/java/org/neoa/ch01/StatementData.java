package org.neoa.ch01;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.util.List;

@Getter
@Setter
@Accessors(chain = true)
public class StatementData {
    private String customer;
    private List<? extends Performance> performances;
}
