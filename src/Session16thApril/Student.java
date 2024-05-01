package Session16thApril;

public class Student {

    String name;
    int id;

    public Student(String name, int id)
    {
        this.name = name;
        this.id = id;
    }

    public String toString()
    {
        return "Student {" +
                " name " + name  + " , id " + id + "}";
    }

}
