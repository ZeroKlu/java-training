package a_basics;

public class an_BreakContinue {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            if (++i > 5) {
                System.out.println("Done!");
                // Immediately ends the loop
                break;
            }
            System.out.println(i);
        }

        for (int n = 0; n < 10; n++) {
            if (n % 2 == 0)
            {
                System.out.println("Skipping even number...");
                // Immediately ends the iteration but continues the next iteration of the loop
                continue;
            }
            System.out.println(n);
        }
    }
}
