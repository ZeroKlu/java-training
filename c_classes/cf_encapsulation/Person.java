package c_classes.cf_encapsulation;

public class Person {
    // Encapsulating these private fields using public getter and setter methods
    private String firstName;
    private String lastName;
    private int age;

    public Person(String fName, String lName, int years) {
        firstName = fName;
        lastName = lName;
        age = years;
    }

    // Getter
    public String getFirstName() {
        return firstName;
    }

    // Setter
    public void setFirstName(String fName) {
        firstName = fName;
    }

    // Getter
    public String getLastName() {
        return lastName;
    }

    // Setter
    public void setLastName(String lName) {
        lastName = lName;
    }

    // Getter
    public int getAge() {
        return age;
    }

    // I haven't added a setter for age, so it is a read-only property
    // Optionally, I could omit the getter on a property to make is write-only

    public String name() {
        return "My name is " + firstName + " " + lastName;
    }

    public String introduction() {
        String suffix = age == 1 ? "" : "s";
        return name() + "\nI am " + age + " year" + suffix + " old.";
    }
}
