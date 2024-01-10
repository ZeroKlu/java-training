package d_packages.dk_threads;

// You can create a thread by extending the Thread class...
public class MainExtend extends Thread {
    // ... and overriding its run() method
    public void run() {
        System.out.println("This code is running in a thread");
    }

    public static void main(String[] args) {
        MainExtend thread = new MainExtend();
        thread.start();
        System.out.println("This code is running outside the thread");
    }
}
