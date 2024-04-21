package Session26thMarch;

import java.util.Scanner;

public class SwitchDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = scanner.nextInt();

        switch(input)
        {
            case 1:
            System.out.println("Switch on the Fan");
            break;

            case 2:
                System.out.println("Switch on Red Bulb");
                break;
            case 3:
                System.out.println("Switch on the Green Bulb");

            default:
                System.out.println("Nothing Found");


        }



    }
}
