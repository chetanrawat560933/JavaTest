package ConceptAndCoding.multithreading.MonitorLockExample1;

public class Main {

    public static void main(String[] args) {
        SharedResource sharedResource = new SharedResource();

        Thread producerThread =  new Thread(() -> {
            try {

                Thread.sleep(2000); //We want consumer to go first
            } catch (Exception e)
            {
                 //Exception Handling
            }
            sharedResource.addItem();
        });
        Thread consumerThread = new Thread(() -> {
             sharedResource.consumeItem();
        });

        producerThread.start();
        consumerThread.start();

    }
}
