package Session16thApril;

public class StringBufferTest {

    public static void main(String[] args) {

        String s1 = new String("Mouse");
        System.out.println(s1);

        s1.concat(" keyboard");
        System.out.println(s1);  //It will pront mouse only, strings are immutable;
        System.out.println(s1.concat(" keyboard"));

        StringBuffer sb = new StringBuffer("Test");
        System.out.println(sb);

        //String s2 = new String("Chetan");

//        StringBuffer sb1 = new StringBuffer("Chetan");
//
//        sb1.a
//


    }
}
