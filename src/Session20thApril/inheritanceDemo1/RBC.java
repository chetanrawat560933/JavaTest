package Session20thApril.inheritanceDemo1;

public class RBC extends BankOfCanada{

    int minimumDeposit;
    int fees;

    public RBC(String accountInfo, int accountNumber, double mortageRate, int minimumDeposit, int fees) {
        super(accountInfo, accountNumber, mortageRate);
        this.minimumDeposit = minimumDeposit;
        this.fees = fees;
    }

    //    public RBC(double mortageRate, int minimumDeposit, int fees) {
//        super(mortageRate);
//        this.minimumDeposit = minimumDeposit;
//        this.fees = fees;
//    }



    public void printRBCaBankInfo()
    {
        System.out.println(accountInfo);
        System.out.println(accountNumber);
        System.out.println(minimumDeposit);
        System.out.println(fees);
        System.out.println(mortageRate);
    }
}


