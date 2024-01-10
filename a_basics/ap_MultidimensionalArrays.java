package a_basics;

public class ap_MultidimensionalArrays {
    public static void main(String[] args) {
        // Java supports multidimensional arrays
        int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };
        System.out.println(myNumbers[1][2]);

        // Of course, you can loop multidimensional arrays using nested loops
        for (int i = 0; i < myNumbers.length; i++) {
            for (int j = 0; j < myNumbers[i].length; j++) {
                System.out.println(myNumbers[i][j]);
            }
        }
    }
}
