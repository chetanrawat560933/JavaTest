package Session30thMarch;

import java.util.Scanner;

public class loopPractice {

    public static void main(String[] args) {

        //print numbers from 1 to 10, and calculate sum of those numbers

//        int sum = 0;
//
//        for(int i = 0; i <=10; i++)
//        {
//            sum = sum + i;
//        }
//
//        System.out.println(sum);


        // DO while loop

//        int counter = 1;
//        int sum = 0;
//        do {
//            System.out.println(counter);
//            sum = sum + counter;
//        }while(counter <=10);


//print numbers from 1 -n, calculate the sum upto n
        
        Scanner scanner = new Scanner(System.in);

        int y = scanner.nextInt();

        int sum = 0;


        for(int i =1; i<=y; i++)
        {
            sum = sum + i;
        }

        System.out.println(sum);


        
        






    }
}
