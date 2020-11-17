package org.neoa.ch06.h.introduceparameterobject;

import java.util.List;
import java.util.stream.Collectors;

public class StationService {
    
    public List<Reading> readingsOutsideRange(Station station, double min, double max, NumberRange range) {
        return readingsOutsideRange_(station, max, range);
    }

    public List<Reading> readingsOutsideRange_(Station station, double max, NumberRange range) {
        return station.getReadings().stream()
                .filter(reading -> reading.getTemperature() < range.getMin() || reading.getTemperature() > max)
                .collect(Collectors.toUnmodifiableList());
    }
}
