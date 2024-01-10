package b_methods;

public class bc_Return {
    // To return a value, declare a return type for the method ...
    static int add(int x, int y) {
        // ... and then return a value of that type
        return x + y;
    }

    public static void main(String[] args) {
        // You can store the return value in a variable
        int i = add(10, 5);
        System.out.println(i);
        
        // Or you can just use the return value without storing it
        System.out.println(add(8, 7));
    }
}
