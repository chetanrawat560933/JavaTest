package Session13thApril;

public class StringReverse {

    public static void main(String[] args) {

        String s1 = "pragra";

        char [] ch = s1.toCharArray();

        int i = 0;
        int length = ch.length;
        int j = length - 1;

        while(i < j)
        {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;
            i++;
            j--;
        }

        System.out.println(ch);




    }
}
