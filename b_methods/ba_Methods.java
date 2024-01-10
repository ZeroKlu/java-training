package b_methods;

public class ba_Methods {
    // You can declare a method anywhere within the class
    static void myMethod()
    {
        System.out.println("Executed my method!");
    }

    public static void main(String[] args) {
        // You can call the method elsewhere in the class
        System.out.println("Calling custom method...");
        myMethod();
        // And it can be called multiple times
        myMethod();
    }
}
