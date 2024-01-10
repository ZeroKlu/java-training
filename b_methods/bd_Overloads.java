package b_methods;

public class bd_Overloads {
    static int add(int x, int y) {
        System.out.println("Adding using the int method...");
        return x + y;
    }

    // You can overload a method name as long as the number or type of the parameters is different
    static double add(double x, double y) {
        System.out.println("Adding using the double method...");
        return x + y;
    }

    public static void main(String[] args) {
        // The only difference when calling the overloaded methods is the arguments
        System.out.println(add(3, 5));
        System.out.println(add(3.0, 5.0));
    }
}
