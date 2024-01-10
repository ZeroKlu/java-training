package a_basics;

public class ah_StringVersusNumber {
    public static void main(String[] args) {
        // If you add two numbers, the result will be a number
        int a = 10, b = 20;
        int c = a + b;
        System.out.println(c);

        // If you add two strings, the result will be a string concatenation
        String x = "10", y = "20";
        String z = x + y;
        System.out.println(z);

        // If you add a number and a string, the result will be a string concatenation
        System.out.println(c + z);
    }
}
