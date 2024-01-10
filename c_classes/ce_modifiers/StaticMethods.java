package c_classes.ce_modifiers;

public class StaticMethods {
      // Static method
    static void myStaticMethod() {
        System.out.println("Static methods can be called without creating objects");
    }

    // Public method
    public void myPublicMethod() {
        System.out.println("Public methods must be called by creating objects");
    }

    // Main method
    public static void main(String[ ] args) {
        StaticMethods.myStaticMethod(); // Call the static method
        myStaticMethod(); // Class identifier is optional within the class itself
        // myPublicMethod(); This would output an error

        StaticMethods myObj = new StaticMethods(); // Create an object of Main
        myObj.myPublicMethod(); // Call the public method
    }
}
