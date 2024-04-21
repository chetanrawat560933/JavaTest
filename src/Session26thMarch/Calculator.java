package Session26thMarch;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x;
        int y;
        int z;



        int input = scanner.nextInt();

        switch (input)
        {
            case 1:
                System.out.println("Enter numbers to add");
                x = scanner.nextInt();
                y = scanner.nextInt();
                z = x + y;
                System.out.println(z);
                break;

            case 2:
                System.out.println("Enter numbers to minus");
                x = scanner.nextInt();
                y = scanner.nextInt();
                z = x - y;
                System.out.println(z);

                break;
            case 3:
                System.out.println("Enter numbers to multiply");
                x = scanner.nextInt();
                y = scanner.nextInt();
                z = x * y;
                System.out.println(z);
                break;

            default:
                System.out.println("No choice selected from add, subtract and multiply");

        }
    }
}
