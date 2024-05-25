package ConceptAndCoding.collections;

import java.util.Arrays;
import java.util.Comparator;

public class ComparatorAndComparable {

    public static void main(String[] args) {

        Comparator<Integer> com = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {

                if(o2 > o1)
                    return 1;
                else return -1;
            }
        };

        Integer a[] = {6,4,1,9,2};
        Arrays.sort(a, com);

        for(int i = 0 ; i < a.length; i++)
        {
            System.out.println(a[i]);
        }
    }
}
