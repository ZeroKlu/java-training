package a_basics;

public class am_ForLoop {
    public static void main(String[] args) {
        // for (initial; condition; increment)
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

        // We can increment in reverse
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }
        
        // We can increment by any amount
        for (int i = 0; i < 10; i += 2) {
            System.out.println(i);
        }
        
        // We can nest loops
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println(i + ", " + j);
            }
        }

        // You can create a for-each across an array
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        // for (var : array)
        for (String s : cars) {
            System.out.println(s);
        }
    }
}
