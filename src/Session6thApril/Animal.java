package Session6thApril;

public class Animal {

    String color;
    double height;

    Animal()
    {
        color="Black";
        height= 6.7;
    }

    public void walk(){
        System.out.println("Walk");
        System.out.println(color);
        System.out.println(height);
    };

    public void talk(){System.out.println("Talk");};
    public void eat(){};
    public void makesound(){};



    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.walk();


    }
}
