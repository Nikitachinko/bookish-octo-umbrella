public class Methods {
    public static void main(String[] args) {
        yeares(2022);
    }
    public static int yeares(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " Високосный");
        } else {
            System.out.println(year + " Не висосконый");
        }
        return year;
    }
}
