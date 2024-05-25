package Session30thApril;

public class ExceptionHandling {
    public static void main(String[] args)  {

        divide();


    }

    public static void divide()
    {
        calculate();
    }

    static void calculate()
    {
        int x = 10;
        int y = 0;

        int result = x/y;

        System.out.println("Rest of the pragram executed no error");
    }


}
