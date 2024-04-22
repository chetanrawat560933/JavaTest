package Session6thApril;

public class Person {

    String name;
    int age;

    public Person()
    {
        this("Unknown", 0);
    }

    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    public void printInfo()
    {
        System.out.println(this.name);
        System.out.println(this.age);
    }
}
