package ru.netology.javaqa.MvnHW.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;

public class RestServiceTest {

    @ParameterizedTest
    //@CsvSource({
    //        "3,10000,3000,20000",
    //        "2,100000,60000,150000"
    //})
    @CsvFileSource(files="src/test/resources/Rest.csv")
    void calculateMonths1(int expected, int income, int expenses, int threshold) {
        RestService service = new RestService();

        //int income = 10_000;
        //int expenses = 3_000;
        //int threshold = 20_000;
        //int expected = 3;
        int actual = service.calculateMonths(income, expenses, threshold);

        Assertions.assertEquals(expected, actual);
    }

    //@Test
    //void calculateMonths2() {
        //RestService service = new RestService();

        //int income = 100_000;
        //int expenses = 60_000;
        //int threshold = 150_000;
        //int expected = 2;
        //int actual = service.calculateMonths(income, expenses, threshold);

        //Assertions.assertEquals(expected, actual);
    //}
}