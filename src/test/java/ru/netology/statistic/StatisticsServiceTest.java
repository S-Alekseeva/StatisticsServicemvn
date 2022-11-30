package ru.netology.statistic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class StatisticsServiceTest {

    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMax2() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {9, 5, 8, 4, 5, 3, 8, 6, 11, 12, 11};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

    @Test
    void findMaxInTheEnd() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {9, 5, 8, 4, 5, 3, 8, 6, 11, 11, 100};
        long expected = 100;

        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
}
