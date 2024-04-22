package Session6thApril;

public class DataParamterizedConstructor {

    int day;
    int month;
    int year;

    DataParamterizedConstructor(int day, int month, int year)
    {
          this.day = day;
          this.month = month;
          this.year = year;
    }

    public void printDate()
    {
        System.out.println("Date: " + day + " /" +month + " / " +year);
    }
}
