package Session6thApril;

public class Book {
    String author;
    int PublicationYear;
    String Genre;
    String Name;
    int price;

    Book()
    {
        Name = "Good To be Great";
        PublicationYear=2023;
        Genre="Non-Fiction";
        author="Jim Collins";
    }

    Book(String author, int PublicationYear, String Genre,String Name)
    {
       this.author = author;
       this.PublicationYear = PublicationYear;
       this.Genre = Genre;
       this.Name = Name;
    }

    public void AllInformation()
    {
        System.out.println(this.author);
        System.out.println(this.Name);
        System.out.println(this.Genre);
        System.out.println(this.PublicationYear);
        System.out.println(price);
    }





}
