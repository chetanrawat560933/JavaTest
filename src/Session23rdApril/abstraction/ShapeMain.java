package Session23rdApril.abstraction;

public class ShapeMain {

    public static void main(String[] args) {

        //We can not do this because we can not instantiate Abstract class
       // Shape shape = new Shape();
        Shape shape = new Square();

        shape.getArea();
    }
}
