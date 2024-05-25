package ConceptAndCoding.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class CollectionExample {

    public static void main(String[] args) {
        List<Integer> values = new ArrayList<>();
        values.add(2);
        values.add(3);
        values.add(4);

        //size
        System.out.println("size: " + values.size());

        //isEmpty
        System.out.println("isEmpty: " + values.isEmpty());

        //contains
        System.out.println("contains: " + values.contains(5));

        //add
        values.add(5);
        System.out.println("added: "+ values.contains(5));

        //remove using index
        values.remove(3);
        System.out.println("REMOVED USING INDEX: " + values.contains(3));

        //remove using object
        values.remove(Integer.valueOf(3));
        System.out.println("Removed using Object "+ values.contains(3));



        //Now, creating a new collection

        Stack<Integer> stackValues = new Stack<>();

        stackValues.add(6);
        stackValues.add(7);
        stackValues.add(8);

        //addAll
        values.addAll(stackValues);
        System.out.println("addAll test using containsAll" + values.containsAll(stackValues));

        //conatins All
        values.remove(Integer.valueOf(7));
        System.out.println("contains All after removing one element" + values.containsAll(stackValues));

        //remove all

        values.removeAll(stackValues);
        System.out.println("remove All" + values.contains(8));

        //clear

        values.clear();

        System.out.println("clear: " + values.isEmpty());

        System.out.println(stackValues);



    }
}
