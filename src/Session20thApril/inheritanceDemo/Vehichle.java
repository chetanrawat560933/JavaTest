package Session20thApril.inheritanceDemo;

public class Vehichle {

    String color;
    String make;
    String model;
    int speed;
    int year;

    public Vehichle(String color, String make, String model, int speed, int year) {
        this.color = color;
        this.make = make;
        this.model = model;
        this.speed = speed;
        this.year = year;
    }



    public void printCarDetails()
    {
        System.out.println("Color : " + color);
        System.out.println("Make : " + make);
        System.out.println("Model : " + model);
        System.out.println("Speed : " + speed);
        System.out.println("Year : " + year);
    }
}
