package Session20thApril.encapsulation;

public class Restaurant {

   private String name;
   private boolean isDiningAllowed;
    private String menu;
   private String address;

    public Restaurant(String name, boolean isDiningAllowed, String menu, String address) {
        this.name = name;
        this.isDiningAllowed = isDiningAllowed;
        this.menu = menu;
        this.address = address;
    }

    public void printRestaurantDetails()
    {
        System.out.println(name);
        System.out.println(isDiningAllowed);
        System.out.println(name);
        System.out.println(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDiningAllowed() {
        return isDiningAllowed;
    }

    public void setDiningAllowed(boolean diningAllowed) {
        isDiningAllowed = diningAllowed;
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", isDiningAllowed=" + isDiningAllowed +
                ", menu='" + menu + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
