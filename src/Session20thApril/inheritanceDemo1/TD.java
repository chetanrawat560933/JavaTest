package Session20thApril.inheritanceDemo1;

public class TD extends BankOfCanada {

    int minimumDeposit;
    int fees;


    public TD(String accountInfo, int accountNumber, double mortageRate, int minimumDeposit, int fees) {
        super(accountInfo, accountNumber, mortageRate);
        this.minimumDeposit = minimumDeposit;
        this.fees = fees;
    }



 //   public TD(double mortageRate, int minimumDeposit, int fees) {
//        super(mortageRate);
//        this.minimumDeposit = minimumDeposit;
//        this.fees = fees;
//    }


    public void printTDinfo()
    {
        System.out.println(minimumDeposit);
        System.out.println(fees);
    }
}


