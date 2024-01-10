package c_classes.cl_interfaces;

// Interfaces are completely abstract classes and cannot implement methods like abstract classes can.
interface Animal {
    public void animalSound(); // interface method (does not have a body)

    public void sleep(); // interface method (does not have a body)
}

// Pig "implements" the Animal interface
class Pig implements Animal {
    public void animalSound() {
        // The body of animalSound() is provided here
        System.out.println("The pig says: oink oink");
    }

    public void sleep() {
        // The body of sleep() is provided here
        System.out.println("Zzz");
    }
}

public class Main {
    public static void main(String[] args) {
        Pig myPig = new Pig(); // Create a Pig object
        myPig.animalSound();
        myPig.sleep();
    }
}

/*
 Notes on Interfaces:
 - Like abstract classes, interfaces cannot be used to create objects
   In the example above, it is not possible to create an "Animal" object in the Main class
 - Interface methods do not have a body - the body is provided by the "implement" class
 - On implementation of an interface, you must override all of its methods
 - Interface methods are by default abstract and public
 - Interface attributes are by default public, static and final
 - An interface cannot contain a constructor (as it cannot be used to create objects)

 Why And When To Use Interfaces?
  1) To achieve security - hide certain details and only show the important details of an object (interface).
  2) Java does not support "multiple inheritance" (a class can only inherit from one superclass).
     However, it can be achieved with interfaces, because the class can implement multiple interfaces.
     Note: To implement multiple interfaces, separate them with a comma, e.g.:      class Foo implements Bar, Bah, Bam { ... }
 */