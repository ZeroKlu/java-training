package d_packages.dk_threads;

public class MainConcurrency extends Thread {
    public static int amount = 0;

    public void run() {
        System.out.println("Incrementing amount in thread...");
        amount++;
    }

    public static void main(String[] args) {
        MainConcurrency thread = new MainConcurrency();
        thread.start();
        // Here, we could be expecting 1, but because of the asynchronous nature of threads,
        //   the value is unpredictable, and we'll often get 0 instead
        System.out.println(amount);
        System.out.println("Incrementing amount outside thread...");
        amount++;
        System.out.println(amount);
    }
}
