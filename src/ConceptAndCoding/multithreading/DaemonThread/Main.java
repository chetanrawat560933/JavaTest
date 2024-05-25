package ConceptAndCoding.multithreading.DaemonThread;

public class Main {
    public static void main(String[] args) {
        DaemonThread daemonThread = new DaemonThread();

        System.out.println("Main Thread Executed");

        Thread t1 = new Thread(() -> {
            System.out.println("Thread Calling produce Method");
            daemonThread.produce();
        });

        t1.setDaemon(true);
        t1.start();
        System.out.println("Main Thread is finishing its work");
    }
}


