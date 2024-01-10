package d_packages.dk_threads;

// You can create a thread by implementing the Runnable interface...
public class MainImplement implements Runnable {
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

// By implementing the Runnable interface instead of the Thread class,
//    it is possible to extend from another class
