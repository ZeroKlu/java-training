package d_packages.dl_lambdas;

import java.util.ArrayList;
import java.util.function.Consumer;

/*
    Lambda Syntax

    The simplest lambda expression contains a single parameter and an expression
      parameter -> expression

    To use more than one parameter, wrap them in parentheses:
      (parameter1, parameter2) -> expression

    Expressions are limited. They have to immediately return a value, and they cannot contain variables,
    assignments or statements such as if or for. In order to do more complex operations, a code block
    can be used with curly braces. If the lambda expression needs to return a value, then the code block
    should have a return statement.
      (parameter1, parameter2) -> { code block }
 */

interface StringFunction {
    String run(String str);
}

public class Main {
    // Method that accepts a lambda as an argument
    public static void printFormatted(String str, StringFunction format) {
        System.out.println(format.run(str));
    }

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);

        // Anonymous lambda
        numbers.forEach( (n) -> { System.out.println(n); } );

        // Named lambda
        Consumer<Integer> method = (n) -> { System.out.println(n); };
        numbers.forEach( method );

        // Create lambda for function
        StringFunction say = (s) -> s + ".";
        StringFunction exclaim = (s) -> s + "!";
        StringFunction ask = (s) -> s + "?";

        String message = "Hello";

        // Pass lambda to function
        printFormatted(message, say);
        printFormatted(message, exclaim);
        printFormatted(message, ask);
    }
}
