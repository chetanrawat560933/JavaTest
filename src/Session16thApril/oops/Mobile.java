package Session16thApril.oops;

public class Mobile {

   private String brand;
   private int capacity;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Mobile(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Mobile{" +
                "brand='" + brand + '\'' +
                ", capacity=" + capacity +
                '}';
    }


}
