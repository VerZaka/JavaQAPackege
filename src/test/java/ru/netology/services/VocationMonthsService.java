package ru.netology.services;
import org.junit.jupiter.params.ParameterizedTest;

public class VocationMonthsService {
    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/Month.csv")
    void shouldCalculateMonthsVocations3(int expected,int income, int expenses,int threshold ) {
        VocationMonthsService calculation = new VocationMonthsService();
        int months = calculation.calculate(income,expenses,threshold);
        Assertions.assertEquals(expected, months);
    }
}
