package ConceptAndCoding.multithreading.ReentrantLock;

import java.util.concurrent.locks.ReentrantLock;

public class SharedResource {
    boolean isAvailable = false;

    public void producer(ReentrantLock lock)
    {
        try {
            lock.lock();
            System.out.println("Lock acquired by: - " + Thread.currentThread().getName());
        } catch (Exception e)
        {

        }
        finally {
            lock.unlock();
            System.out.println("Lock release by: - " + Thread.currentThread().getName());
        }
    }


}
