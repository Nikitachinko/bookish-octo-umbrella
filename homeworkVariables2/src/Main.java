public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println(" Задача 1 ");
        int a = 1000000;
        byte b = 100;
        short c = 30000;
        long l = 900000000000l;
        float f = 1.32345444f;
        double g = 1.2364736373737d;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(l);
        System.out.println(f);
        System.out.println(g);
    }

    public static void task2() {
        System.out.println(" Задача 2 ");
        int aa = 27897;
        byte bb = 67;
        short cc = 569;
        float ff = 27.12f;
        long ll = 987678965549l;
        double dd = 2.786;
        short ss = -159;
    }

    public static void task3() {
        System.out.println(" Задача 3 ");
        byte lP = 23;
        byte aS = 27;
        byte eA = 30;
        short paper = 480;
        int summ = lP + aS + eA;
        int p = paper / summ;
        System.out.println(p);
    }

    public static void task4() {
        System.out.println(" Задача 4 ");
        // В минуту произвлдится 8 бутылок значит за 20 минут производится
        int a = 8;
        int b = a * 20;
        System.out.println(" За 20 минут машина произвела " + b + " бутылок ");
        int aa = a * 1440;
        System.out.println(" За сутки машина произвела " + aa + " бутылок ");
        int bb = aa * 3;
        System.out.println(" За 3 дня машина произвела " + bb + " бутылок ");
        long cc = aa * 31;
        System.out.println(" За месяц машина произвела " + cc + " бутылок ");
    }

    public static void task5() {
        System.out.println(" Задача 5 ");
        int jar = 6;
        //Банако на один класс
        int study = 120 / jar;
        // Классов в школе
        // Если на класс уходит 2 банки белой и 4 коричневой значит
        int white = 2 * study;
        int brown = 4 * study;
        System.out.println("В школе где " + study + " классов " + " нужно " + white + " банок белой краски и " + brown + " коричневой краски ");
    }

    public static void task6() {
        System.out.println(" Задача 6 ");
        int banans = 5 * 80;
        int milk = 105 * 2;
        int iceCream = 2 * 100;
        int egg = 70 * 4;
        int a = banans + milk + iceCream + egg;
        System.out.println(" В граммах это будет " + a + " гр ");
        double h = a / 1000d;
        System.out.println(" В кг это будет " + h + " кг ");
    }

    public static void task7() {
        System.out.println("Задача 7");
        int a = 7 * 1000;
        // Вес в граммах  который нужно сбросить
        // Если сбрасывать в день по 250 гр
        int b = 250;
        int c = 500;
        int bb = a / b;
        int cc = a / c;
        System.out.println(" Если сбрасывать по 250 грамм то 7 кг он сброситт через " + bb + " Дней ");
        System.out.println(" Если сбрасывать по 500 грамм то 7 кг он сброситт через " + cc + " Дней ");
        int d = (bb + cc) / 2;
        System.out.println(" В среднем за " + d + " Дней он сбросит 7 кг ");

    }
    public static void task8() {
        System.out.println(" Задача 8 ");
        int m = 67760;
        int d = 83690;
        int k = 76230;
        // После повышения их зарплаты увеличатся на 10% это значит что будет
        double mp = m*0.1;
        double dp = d*0.1;
        double kp = k*0.1;
        double mp1 = (m+mp);
        double dp1 = (dp+d);
        double kp1 = (k+kp);
        System.out.println(" Зарплата Маши после повышения составит " + mp1 + " Рублей ");
        System.out.println(" Зарплата Дениса после повышения составит " + dp1 + " Рублей ");
        System.out.println(" Зарплата Кристины после повышения составит " + kp1 + " Рублей ");
        //Зарплата за год до повышения
        int zm = m*12;
        int zd = d*12;
        int zk = k*12;
        System.out.println(" Зарплата  Маши до повышения за год = " + zm);
        System.out.println(" Зарплата  Дениса до повышения за год = " + zd);
        System.out.println(" Зарплата  Кристины до повышения за год = " + zk);
        double zm1 = mp1*12;
        double zd1 = dp1*12;
        double zk1 = kp1*12;
        System.out.println(" Зарплата  Маши после повышения за год = " + zm1);
        System.out.println(" Зарплата  Дениса после повышения за год = " + zd1);
        System.out.println(" Зарплата  Кристины после повышения за год = " + zk1);
        double masha = (zm1-zm);
        double denis = (zd1-zd);
        double kristina = (zk1-zk);
        System.out.println(" Маша после повышения  получает " + mp1 + " рублей " + " Годовой доход вырос на " + masha + " рублей ");
        System.out.println(" Денис после повышения  получает " + dp1 + " рублей " + " Годовой доход вырос на " + denis + " рублей ");
        System.out.println(" Кристина после повышения  получает " + kp1 + " рублей " + " Годовой доход вырос на " + kristina + " рублей ");

    }
}

















