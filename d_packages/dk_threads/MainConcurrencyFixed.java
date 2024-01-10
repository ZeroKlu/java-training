package d_packages.dk_threads;

public class MainConcurrencyFixed extends Thread {
    public static int amount = 0;

    public void run() {
        amount++;
        System.out.println("Incremented amount in thread...");
    }

    public static void main(String[] args) {
        MainConcurrencyFixed thread = new MainConcurrencyFixed();
        thread.start();
        // We can use the isAlive() method to wait for a thread to complete
        // This avoids concurrency issues
        while (thread.isAlive()) {
            System.out.println("Waiting...");
        }
        System.out.println(amount);
        System.out.println("Incrementing amount outside thread...");
        amount++;
        System.out.println(amount);
    }
}
