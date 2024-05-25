package ConceptAndCoding.collections;


import java.util.Arrays;
import java.util.Comparator;



public class ComaparatorWithoutAnonymous implements Comparator<Integer> {
    @Override
    public int compare(Integer o1, Integer o2) {
        if( o2 > o1)
            return 1;
        else return -1;
    }

    public static void main(String[] args) {
        Comparator<Integer> com = new ComaparatorWithoutAnonymous();

        Integer a[] = {6,8,3,67,0};
       // Arrays.sort(a,com);
        Arrays.sort(a, com);

        for(int v : a)
        {
            System.out.println(v);
        }

//        for(int i = 0 ; i < a.length; i++)
//        {
//            System.out.println(a[i]);
//        }
    }
}
