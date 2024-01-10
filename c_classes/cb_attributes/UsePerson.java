package c_classes.cb_attributes;

public class UsePerson {
    public static void main(String[] args) {
        Person person = new Person();
        person.firstName = "John";
        person.lastName = "Doe";
        person.age = 21;

        System.out.println(person.firstName + " " + person.lastName + " is " + person.age + " years old");
    }
}
