package Session23rdApril.methodOverriding;

import static java.lang.Math.*;

public class Circle {

    private final double PI = 3.14;

    int r;

    public Circle(int r) {
        this.r = r;
    }

    public void getArea()
    {
        System.out.println(PI * r *r);
    }

}
