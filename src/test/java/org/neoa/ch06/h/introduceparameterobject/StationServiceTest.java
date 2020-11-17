package org.neoa.ch06.h.introduceparameterobject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class StationServiceTest {

    private StationService stationService;

    @BeforeEach
    void setup() {
        stationService = new StationService();
    }

    @Test
    void readingsOutsideRangeReturnsEmptyListWhenNoTemperaturesOutsideRange() {
        double min = 40;
        double max = 60;

        Station station = new Station()
                .setName("ZB1")
                .setReadings(List.of(
                        new Reading().setTemperature(47).setTime("2016-11-10 09:10"),
                        new Reading().setTemperature(53).setTime("2016-11-10 09:20"),
                        new Reading().setTemperature(58).setTime("2016-11-10 09:30"),
                        new Reading().setTemperature(53).setTime("2016-11-10 09:40"),
                        new Reading().setTemperature(51).setTime("2016-11-10 09:50")
                ));

        List<Reading> readings = stationService.readingsOutsideRange(station, min, max);

        assertThat(readings).isEmpty();
    }

    @Test
    void readingsOutsideRangeReturnsListWhenThereIsTemperaturesOutsideRange() {
        double min = 50;
        double max = 55;

        Station station = new Station()
                .setName("ZB1")
                .setReadings(List.of(
                        new Reading().setTemperature(47).setTime("2016-11-10 09:10"),
                        new Reading().setTemperature(53).setTime("2016-11-10 09:20"),
                        new Reading().setTemperature(58).setTime("2016-11-10 09:30"),
                        new Reading().setTemperature(53).setTime("2016-11-10 09:40"),
                        new Reading().setTemperature(51).setTime("2016-11-10 09:50")
                ));

        List<Reading> readings = stationService.readingsOutsideRange(station, min, max);

        assertThat(readings).isNotEmpty();
        assertThat(readings).hasSize(2);
    }

}
