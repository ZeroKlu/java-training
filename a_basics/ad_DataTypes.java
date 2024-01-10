package a_basics;

public class ad_DataTypes {
    public static void main(String[] args) {
        // Primitives
        byte b = 127;                   // 1 byte	Stores whole numbers from                       -128  to                        127
        short s = 32767;                // 2 bytes  Stores whole numbers from                    -32,768  to                     32,767
        int i = 2147483647;             // 4 bytes	Stores whole numbers from             -2,147,483,648  to              2,147,483,647
        long l = 9223372036854775807L;  // 8 bytes	Stores whole numbers from -9,223,372,036,854,775,808  to  9,223,372,036,854,775,807
        float f = 3.14159f;             // 4 bytes	Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits
        double d = 2.71828;             // 8 bytes	Stores fractional numbers. Sufficient for storing 15 decimal digits
        boolean bl = true;              // 1 bit	Stores true or false values
        char c = 'A';                   // 2 bytes	Stores a single character/letter or ASCII values

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bl);
        System.out.println(c);

        // Scientific notation
        f = 5e3f;
        d = 6e4;
        
        System.out.println(f);
        System.out.println(d);

        // Char using ASCII value
        c = 66;

        System.out.println(c);

        // String (the only predefined non-primitive type in Java*)
        //         * unless you count arrays as a data type (and I don't)
        String greeting = "Hello World";

        System.out.println(greeting);

        /*
           Data Type Rules

            - Primitive types are predefined (already defined) in Java.
              Non-primitive types are created by the programmer and is not defined by Java (except for String).
            - Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
            - A primitive type has always a value, while non-primitive types can be null.
            - A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.
            - The size of a primitive type depends on the data type, while non-primitive types have all the same size.

            Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc
         */

        // Integer Literals
        System.out.println(26);             // Integer value 26 in decimal
        System.out.println(0x1A);           // Integer value 26 in hex
        System.out.println(0b11010);        // Integer value 26 in binary
        System.out.println(26L);            // Integer value 26 as long

        // Floating-Point Literals
        System.out.println(123.4);          // Floating-point value 123.4 as double (default)
        System.out.println(123.4d);         // Floating-point value 123.4 as double (explicit)
        System.out.println(123.4f);         // Floating-point value 123.4 as float

        // Underscores
        System.out.println(123_456.789);    // Underscores between digits are ignored and can be used to make numeric literals more readable

        // Character literals
        // Non-ASCII characters can be represented with a unicode escape sequence
        System.out.println("S\u00ED Se\u00F1or");
    }
}
