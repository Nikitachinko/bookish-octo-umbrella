public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService();
        Person nikita = new Person("nikita",21);
        if (personService.isAdult(nikita)) {
            System.out.println("Иди в бар");
        }else{
            System.out.println("Иди в школу");
        }
        nikita.increaseAge(1);
        System.out.println(nikita);

    }
}