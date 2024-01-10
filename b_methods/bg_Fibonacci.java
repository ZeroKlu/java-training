package b_methods;

import java.util.Map;
import java.util.HashMap;

public class bg_Fibonacci {
    private static int calls;

    private static int fibonacci_recursive(int n)
    {
        calls++;
        if (n == 0 || n == 1) return n;
        return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2);
    }

    private static Map<Integer, Integer> mem;

    private static int fibonacci_memorized(int n)
    {
        calls++;
        if (mem.containsKey(n)) return mem.get(n);
        mem.put(n, fibonacci_memorized(n - 1) + fibonacci_memorized(n - 2));
        return mem.get(n);
    }

    private static int fibonacci_iterative(int n) 
    {
        calls++;
        if (n == 0 || n == 1) return n;
        int x = 0, y = 1, z = 0;
        for (int i = 0; i < n; i++)
        {
            z = x + y;
            x = y;
            y = z;
        }
        return x;
    }

    private static int fibonacci_formulaic(int n)
    {
        calls++;
        if (n == 0 || n == 1) return n;
        double phi = (1 + Math.sqrt(5)) / 2;
        return (int)Math.round((Math.pow(phi, n) - Math.pow(1 - phi, n)) / (phi - (1 - phi)));
    }

    public static void main(String[] args) {        
        int n = 30;

        calls = 0;
        int f = fibonacci_recursive(n);
        System.out.println("Recursive:");
        System.out.println("f(" + n + ") = " + f);
        System.out.println("Calls:  " + calls + "\n");

        calls = 0;
        mem = new HashMap<Integer, Integer>();
        mem.put(0, 0);
        mem.put(1, 1);
        f = fibonacci_memorized(n);
        System.out.println("Recursive (with memory):");
        System.out.println("f(" + n + ") = " + f);
        System.out.println("Calls:  " + calls + "\n");

        calls = 0;
        f = fibonacci_iterative(n);
        System.out.println("Iterative:");
        System.out.println("f(" + n + ") = " + f);
        System.out.println("Calls:  " + calls + "\n");

        calls = 0;
        f = fibonacci_formulaic(n);
        System.out.println("Formulaic:");
        System.out.println("f(" + n + ") = " + f);
        System.out.println("Calls:  " + calls);
    }
}
