package preplaced.covariantReturnType;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.makeSound();

        Dog dog  = new Dog();
        System.out.println(dog);
        dog.makeSound();

        Dog dog1 = new Dog();

        System.out.println(dog1);

        Animal animalRef = new Dog();

        System.out.println(animalRef);
    }
}
