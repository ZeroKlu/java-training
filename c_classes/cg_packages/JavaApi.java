// The package keyword is used to create your own package(s) based on the folder structure
package c_classes.cg_packages;

/* 
    The Java API is a library of pre-written classes, that are free to use, included in the Java Development Environment
        List:   https://docs.oracle.com/javase/8/docs/api/
    
    You can import either a complete package or a class from the package
        import package.name.*;      // import the entire package
        import package.name.class;  // import a single class
 */

import java.util.Scanner;   // Import class used to accept user inputs
// import java.util.*;      // This would import the entire package rather than just the Scanner class

public class JavaApi {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = s.nextLine();
        s.close();
        System.out.println("Hello " + name);
    }
}

// Compile the file:
//   javac JavaApi.java                     (Creates JavaApi.class)
// Compile the package:
//   javac -d . JavaApi.java                (Creates ./c_classes/cg_packages/JavaApi.class)
// Run the package:
//   java c_classes.cg_packages.JavaApi     (Executes the program)
