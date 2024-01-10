package a_basics;

public class ae_TypeCasting {
    public static void main(String[] args){
        /*
         In Java, there are two types of casting:

          - Widening Casting (automatically) - converting a smaller type to a larger type size
            byte -> short -> char -> int -> long -> float -> double

          - Narrowing Casting (manually) - converting a larger type to a smaller size type
            double -> float -> long -> int -> char -> short -> byte
         */

        // Widening casting is done automatically when passing a smaller size type to a larger size type
        int myInt = 9;
        double myDouble = myInt;    // Widening casting to double
        System.out.println(myInt);
        System.out.println(myDouble);

        // Narrowing casting must be done manually by placing the type in parentheses in front of the value
        myDouble = 9.78d;
        myInt = (int) myDouble;     // Narrowing casting to int
        System.out.println(myInt);
        System.out.println(myDouble);
    }
}
