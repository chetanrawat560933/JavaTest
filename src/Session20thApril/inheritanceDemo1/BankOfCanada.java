package Session20thApril.inheritanceDemo1;

public class BankOfCanada extends Bank {

    double mortageRate;

    public BankOfCanada(String accountInfo, int accountNumber, double mortageRate) {
        super(accountInfo, accountNumber);
        this.mortageRate = mortageRate;
    }

    public void printMortgageRate()
    {
        System.out.println(mortageRate);
    }
}
