package ConceptAndCoding.multithreading.MonitorLockExample1;

public class SharedResource {

    boolean isItemPresent = false;

    public synchronized void addItem()
    {
       isItemPresent = true;
        System.out.println("Producer Thread calling the notify method");
        notifyAll();
    }

    public synchronized void consumeItem()
    {
        System.out.println("Consumer Thread inside consumeItem Method");
        while (!isItemPresent)
        {
            try {
                System.out.println("Consumer thread is waiting");
                wait(); //
            } catch (Exception e)
            {
                //exception handling here
            }
        }
        System.out.println("Consumer Thread consumed the item");
        isItemPresent = false;
    }


}
