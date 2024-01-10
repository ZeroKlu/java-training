package a_basics;

public class al_WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i++ < 5)
        {
            System.out.println(i);
        }

        do
        {
            System.out.println(i);
        } while (i-- > 1);
    }
}
