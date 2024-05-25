package Session27thApril;

public interface Furniture {

    int numOfLegs = 4;
    void area();
    void perimeter();
    void material();

}

class Chair implements Furniture
{

    @Override
    public void area() {
        System.out.println("Area of Chair");
    }

    @Override
    public void perimeter() {
        System.out.println("perimeter of chair");
    }

    @Override
    public void material() {
        System.out.println("Material of Chair");
    }
}

class Main
{
    public static void main(String[] args) {
        Furniture furniture = new Chair();
        furniture.area();
        furniture.material();
        furniture.material();
    }
}
