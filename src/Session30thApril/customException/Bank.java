    package Session30thApril.customException;

    public class Bank {

        double balance = 1500;

        double getBalance()
        {
            return balance;
        }

        double deposit( int depositamount)
        {
            balance = balance + depositamount;
            return balance;

        }

        double withdrawl(double withdrawlAmount)
        {
            if (withdrawlAmount > balance)
            {

                //throw --> When you want to throw an Exception, create an exception
                //throws --> delegating your exception handling, whoever is going to call that method
             //   throw new RuntimeException("Insufficient Balance");
                throw new InsufficientBalanceException("Insufficient Balance");
            } 
            balance = balance - withdrawlAmount;
            return balance;
        }
    }
