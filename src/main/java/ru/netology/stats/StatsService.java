package ru.netology.stats;

public class StatsService {

    public long TotalSales(long[] sales) {
        long totalSales = 0;

        for (long sum : sales) {
            totalSales += sum;
        }
        return totalSales;
    }

    public long monthAverageSale(long[] sales) {
        long averageSalesForMonth = TotalSales(sales) / sales.length;
        return averageSalesForMonth;
    }

    public int BestSalesMonth(long[] sales) {
        int bestSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > sales[bestSalesMonth]) {
                continue;
            }
            bestSalesMonth = i;
        }
        return bestSalesMonth;
    }

    public int minSalesMonth(long[] sales) {
        int worstSalesMonth = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < sales[worstSalesMonth])
                worstSalesMonth = i;
        }
        return worstSalesMonth + 1;
    }

    public int salesBelowAverage(long[] sales) {
        int worstMonths = 0;
        long averageSales = monthAverageSale(sales);
        for (long i : sales) {
            if (i < averageSales) {
                worstMonths++;
            }
        }
        return worstMonths;
    }

    public int salesHigherAverage(long[] sales) {
        int monthsHigherAverage = 0;
        long averageSales = monthAverageSale(sales);
        for (long x : sales) {
            if (x > averageSales) {
                monthsHigherAverage++;
            }
        }
        return monthsHigherAverage;
    }
}

