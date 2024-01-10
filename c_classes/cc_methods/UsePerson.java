package c_classes.cc_methods;

public class UsePerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.firstName = "John";
        person.lastName = "Doe";
        person.age = 21;

        // Static method
        Person.identify();
        // Instance method
        person.name();
    }
}
