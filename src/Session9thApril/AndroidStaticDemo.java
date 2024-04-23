package Session9thApril;

public class AndroidStaticDemo {
    String brand;
    int capacity;
    static String os = "Android";

    public AndroidStaticDemo(String brand, int capacity) {
        this.brand = brand;
        this.capacity = capacity;

    }

    public void displayInfo()
    {
        System.out.println(brand);
        System.out.println(capacity);
        System.out.println(os);
    }

    public static void main(String[] args) {
        AndroidStaticDemo a1 = new AndroidStaticDemo("Mofk",126);
        AndroidStaticDemo a2 = new AndroidStaticDemo("Mcwfwefwefw",222);

        a1.displayInfo();
        a2.displayInfo();

    }
}
