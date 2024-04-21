package Session30thMarch;

import java.util.Scanner;

public class LotteryDemo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter the number of chances you want");

        int x = scanner.nextInt();

        for(int i = 1; i<=x; i++)
        {
            System.out.println("Please Enter number between 1-100");

            int y = scanner.nextInt();

            if(y == 55)
            {
                System.out.println("Lucky Winner");
            } else {
                System.out.println("Better Luck next time");
            }
        }






    }
}
