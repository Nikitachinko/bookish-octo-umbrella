import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5(6);
        task6();
        task7();
    }

    public static void task1() {
        int num = 1;
        while (num <= 10) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();
        for (num = 10; num > 0; num--) {
            if (num == 1) {
                System.out.println(num);
                break;
            }
            System.out.print(num + " ");
        }
    }

    public static void task2() {
        int population = 12000000;
        int birth = population / 1000 * 17;
        int dead = population / 1000 * 8;
        int year = 0;
        while (year < 10) {
            year++;
            population = population + birth - dead;
            System.out.printf("Год %d , численность населения состоявляет %d\n", year, population);
        }
    }

    public static void task3() {
        int sum = 15000;
        int month = 1;
        while (sum <= 12000000) {
            sum *= 1.07;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d , сумма %d \n", month, sum);
            }
            month++;
        }
    }

    public static void task4() {
        int sum = 15000;
        for (int i = 1; i < 9 * 12; i = i + 6) {
            int x = sum;
            sum *= 1 + 0.07 * 6;
            System.out.printf("Месяц %d,сумма%d\n", i, sum - x);
        }
    }

    public static void task5(int firstFriday) {
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница " + currentFriday + "-ое число, нужно подготовить отчёт");
        }
    }

    public static void task6() {
        int year = 2023;
        int start = year - 200;
        int end = year + 100;
        for (int i = start; i < end; ++i) {
            if (i % 79 == 0) {
                System.out.println(i);
            }

        }
    }

    public static void task7() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("2*" + i + "=" + 2 * i);
        }
    }
}



    
