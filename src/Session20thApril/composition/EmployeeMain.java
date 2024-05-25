package Session20thApril.composition;

public class EmployeeMain {

    public static void main(String[] args) {


        Address address = new Address("Thistle Down Circle","Mississauga","Canada","L5C3K5");

        Employee employee = new Employee(101,"Chetan",50000, address);

        System.out.println(employee.address.street);
    }

//    Employee employee = new Employee(101, "Chetan",100000," 101 Mississauga thiste down circle");
//    Employee employee1 = new Employee(101, "Chetan",100000," 1021 Mississauga wood drive");

    //Now this is too hectic, we can create an address as a separate entitiy..





}
