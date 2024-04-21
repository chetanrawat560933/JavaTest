package Session2ndApril;


import com.sun.jdi.PathSearchingVirtualMachine;

class Rectangle
{
    int l;
    int b;
//    public void calculateArea(int length, int breadth)
//    {
//        l = length;
//        b = breadth;
//        int area = l*b;
//
//        System.out.println(area);
//    }

    public int calculateArea(int length, int breadth)
    {
        int area = length * breadth;
        return area;
    }

    public void calculatePerimeter(int length, int breadth)
    {
        l = length;
        b = breadth;
        int perimeter = 2*(l + b);
        System.out.println(perimeter);
    }
}

public class Area {

    public static void main(String[] args) {

        Rectangle rc = new Rectangle();

        int out = rc.calculateArea(3,2);
        System.out.println(out);

        rc.calculatePerimeter(2,3);

    }
}
