package d_packages.de_hashmap;

// A HashMap is like a LinkedList that stores key-value pairs instead of just values
// Compare to C# or Python Dictionary
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities.put("Germany", "Berlin");
        capitalCities.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");
        System.out.println(capitalCities);
        System.out.println(capitalCities.size());

        // Access an item by key
        System.out.println(capitalCities.get("England"));

        // Iterate the key/value pairs
        for (HashMap.Entry<String, String> entry : capitalCities.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        // Iterate the keys
        for (String key : capitalCities.keySet()) {
            System.out.println(key);
        }

        // Iterate the values
        for (String value : capitalCities.values()) {
            System.out.println(value);
        }

        // Delete an item by key
        capitalCities.remove("England");
        System.out.println(capitalCities);

        // Delete all the items
        capitalCities.clear();
        System.out.println(capitalCities);
    }
}
