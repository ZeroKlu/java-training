package d_packages.df_hashset;

// A HashSet is an unordered set of items where each item must be unique
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        System.out.println(cars.size());
        cars.add("BMW");
        System.out.println(cars.size());
        cars.add("Ford");
        System.out.println(cars.size());
        cars.add("BMW");    // Note: Adding a second time does nothing (no error and no additional element)
        System.out.println(cars.size());
        cars.add("Mazda");
        System.out.println(cars.size());

        for (String car : cars) {
            System.out.println(car);
        }
        
        System.out.println(cars);
        String name = "BMW";
        String prefix = cars.contains(name) ? " " : " not ";
        System.out.println(name + prefix + "found");

        cars.remove(name);
        System.out.println(cars);
        prefix = cars.contains(name) ? " " : " not ";
        System.out.println(name + prefix + "found");

        cars.clear();
        System.out.println(cars);
    }
}
