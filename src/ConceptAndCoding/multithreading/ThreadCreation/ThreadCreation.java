package ConceptAndCoding.multithreading.ThreadCreation;

public class ThreadCreation implements Runnable {
    @Override
    public void run() {
        System.out.println("Code executed By Thread: - " + Thread.currentThread().getName());
    }
}
