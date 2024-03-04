package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldFindTotalSales() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedSum = 180;
        long actualSum = service.getTotalSales(sales);

        Assertions.assertEquals(expectedSum, actualSum);
    }

    @Test
    public void shouldFindAverageSalesForMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedAverageSalesForMonth = 15;
        long actualAverageSalesForMonth = service.getAverageSaleForMonth(sales);

        Assertions.assertEquals(expectedAverageSalesForMonth, actualAverageSalesForMonth);
    }

    @Test
    public void shouldFindBestSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long expectedBestSalesMonth = 8;
        long actualBestSalesMonth = service.getBestSalesMonth(sales);

        Assertions.assertEquals(expectedBestSalesMonth, actualBestSalesMonth);
    }

    @Test
    public void shouldFindWorstSalesMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedWorstSalesMonth = 9;
        int actualWorstSalesMonth = service.getWorstSalesMonth(sales);

        Assertions.assertEquals(expectedWorstSalesMonth, actualWorstSalesMonth);
    }

    @Test
    public void findMonthsBelowAverage() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expexted = 5;
        int actual = service.getMonthsBelowAverage(sales);

        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void findMonthsHigherAverage() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expected = 5;
        int actual = service.getMonthsHigherAverage(sales);

        Assertions.assertEquals(expected, actual);
    }


}
