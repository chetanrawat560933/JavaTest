package Session13thApril;

import java.util.Scanner;

public class Array2Demo {

    public static void main(String[] args) {

           Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//
//        int[] arr = new int[n];

        int[] arr = new int[5];
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = scanner.nextInt();

        }

        System.out.println("Elements of Array");
        for(int i = 0; i < arr.length; i++)
        {
            System.out.println(arr[i]);
        }







    }
}
