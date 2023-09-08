public class Car {
    String brend;
    int probeg;
    String color;


    public Car(String brend) {
        this.brend = brend;
        this.probeg = 10;
    }
    public String paint(String color){
        this.color = color;
        return this.color;
    }

    public void clearRunDistance() {
        probeg = 0;
    }

    public Car(Car car) {
        System.out.println("\n is Clone");
        this.brend = car.brend;
        this.probeg = car.probeg * 2;
    }

    public Car(String brend, int probeg) {
        this.brend = brend;
        this.probeg = probeg;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brend='" + brend + '\'' +
                ", probeg=" + probeg +
                ", color='" + color + '\'' +
                '}';
    }
}
