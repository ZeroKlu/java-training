package b_methods;

public class bf_Recursion {
    public static int sum(int k) {
        System.out.println("Function called: k = " + k);
        if (k > 0) {
            // Function recursively calls itself
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }
}
