//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Задача 1");
        int firstFriday = 1;
        System.out.println("Пятница " + firstFriday + "-е число.");
        for (int i = 1; i <= 31; i++) {
            if (i == firstFriday) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
                firstFriday += 7;
            }
        }
        firstFriday = 2;
        System.out.println("Пятница " + firstFriday + "-е число.");
        for (int i = 1; i <= 31; i++) {
            if (i == firstFriday) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
                firstFriday += 7;
            }
        }
        firstFriday = 3;
        System.out.println("Пятница " + firstFriday + "-е число.");
        for (int i = 1; i <= 31; i++) {
            if (i == firstFriday) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
                firstFriday += 7;
            }
        }
        firstFriday = 4;
        System.out.println("Пятница " + firstFriday + "-е число.");
        for (int i = 1; i <= 31; i++) {
            if (i == firstFriday) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
                firstFriday += 7;
            }
        }
        firstFriday = 5;
        System.out.println("Пятница " + firstFriday + "-е число.");
        for (int i = 1; i <= 31; i++) {
            if (i == firstFriday) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
                firstFriday += 7;
            }
        }
        firstFriday = 6;
        System.out.println("Пятница " + firstFriday + "-е число.");
        for (int i = 1; i <= 31; i++) {
            if (i == firstFriday) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
                firstFriday += 7;
            }
        }
        firstFriday = 7;
        System.out.println("Пятница " + firstFriday + "-е число.");
        for (int i = 1; i <= 31; i++) {
            if (i == firstFriday) {
                System.out.println("Сегодня пятница, " + i + "-е число. Необходимо подготовить отчет.");
                firstFriday += 7;
            }
        }
        //Задание 2
        System.out.println("Задача 2");
        System.out.println("do-while");
        int distance = 0;
        do {
            System.out.println("Держитесь! Осталось " + (42195 - distance) + " метров.");
            distance += 500;
        } while (distance <= 42195);
        System.out.println("for");
        distance = 42195;
        for (int i = 0; i <= distance; i += 500) {
            System.out.println("Держитесь! Осталось " + (distance - i) + " метров.");
        }
        //Задание 3
        System.out.println("Задача 3");
        int initialBudget = 1000;
        int budget = initialBudget;
        int days = 1;
        while (budget > 0) {
            if (days % 5 == 0) {
                days++;
                continue;
            }
            budget -= 100;
            if (budget == 0) {
                break;
            }
            days++;
        }
        System.out.println("Бюджета " + initialBudget + " хватит на " + days + " дней.");
        //Задание 4
        System.out.println("Задача 4");
        int month = 0;
        int total = 0;
        while (true) {
            if (total >= 12_000_000) {
                break;
            }
            total += 15_000;
            month++;
            if (month % 6 == 0) {
                total += total / 100 * 7;
            }
            System.out.println("Месяц " + month + ", накоплений: " + total);
        }
        //Задание 5
        System.out.println("Задача 5");
        int charge = 20;
        int minute = 0;
        int overheat = 0;
        while (charge <= 100 && overheat <= 3) {
            minute++;
            if (minute % 10 == 0) {
                overheat++;
                continue;
            }
            if (overheat == 3) {
                break;
            }
            charge += 2;
        }
        System.out.println("Время зарядки составило " + minute + " минуту.");
    }
}