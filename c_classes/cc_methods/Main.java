package c_classes.cc_methods;

public class Main {
    // A static method belongs to the class and can be called without creating an instance
    static void myStaticMethod() {
        System.out.println("I'm a static method!");
    }

    // An instance method belongs to the instance and requires creating an object
    public void myPublicMethod() {
        System.out.println("I'm an instance method!");
    }

    public static void main(String[] args) {
        // Call static method from the class
        Main.myStaticMethod();

        Main myObj = new Main();
        // Call instance method from the object
        myObj.myPublicMethod();
    }
}
