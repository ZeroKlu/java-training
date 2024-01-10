package d_packages.di_exceptions;

public class Main {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied! You must be at least 18 years old.");
        }
        System.out.println("Access granted - You are old enough!");
    }

    public static void main(String[] args) {
        try {
            //  Block of code to try to execute
            int[] myNumbers = {1, 2, 3};
            System.out.println(myNumbers[10]); // error!
        } catch (Exception e) {
            // Block of code to handle errors
            System.err.println(e.getClass() + " [" + e.getMessage() + "]");
        } finally {
            // Block of code to execute at end, whether or not there was an exception
            System.out.println("The 'try catch' is finished.");
        }

        try {
            System.out.println("Test - 20");
            checkAge(20);
            System.out.println("Test - 17");
            checkAge(17);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
