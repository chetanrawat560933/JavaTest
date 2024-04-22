package Session6thApril;

public class Car {

    String color;
    String brand;
    double price;

    Car() {
        //  System.out.println("Hello From Constructor");
        color = "Blue";
        brand = "Hyundai";
        price = 10000;
    }

public void displayInfo()
{
    System.out.println(color);
    System.out.println(brand);
    System.out.println(price);
}

}
