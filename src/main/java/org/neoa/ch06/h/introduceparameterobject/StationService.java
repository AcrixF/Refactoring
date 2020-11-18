package org.neoa.ch06.h.introduceparameterobject;

import java.util.List;
import java.util.stream.Collectors;

public class StationService {

    public List<Reading> readingsOutsideRange(Station station, NumberRange range) {
        return station.getReadings().stream()
                .filter(reading -> range.contains(reading.getTemperature()))
                .collect(Collectors.toUnmodifiableList());
    }
}