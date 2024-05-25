package ConceptAndCoding.multithreading.ThreadCreation;

public class Main {
    public static void main(String[] args) {
        System.out.println("Going inside Main Method: - " + Thread.currentThread().getName());
        ThreadCreation runnableObj = new ThreadCreation();

        //This is where thread is getting created
        Thread thread = new Thread(runnableObj);
        thread.start();

        System.out.println("Finish Main Method: " + Thread.currentThread().getName());
    }
}
