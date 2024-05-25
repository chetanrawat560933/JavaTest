package Session20thApril.inheritanceDemo;

public class Car extends Vehichle {

    double price;

    public Car(String color, String make, String model, int speed, int year, double price) {
        super(color, make, model, speed, year);
        this.price = price;
    }

    public void printCarDetails()
    {
        System.out.println("Car Details");
//        System.out.println("Color : " + color);
//        System.out.println("Make : " + make);
//        System.out.println("Model : " + model);
//        System.out.println("Speed : " + speed);
//        System.out.println("Year : " + year);

    }

    public void printCar()
    {
        System.out.println(super.year);
        System.out.println(super.model);
    }


}
