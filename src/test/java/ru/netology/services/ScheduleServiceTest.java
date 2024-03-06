package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class ScheduleServiceTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/schedule.csv")
    public void testScheduleService(int income, int expenses, int threshold, int expected) {
        ScheduleService service = new ScheduleService();
        int actual = service.calculate(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}
