package ru.netology.stats;

public class StatsService {

    public long totalSales(long[] sales) {
        long total = 0;
        for (long sale : sales) {
            total = total + sale;
        }
        return total;
    }

    public long averageAmount(long[] sales) {
        return (totalSales(sales) / sales.length);
    }

    public int maxSales(long[] sales) {
        int maxMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[maxMonth] - продажи в месяце maxMonth
            // sale - продажи в рассматриваемом месяце
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return maxMonth + 1;
    }

    public int minSales(long[] sales) {
        int minMonth = 0;
        int month = 0; // переменная для индекса рассматриваемого месяца в массиве
        for (long sale : sales) {
            // sales[minMonth] - продажи в месяце minMonth
            // sale - продажи в рассматриваемом месяце
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1; // следующий рассматриваемый месяц имеет номер на 1 больше
        }
        return minMonth + 1;
    }

    public long numberMonthsBelowAverage(long[] sales) {
        int numberMonths = 0;
        for (long sale : sales) {
            if (sale < averageAmount(sales)) {
                numberMonths++;
            }
        }
        return numberMonths;
    }

    public long numberMonthsAboveAverage(long[] sales) {
        int numberMonths = 0;
        for (long sale : sales) {
            if (sale > averageAmount(sales)) {
                numberMonths++;
            }
        }
        return numberMonths;
    }
}
