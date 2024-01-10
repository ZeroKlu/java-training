package d_packages.dc_arraylists;

// The ArrayList class is a resizable array (Like a C# List<T> or Python list), which can be found in the java.util package.
import java.util.ArrayList;
// The Collections class exposes additional functionality for ArrayLists and other collections
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);
        System.out.println(cars.size());

        System.out.println(cars.get(1));

        cars.set(1, "Opel");
        System.out.println(cars.get(1));

        cars.remove(0);
        System.out.println(cars);

        cars.clear();
        System.out.println(cars);
        
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        System.out.println(cars);

        for (String car : cars) {
            System.out.println(car);
        }

        Collections.sort(cars);
        System.out.println(cars);
    }
}
