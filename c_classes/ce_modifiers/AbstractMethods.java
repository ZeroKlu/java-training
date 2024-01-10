package c_classes.ce_modifiers;

// abstract class
abstract class Person {
    public String firstName;
    public String lastName;

    public abstract void activity(); // abstract method
}

// inherited class
class Student extends Person {
    public int graduationYear;

    public Student(String fName, String lName, int gradYear) {
        firstName = fName;
        lastName = lName;
        graduationYear = gradYear;
    }

    private void study() {
        System.out.println("Hi! I'm " + firstName + " " + lastName + ".\nI have to study hard until I graduate in " + graduationYear + ".");
    }

    // You must implement the body of the abstract method in the inherited class
    public void activity() {
        study();
    }
}

public class AbstractMethods {
    public static void main(String[] args) {
        Student myStudent = new Student("Phil", "Intheblanks", 2025);
        myStudent.activity(); // Calling the implementation of the abstract method in the inherited class
    }
}
