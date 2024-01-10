package c_classes.cm_enums;

// An enum is a group of constants

// You can declare a global enum outside of a class
enum Level {
    LOW,
    MEDIUM,
    HIGH
}

public class Main {
    // You can also declare an enum locally within a class
    enum Color {
        RED,
        GREEN,
        BLUE
    }

    public static void main(String[] args) {
        Color myColor = Color.BLUE;
        System.out.println(myColor);

        // You can loop an enum
        for (Level l : Level.values())
        {
            System.out.println(l);
        }

        Level myLevel = Level.MEDIUM;
        // Enums are often used in switches
        switch (myLevel) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
            default:
                System.out.println("UNknown level");
                break;
        }
    }
}
