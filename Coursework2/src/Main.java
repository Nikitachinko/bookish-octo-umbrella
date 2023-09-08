public class Main {
   private static Employee[] employees = new Employee[10];
    public static void main(String[] args) {

    }
    public static void printEmployees(){
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }
    public static int calculateTotalSalary(){
        int sum = 0;
        for (Employee employee : employees){
            sum+=employee.getSalary();
        }
        return sum;
    }
    public static Employee findEmployeesMinSalary(){
        
    }
}