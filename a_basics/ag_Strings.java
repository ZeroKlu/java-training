package a_basics;

public class ag_Strings {
    public static void main(String[] args) {
        // String is declared in double-quotes
        String greeting = "Hello World";
        System.out.println(greeting);

        // Case-modifying methods
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());

        // Length
        String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        System.out.println("The length of the txt string is: " + txt.length());

        // Location
        System.out.println(txt.indexOf("S"));

        // Concatenation
        String firstName = "Scott", lastName = "McLean";
        System.out.println(firstName + " " + lastName);     // Using the + operator
        System.out.println(firstName.concat(lastName));     // Using the concat() function

        // Escapes
        System.out.println("\"double-quotes\"");
        System.out.println("\'single-quotes\'");
        System.out.println("\\backslash");
        System.out.println("There is a new-line\n...right before this");
        System.out.println("\tTabbed");
        System.out.println("I used \bbackspace");
        System.out.println("Here is a form-feed\f");    // Not printable in console (useful in files)
    }
}
