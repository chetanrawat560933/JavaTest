package Session6thApril;

import Session26thMarch.Calculator;

public class CalculatorOverloading {


    public int sum(int a, int b)
    {
        return a+b;
    }

    public int sum(int a, int b, int c)
    {
        return a+b+c;
    }

    public int sum(int a, int b, int c, int d)
    {
        return a+b+c+d;
    }

    public static void main(String[] args) {
        CalculatorOverloading cal = new CalculatorOverloading();

        int calsum = cal.sum(2,4);

        System.out.println(calsum);
    }

}
