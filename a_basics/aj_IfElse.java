package a_basics;

public class aj_IfElse {
    public static void main(String[] args) {
        int myAge = 25;
        int minAge = 18;
        int maxAge = 65;
        
        if (myAge < minAge) {
            // Block executes if condition (myAge < minAge) is true
            System.out.println("Too young!");
        } else if (myAge > maxAge) {
            // You can include as many else-if blocks as you need
            // Block executes if all prior conditions are false but condition (myAge > maxAge) is true
            System.out.println("Too old!");
        } else {
            // Block executes if all conditions are false
            System.out.println("Just right!");
        }

        // Ternary conditional:     var = condition ? true_value : false_value;
        String res = myAge > minAge ? "Adult" : "Child";
        System.out.println(res);
    }
}
