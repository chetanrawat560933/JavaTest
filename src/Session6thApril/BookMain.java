package Session6thApril;

public class BookMain {

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("Robwrt", 2021, "motivation", "Rich Dad poor Dad");

        b1.AllInformation();
        b2.AllInformation();
    }

}
