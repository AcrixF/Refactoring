package org.neoa.ch06.a.extractedmethod;

import java.time.LocalDate;

public class Clock {

    private Clock() {}

    public static LocalDate today() {
        return LocalDate.now();
    }
}
