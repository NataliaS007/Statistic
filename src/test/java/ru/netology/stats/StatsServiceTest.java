package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void totalOfSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedTotal = 180;
        long actualTotal = service.totalSales(sales);

        Assertions.assertEquals(expectedTotal, actualTotal);
    }

    @Test
    public void averageOfSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverage = 15;
        long actualAverage = service.averageAmount(sales);

        Assertions.assertEquals(expectedAverage, actualAverage);
    }

    @Test
    public void maxSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMax = 8;
        long actualMax = service.maxSales(sales);

        Assertions.assertEquals(expectedMax, actualMax);
    }

    @Test
    public void minSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedMin = 9;
        long actualMin = service.minSales(sales);

        Assertions.assertEquals(expectedMin, actualMin);
    }

    @Test
    public void numbersBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedBelow = 5;
        long actualBelow = service.numberMonthsBelowAverage(sales);

        Assertions.assertEquals(expectedBelow, actualBelow);
    }

    @Test
    public void numbersAboveAverage() {
        StatsService service = new StatsService();

        long[] sales = {45, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAbove = 4;
        long actualAbove = service.numberMonthsAboveAverage(sales);

        Assertions.assertEquals(expectedAbove, actualAbove);
    }
}
