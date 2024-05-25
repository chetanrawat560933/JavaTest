package ConceptAndCoding.multithreading.monitorLockExample;

public class MonitorLockExample {

    public synchronized void task1()
    {
        try {
            System.out.println("Inside task 1");
            Thread.sleep(1000);
        } catch (Exception e)
        {
            //Exception Handling here
        }

    }

    public void task2()
    {
        System.out.println("Task2, but before synchronized");
        synchronized (this)
        {
            System.out.println("Task2, inside syncronized");
        }
    }

    public void task3()
    {
        System.out.println("Task 3");
    }

    public static void main(String[] args) {

        MonitorLockExample obj = new MonitorLockExample();

    //    Thread t1 = new Thread(() -> {obj.task1();});

        //T1 i used with making it different class and implementing Runnable Interface
        MonitorThreadRunnable monitorThreadRunnable = new MonitorThreadRunnable(obj);


        Thread t1 = new Thread(monitorThreadRunnable);

        //t2 and t3 we created thread using functional interface
        Thread t2 = new Thread(() -> {obj.task2();});
        Thread t3 = new Thread(() -> {obj.task3();});

        t1.start();
        t2.start();
        t3.start();


    }
}
