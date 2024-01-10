package c_classes.cc_methods;

public class Person {
    public String firstName;
    public String lastName;
    public int age;

    public static void identify() {
        System.out.println("Person");
    }

    public void name() {
        System.out.println("My name is " + firstName + " " + lastName);
    }
}
