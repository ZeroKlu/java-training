package b_methods;

public class bb_Parameters {
    // Here, the method accepts a string parameter
    static void hello(String name) {
        System.out.println("Hello " + name);
    }

    // Here, we're illustrating accepting multiple parameters
    static void goodbye(String name, boolean formal) {
        String farewell = formal ? "Fare you well, " : "Bye bye, ";
        System.out.println(farewell + name);
    }
    
    // Note: Unlike some languages, Java does not support setting default parameters

    public static void main(String[] args) {
        // Here, we pass an argument to the method
        hello("Scott");
        hello("Someone Else");

        // Passing multiple arguments
        goodbye("Scott", false);
        goodbye("Someone Else", true);
    }
}
