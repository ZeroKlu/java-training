package c_classes.cf_encapsulation;

public class Main {
    public static void main(String[] args) {
        Person someone = new Person("Lost", "Inthewoods", 30);
        System.out.println(someone.name());

        String fName = "Found";
        System.out.println("I want to change my name from " + someone.getFirstName() + " to " + fName);

        someone.setFirstName(fName);
        System.out.println(someone.introduction());
    }
}
