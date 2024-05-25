package ConceptAndCoding.multithreading.ThreadDemonDeadlock;

public class Main {
    public static void main(String[] args) {

        SharedResource sharedResource = new SharedResource();
        System.out.println("Main Thread is Started");

        Thread t1 = new Thread(() -> {
            System.out.println("Thread calling produce method");
            sharedResource.produce();
        });

        Thread t2 = new Thread(() -> {
            try {
                Thread.sleep(3000);

            } catch (Exception e)
            {
                sharedResource.produce();
            }
        });

        t1.start();
        t2.start();

        try {
            Thread.sleep(3000);

        } catch (Exception e)
        {
            //exception handling here

        }

        System.out.println("Thread is suspended");
        t1.suspend();

        t1.resume();
        System.out.println("Main thread is finishing its work");
    }
}
