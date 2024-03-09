package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    // сумму всех продаж;
    @Test
    public void theSumOfAllSales() {  // сумма всех продаж
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSlesAmount = 180; //ожидаемая сумма продаж
        int theAmountOfSales = service.theAmountOfSales(sales);
        Assertions.assertEquals(theAmountOfSales, expectedSlesAmount);
    }

    // среднюю сумму продаж в месяц;
    @Test
    public void theAverageAmountOfSalesPerMonth() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedSlesAmount = 15;
        int theAmountOfSales = service.theAverageAmount(sales);
        Assertions.assertEquals(theAmountOfSales, expectedSlesAmount);
    }

    // номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;
    @Test
    public void aMonthWithMaximalSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 8;
        int maxSalesMonth = service.maxSales(sales);
        Assertions.assertEquals(expectedMonth, maxSalesMonth);
    }

    // номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*;
    @Test
    public void aMonthWithMinimalSales() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 9;
        int minSalesMonth = service.minSales(sales);
        Assertions.assertEquals(expectedMonth, minSalesMonth);
    }

    // количество месяцев, в которых продажи были ниже среднего ;
    @Test
    public void belowTheAverageValue() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5; //5 месяцев меньше 15 продаж.
        int lessThanAverage = service.belowAverage(sales);
        Assertions.assertEquals(expectedMonth, lessThanAverage);
    }

    // количество месяцев, в которых продажи были выше среднего
    @Test
    public void aboveTheAverageValue() {
        StatsService service = new StatsService();
        int[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        int expectedMonth = 5; //5 месяцев больше 15 продаж.
        int moreThanAverage = service.aboveAverage(sales);
        Assertions.assertEquals(expectedMonth, moreThanAverage);
    }

}