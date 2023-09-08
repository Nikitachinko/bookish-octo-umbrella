public class HW2 {
    public static void main(String[] args) {
        task1();

    }

    public static void task1() {
       int year = 2030;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " високосный!");
        } else  {
            System.out.println("Не високосный");

        }
    }
}

