package Session23rdApril.methodOverriding;

public class Rectangle extends Shape {

int length;

int breadth;

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void getArea()
    {
        System.out.println(length * breadth);
    }
}
