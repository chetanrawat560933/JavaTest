package Session23rdMarch;

import java.util.Scanner;

public class ScannerInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the value of x : ");
        int x = scanner.nextInt();

        System.out.println("Enter the value of y : ");
        int y = scanner.nextInt();

        int sum = x + y;

        System.out.println(sum);
    }
}
