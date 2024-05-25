package Session23rdApril.abstraction;

public abstract class BankOfCanada {

    int x;

    public BankOfCanada(int x) {
        this.x = x;
        System.out.println(x);
    }

    public abstract double rateOfInterest();

}

class Scotiabank extends BankOfCanada
{
    int y;

    public Scotiabank(int x, int y) {
        super(x);
        this.y = y;
        System.out.println(y);
    }

    @Override
    public double rateOfInterest() {
       // System.out.println("Rate of Interest for Scotai is 9.5");
        return 7.5;
    }
}

class RBC extends BankOfCanada
{

    public RBC(int x) {
        super(x);
    }

    @Override
    public double rateOfInterest() {
       // System.out.println("Rate of Interest for bank is 10.5");
        return 5.6;
    }


    public static void main(String[] args) {

        BankOfCanada b;

        b = new Scotiabank(1,2);
        System.out.println(b.rateOfInterest());

        b = new RBC(4);
        System.out.println(b.rateOfInterest());
//        BankOfCanada bank = new Scotiabank();
//        //bank.rateOfInterest();
//        System.out.println(bank.rateOfInterest());
//
//        BankOfCanada bank = new RBC();
//        bank.rateOfInterest();


    }
}





