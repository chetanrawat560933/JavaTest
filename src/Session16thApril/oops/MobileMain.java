package Session16thApril.oops;

public class MobileMain {

    public static void main(String[] args) {
        Mobile mobile = new Mobile("Samsung",256);
//        mobile.brand = "Iphone";
//        mobile.capacity = 128;

       // System.out.println(mobile);

        mobile.setBrand("Chetan");
        mobile.setCapacity(200);

     String m1 = mobile.getBrand();
     int m2 =  mobile.getCapacity();

        System.out.println(m1);
        System.out.println(m2);
    }


}
