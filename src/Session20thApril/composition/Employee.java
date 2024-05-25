package Session20thApril.composition;

public class Employee {
    int id;
    String name;
    double salary;
   // String address;

    //Creating an address class, and refer it to the address

    Address address;

    public Employee(int id, String name, double salary, Address address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

//    public Employee(int id, String name, double salary,String address) {
//        this.id = id;
//        this.name = name;
//        this.salary = salary;
//        this.address = address;
//    }

    public void printEmployeeDetails()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(salary);
        System.out.println(address);
    }
}
