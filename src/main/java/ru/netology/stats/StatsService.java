package ru.netology.stats;

import java.time.Month;

public class StatsService {
    public int sumSales(long[] sales) {
        int sumMonth = 0;
        for (long sale : sales) {
            sumMonth += sale;

        }
        return sumMonth;
    }

    public int averageAmount(long[] sales) {
        int minSum = 0;
        int monthSum = 0;
        for (long sale : sales) {
            monthSum = sumSales(sales);
            minSum = monthSum / sales.length;


        }
        return minSum;
    }

    public int PeakSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int MinimumSales(long[] sales) {
        int minMonth = 0;
        int month = 0;
        for (long sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int lessThanAverageSales(long[] sales) {
        int lessAverageMonth = 0;
        double averageSum = PeakSales(sales);

        for (long sale : sales) {
            if (sale <= averageSum) {
                lessAverageMonth++;
            }
        }
        return lessAverageMonth;
    }

    public int AboveAverageSales(long[] sales) {
        int AboveAverageMonth = 0;
        double averageSum = PeakSales(sales);
        for (long sale : sales) {
            if (sale <= averageSum) {
                AboveAverageMonth++;

            }
        }
        return AboveAverageMonth;
    }

}
