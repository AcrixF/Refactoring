package org.neoa.ch06.h.introduceparameterobject;

import java.util.List;
import java.util.stream.Collectors;

public class StationService {

    public List<Reading> readingsOutsideRange(Station station, double min, double max) {
        return readingsOutsideRange_(station, min, max, null);
    }

    public List<Reading> readingsOutsideRange_(Station station, double min, double max, NumberRange range) {
        return station.getReadings().stream()
                .filter(reading -> reading.getTemperature() < min || reading.getTemperature() > max)
                .collect(Collectors.toUnmodifiableList());
    }
}
