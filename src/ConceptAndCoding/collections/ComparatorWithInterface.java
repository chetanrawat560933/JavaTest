package ConceptAndCoding.collections;

import java.util.Arrays;

public class ComparatorWithInterface {

    public static void main(String[] args) {

        Integer a[] = {9,655,33,44};
        Arrays.sort(a, (Integer val1, Integer val2) -> val2 - val1);

        for (int v : a)
        {
            System.out.println(v);
        }
    }
}
