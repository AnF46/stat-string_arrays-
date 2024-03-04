package ru.netology.stats;

public class StatsService {

    public long getTotalSales(long[] sales) {
        long totalSales = 0;

        for (long sum : sales) {
            totalSales += sum;
        }
        return totalSales;
    }

    public long getAverageSaleForMonth(long[] sales) {
        long averageSalesForMonth = getTotalSales(sales) / sales.length;
        return averageSalesForMonth;
    }

    public int getBestSalesMonth(long[] sales) {
        int bestSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[bestSalesMonth]) {
                continue;
            }
            bestSalesMonth = i;
        }
        return bestSalesMonth;
    }

    public int getWorstSalesMonth(long[] sales) {
        int worstSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[worstSalesMonth])
                worstSalesMonth = i;
        }
        return worstSalesMonth + 1;
    }

    public int getMonthsBelowAverage(long[] sales) {
        int worstMonths = 0;
        long averageSales = getAverageSaleForMonth(sales);
        for (long i : sales) {
            if (i < averageSales) {
                worstMonths++;
            }
        }
        return worstMonths;
    }

    public int getMonthsHigherAverage(long[] sales) {
        int monthsHigherAverage = 0;
        long averagesales = getAverageSaleForMonth(sales);
        for (long x : sales) {
            if (x < averagesales) {
                monthsHigherAverage++;
            }
        }
        return monthsHigherAverage;
    }
}

