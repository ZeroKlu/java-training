package a_basics;

public class ao_Arrays {
    public static void main(String[] args) {
        // Arrays are declared using square brackets
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // Elements can be accessed by index (0-based)
        System.out.println(cars[0]);
        // Elements can be modified
        cars[0] = "Opel";
        System.out.println(cars[0]);

        // Any data type can exist in the array
        int[] nums = {10, 20, 30, 40};
        System.out.println(nums[1]);
        // The length attribute returns the number of elements in the array
        System.out.println(nums.length);
        
        // Unlike other languages, where you can simply specify the length when declaring an empty array,
        //   in Java, you must populate the number of elements you want the array to contain
        String[] animals = {null, null, null};
        animals[0] = "dog";
        animals[1] = "cat";
        animals[2] = "fish";
        
        // You can loop through the array elements using a for loop
        for (int i = 0; i < animals.length; i++) {
            System.out.println(animals[i]);
        }

        // A for-each loop can be clearer
        for (String car: cars) {
            System.out.println(car);
        }
    }
}
