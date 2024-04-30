package Session13thApril;

import org.w3c.dom.ls.LSOutput;

public class ReverseArray {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5,6,7,8};

                int i = 0;
        int j = arr.length - 1;

        while(i < j)
        {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j]= temp;

            i++;
            j--;
        }

        for (int z = 0; z<arr.length; z++)
        {
            System.out.print(arr[z] + " ");
        }
        System.out.println();
    }



}
