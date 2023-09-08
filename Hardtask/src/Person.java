public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public boolean isAdult() {
        return this.getAge()>18;
    }

    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void increaseAge(int increment) {

        if (increment<0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        this.age = age + increment;
    }

    public String toString() {
        return "Имя " + this.name + " Возраст " + this.age;
    }
}


