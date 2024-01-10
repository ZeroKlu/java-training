package b_methods;

public class be_Scope {
    public static void main(String[] args) {
        // A variable is accessible only within the block where it is declared and after it is declared

        // Code here can't use x

        int x = 10;

        // Code here can use x
        System.out.println(x);

        while(x > 0) {
            // A block inside the scope can still access the variable

            // Code here can still use x but can't use y

            int y = 10 - x;

            // Code here can use both x and y

            System.out.println(x + " " + y);
            x--;
        }

        // Code here can't use y but can still use x
        x = 20;
        System.out.println(x);
    }
}
