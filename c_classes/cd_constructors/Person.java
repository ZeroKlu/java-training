package c_classes.cd_constructors;

public class Person {
    public String firstName;
    public String lastName;
    public int age;

    // Constructor
    public Person(String fName, String lName, int years) {
        firstName = fName;
        lastName = lName;
        age = years;
    }

    public void name() {
        System.out.println("My name is " + firstName + " " + lastName);
    }
}
