package ru.netology.JavaQaPackage.services;
public class VocationMonthsService {
    public int calculate(int income, int expenses, int threshold) {
        int count = 0; // счётчик месяцев отдыха
        int money = 0; // денег на счету

        for (int month = 1; month <= 12; month++) {
            if (money >= threshold) { // можем ли отдыхать?
                count++; // увеличиваем счётчик месяцев отдыха
                int strtMoney = money;
                int vocationExpenses = (money - expenses) * 2 / 3;
                money = money - expenses - vocationExpenses; // деньги на счету = текущие деньги - ежемесячные траты -  траты на отпуск
                System.out.println(month + " месяц. Денег " + strtMoney + " потратил " + expenses + " потрачено на отдых " + vocationExpenses);
            } else {
                int strMoney = money;
                money = money + income - expenses;
                System.out.println(month + " месяц. Денег " + strMoney + " заработал " + income + " потратил " + expenses);
            }
        }
        return count;
    }
}
