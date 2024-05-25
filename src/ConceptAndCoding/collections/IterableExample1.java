package ConceptAndCoding.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IterableExample1 {

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();

        values.add(1);
        values.add(2);
        values.add(3);
        values.add(4);

        //Now, we need to iterate over the collection

        Iterator<Integer> iteratorObj = values.iterator();

        while(iteratorObj.hasNext())
        {
            int val = iteratorObj.next();
//            System.out.println(iteratorObj.next());
            System.out.println(val);

            if (val == 3)
            {
                iteratorObj.remove();
            }
        }

        System.out.println("Iterator the values using for each loop");

        for(int val : values)
        {
            System.out.println(val);
        }

        System.out.println("Now using for each method");

        values.forEach((Integer val) -> System.out.println(val));




    }


}
