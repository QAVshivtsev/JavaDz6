package ru.netology.stats;


public class StatsService {

    // сумму всех продаж;
    public int theAmountOfSales(int[] sales) {
        int allSales = 0;

        for (int i = 0; i < sales.length; i++) {
            allSales = allSales + sales[i];
        }
        return allSales;
    }

    // среднюю сумму продаж в месяц;
    public int theAverageAmount(int[] sales) {
        return theAmountOfSales(sales) / sales.length;
    }

    // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;
    public int maxSales(int[] sales) {
        int maxMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[maxMonth]) {
                maxMonth = i;
            }
        }
        return maxMonth + 1;
    }

    // номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*;
    public int minSales(int[] sales) {
        int minMonth = 0;

        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[minMonth]) {
                minMonth = i;
            }
        }
        return minMonth + 1;
    }


    // количество месяцев, в которых продажи были ниже среднего ;
    public int belowAverage(int[] sales) {
        int belowAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] < theAverageAmount(sales)) {
                belowAverage++;
            }
        }
        return belowAverage;
    }

    // количество месяцев, в которых продажи были выше среднего
    public int aboveAverage(int[] sales) {
        int aboveAverage = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > theAverageAmount(sales)) {
                aboveAverage++;
            }
        }
        return aboveAverage;
    }
}
