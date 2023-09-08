import java.util.ArrayList;
import java.util.List;

public class Main {
    public static  void main(String[] args) {
        List<Animal>animals = new ArrayList<>();
        animals.add(new Animal(1));
        animals.add(new Animal(2));
        test(animals);


    }
    private static void test(List<Animal>list){
        for(Animal animal:list) {
            System.out.println(animal);
        }
    }
}
