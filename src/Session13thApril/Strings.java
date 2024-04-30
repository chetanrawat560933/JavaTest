package Session13thApril;

import java.sql.SQLOutput;

public class Strings {

    public static void main(String[] args) {
        //Strings are nothing, just the character array

        //String str = "abc" is equivalent to char[] data = {"a", "b", "c"};

        String s1 = "Test"; //String literal

        String s2 = "Test";

        String s3 = new String("Test") ; // using new keyword

     //   String s4 = "test";

        //System.out.println(s1 == s4); //false


        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        System.out.println(s1 == s2);
        System.out.println(s1.equals(s3));
        System.out.println(s1==s3);

    }


}
