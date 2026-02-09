package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class StatsServiceTest {
    @Test
    void testMinSales() {
        StatsService service = new StatsService();
        long[] minMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.minSales(minMonth);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    void testMaxSales() {
        StatsService service = new StatsService();
        long[] maxMonth = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.maxSales(maxMonth);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testSumAllSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.sumAllSales(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testAverageMonthlySalesAmount() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.averageMonthlySalesAmount(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testsAlesBelowAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.salesBelowAverage(sales);

        Assertions.assertEquals(expected, actual);

    }

    @Test
    void testsAlesBAboveAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.salesAboveAverage(sales);

        Assertions.assertEquals(expected, actual);
    }

}