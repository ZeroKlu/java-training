package c_classes.ch_inheritance;

class Vehicle {
    // The protected field can only be accessed in this class or its child classes
    protected String brand = "Ford";

    public void honk() {
        System.out.println("Beep beep!");
    }
}

class Car extends Vehicle {
    private String modelName = "Mustang";

    public void name() {
        System.out.println(brand + " " + modelName);
    }
}

public class Main {
    public static void main(String[] args) {
        Car c = new Car();
        // Here we can access the public methods of both the Car and its superclass (Vehicle)
        c.name();
        c.honk();
    }
}
