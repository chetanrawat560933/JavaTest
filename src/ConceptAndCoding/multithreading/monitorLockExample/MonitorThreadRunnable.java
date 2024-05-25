package ConceptAndCoding.multithreading.monitorLockExample;

public class MonitorThreadRunnable implements Runnable {
    MonitorLockExample obj;

    MonitorThreadRunnable(MonitorLockExample obj)
    {
        this.obj = obj;
    }
    @Override
    public void run() {
        obj.task1();
    }
}
