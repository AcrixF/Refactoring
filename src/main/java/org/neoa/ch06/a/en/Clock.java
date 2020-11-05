package org.neoa.ch06.a.en;

import java.time.LocalDate;

public class Clock {

    private Clock() {}

    public static LocalDate today() {
        return LocalDate.now();
    }
}
