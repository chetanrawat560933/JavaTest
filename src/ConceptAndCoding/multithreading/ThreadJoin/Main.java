package ConceptAndCoding.multithreading.ThreadJoin;

//import ConceptAndCoding.multithreading.MonitorLockExample1.SharedResource;

import ConceptAndCoding.multithreading.ThreadCreation.ThreadCreation;

public class Main {
    public static void main(String[] args) {
     SharedResource resource = new SharedResource();
     System.out.println("Main Thread started");

     Thread t1 = new Thread(() -> {
         System.out.println("Thread Calling produce method");
     });

     t1.setPriority(Thread.MAX_PRIORITY);
     t1.setDaemon(true);
     t1.start();

     try {
         System.out.println("Main Thread waiting for thread1 to finish now");
         t1.join();
     } catch (Exception e)
     {

     }

        System.out.println("Main Thread is finishing its work");

    }
}
