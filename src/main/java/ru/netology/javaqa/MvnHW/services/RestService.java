package ru.netology.javaqa.MvnHW.services;

public class RestService {
    public static int calculateMonths(int income, int expenses, int threshold) {

        int count = 0; // счётчик месяцев отдыха
        int money = 0; // количество денег на счету
        for (int month = 0; month < 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                money = money - expenses;
                money = money / 3;

            } else {
                money -= expenses;
                money += income;
            }
        }
        return count;
    }
}