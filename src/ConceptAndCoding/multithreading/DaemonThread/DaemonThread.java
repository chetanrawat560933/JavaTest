package ConceptAndCoding.multithreading.DaemonThread;

public class DaemonThread {

    boolean isAvailable = false;

    public synchronized void produce()
    {
        System.out.println("Lock acquired");
        isAvailable = true;

        try {
             Thread.sleep(1000);
        } catch (Exception e)
        {
            //handle exception
        }
        System.out.println("Lock Released");


    }
}
