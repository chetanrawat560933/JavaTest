package ConceptAndCoding.collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueMinExample {

    public static void main(String[] args) {
        PriorityQueue<Integer> minPq = new PriorityQueue<>();

        minPq.add(5);
        minPq.add(2);
        minPq.add(8);
        minPq.add(1);
       // minPq.add();

      Iterator<Integer> iteratorObj = minPq.iterator();

      while(iteratorObj.hasNext())
      {
          int val = iteratorObj.next();
          System.out.println(val);
      }

      while(!minPq.isEmpty())
      {
         int val = minPq.poll();
          System.out.println("Removal from top : - " + val);

      }

    }
}
