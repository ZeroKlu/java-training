package a_basics;

public class af_Operators {
    public static void main(String[] args) {
        int x = 6, y = 3, z = 4;

        // ARITHMETIC OPERATORS

        // Addition
        System.out.println(x + y);

        // Subtraction
        System.out.println(x - y);

        // Multiplication
        System.out.println(x * y);

        // Division
        System.out.println(x / y);

        // Modulus / Remainder
        System.out.println(x % z);

        // Increment
        System.out.println(++x);

        // Decrement
        System.out.println(--x);

        // ASSIGNMENT OPERATORS

        // Assignment
        x = 10;
        System.out.println(x);

        // Addition Assignment
        x += 10;
        System.out.println(x);

        // Subtraction Assignment
        x -= 10;
        System.out.println(x);

        // Multiplication Assignment
        x *= 10;
        System.out.println(x);

        // Division Assignment
        x /= 10;
        System.out.println(x);

        // Modulus Assignment
        x %= 3;
        System.out.println(x);

        // Bitwise AND Assignment
        x &= 3;
        System.out.println(x);

        // Bitwise OR Assignment
        x |= 5;
        System.out.println(x);

        // Bitwise XOR Assignment
        x ^= 3;
        System.out.println(x);

        // Left Bit-Shift Assignment
        x <<= 1;
        System.out.println(x);

        // Right Bit-Shift Assignment
        x >>= 1;
        System.out.println(x);

        // COMPARISON OPERATORS

        // Equal To
        System.out.println(x == y);

        // Not Equal To
        System.out.println(x != y);

        // Greater Than
        System.out.println(x > y);

        // Less Than
        System.out.println(x < y);

        // Greater Than or Equal
        System.out.println(x >= y);

        // Less Than or Equal
        System.out.println(x <= y);

        // LOGICAL OPERATORS

        // Logical AND
        System.out.println(x != y && x > y);

        // Logical OR
        System.out.println(x != y || x < y);

        // Logical NOT
        System.out.println(!(x > y));
    }
}
