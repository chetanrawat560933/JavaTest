package Session30thApril.customException;

public class BankMain {

    public static void main(String[] args) {
        Bank bank = new Bank();

        double balance = bank.getBalance();
        System.out.println("Current Balance: - " + balance);

        double updatedBalance = bank.deposit(1000);
        System.out.println(updatedBalance);

        double balanceWithdrawl = 0;
        try {
            balanceWithdrawl = bank.withdrawl(5000);
        } catch (Exception e) {
            System.out.println(e);
        }


        System.out.println(balanceWithdrawl);

        //withdrawl amount > balance amount---> it should not be done then


    }
}
