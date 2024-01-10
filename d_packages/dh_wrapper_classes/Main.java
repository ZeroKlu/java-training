package d_packages.dh_wrapper_classes;

import java.util.ArrayList;;

/*
    Wrapper classes provide a way to use primitive data types (int, boolean, etc..) as objects.

    The table below shows the primitive type and the equivalent wrapper class:

    Primitive Data Type	    Wrapper Class
        byte	            Byte
        short	            Short
        int	                Integer
        long	            Long
        float	            Float
        double	            Double
        boolean	            Boolean
        char	            Character
 */

public class Main {
    public static void main(String[] args) {
        // Certain classes require that you use the wrappers rather than the primitives
        ArrayList<Integer> myNumbers = new ArrayList<Integer>();    // Valid
        // ArrayList<int> myNumbers = new ArrayList<int>();         // Invalid
        for (int i = 1; i < 6; i++) {
            myNumbers.add(i);
        }
        System.out.println(myNumbers);

        // Creating wrapper objects
        Integer myInt = 5;
        Double myDouble = 5.99;
        Character myChar = 'A';
        System.out.println(myInt);
        System.out.println(myDouble);
        System.out.println(myChar);

        // METHODS

        // Typed Values
        // intValue()
        // byteValue()
        // shortValue()
        // longValue()
        // floatValue()
        // doubleValue()
        // charValue()
        // booleanValue()
        System.out.println(myInt.intValue());
        System.out.println(myDouble.doubleValue());
        System.out.println(myChar.charValue());

        // ToString
        myInt = 100;
        String myString = myInt.toString();
        System.out.println(myString);
    }
}
