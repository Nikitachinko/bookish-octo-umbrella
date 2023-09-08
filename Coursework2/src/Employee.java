public class Employee {
    private static int counter = 0;
    private final String name;
    private int id;
    private int salary;
    private int department;

    public Employee(String name, int id, int salary, int department) {
        this.name = name;
        this.id = counter++;
        this.salary = salary;
        this.department = department;
    }

    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return
                "id: " + id +
                        "; Сотрудник" + name +
                        "; Зарплата" + salary +
                        "; Отдел" + department +
                        " ;";

    }
}
