package ConceptAndCoding.multithreading.ThreadJoin;

public class SharedResource {

    boolean isAvailable = false;

    public synchronized void produce() {
        System.out.println("Lock Acquired");
        isAvailable = true;

//        try {
//            Thread.sleep(8000);
//        } catch (Exception e) {
//            // handle some exceptions here
//        }

         System.out.println("Lock Released");

    }
}