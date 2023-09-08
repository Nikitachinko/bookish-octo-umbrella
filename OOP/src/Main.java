import Transport.*;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            DriverB driverB = new DriverB("Driver cat.B №" + i,
                    true,
                    5 + i);
            Car car = new Car(
                    " Автомобиль Бренд №" + i,
                    "Модель №" + i,
                    4.0, driverB);
            DriverC driverC = new DriverC("Driver cat.C №" + i,
                    true,
                    7 + i);
            Truck truck = new Truck(
                    " Грузовик Бренд №" + i,
                    "Модель №" + i,
                    4.0, driverC);
            DriverD driverD = new DriverD("Driver cat.D  №" + i,
                    true,
                    10 + i);
            Bus bus = new Bus(
                    " Автобус Бренд №" + i,
                    "Модель №" + i,
                    4.0, driverD);
            printInfo(car);
            printInfo(truck);
            printInfo(bus);
        }
    }

    private static void printInfo(Transport<?> transport) {
        System.out.println("Водитель " + transport.getDriver().getName() + " управляет автомобилем " + transport.getBrand() + " и будет участвовать в заезде");
    }
}