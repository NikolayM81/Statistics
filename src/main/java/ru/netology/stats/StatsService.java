package ru.netology.stats;

public class StatsService {

    public int minSales(long[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    public long sumAllSales(long[] sales) {
        long amount = 0;
        for (long sale : sales) {
            amount = amount + sale;
        }
        return amount;

    }

    public long averageMonthlySalesAmount(long[] sales) {
        long amount = 0;
        for (long sale : sales) {
            amount = amount + sale;
        }
        long averageAmount = amount / 12;
        return averageAmount;

    }

    public int salesBelowAverage(long[] sales) {
        int quantity = 0;
        int belowAverage = (int) averageMonthlySalesAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < belowAverage) {
                quantity++;
            }
        }
        return quantity;
    }

    public int salesAboveAverage(long[] sales) {
        int quantity = 0;
        int aboveAverage = (int) averageMonthlySalesAmount(sales);
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > aboveAverage) {
                quantity++;
            }
        }
        return quantity;
    }
}


