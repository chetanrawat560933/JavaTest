package Session30thApril;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckedException {

    public static void main(String[] args) {

        File file = new File("noFile.txt");

        try {
            Scanner sc = new Scanner(file);

        } catch(FileNotFoundException e) {
            System.out.println("File not present Exception, it is run time exception");

        }

    }
}
