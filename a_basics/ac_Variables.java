package a_basics;

public class ac_Variables {
    public static void main(String[] args) {
        // Variable syntax:     type variableName = value;

        String greeting = "Hello";
        char letter = 'a';
        int myNum = 15;
        float phi = 1.61803f;
        final float pi = 3.14159f; // final = constant
        double e = 2.71828;
        boolean question = false;

        System.out.println(greeting);
        System.out.println(letter);
        System.out.println(myNum);
        System.out.println(phi);
        System.out.println(pi);
        System.out.println(e);
        System.out.println(question);
        
        // Instead of this:
        // int x = 5;
        // int y = 6;
        // int z = 50;
        // System.out.println(x + y + z);

        // You can declare multiple variables on a single line
        int x = 5, y = 6, z = 50;
        System.out.println(x + y + z);

        // You can also assign a single value to multiple variables
        x = y = z = 10;
        System.out.println(x + y + z);

        /*
           The general rules for naming variables are:

           - Names can contain letters, digits, underscores, and dollar signs
           - Names must begin with a letter
           - Names should start with a lowercase letter and it cannot contain whitespace
           - Names can also begin with $ and _
           - Names are case sensitive ("myVar" and "myvar" are different variables)
           - Reserved words (like Java keywords, such as int or boolean) cannot be used as names
         */
    }
}
