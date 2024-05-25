package preplaced.covariantReturnType;

import org.w3c.dom.ls.LSOutput;

public class Animal {

    public Animal makeSound()
    {
        System.out.println("The Animal makes the sound");
        return this;
    }
}

class Dog extends Animal
{

    public Dog makeSound()
    {
        System.out.println("The Dog Barks");
        return this;
    }

}
