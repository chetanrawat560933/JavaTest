package Session30thApril.customException;

public class InsufficientBalanceException extends RuntimeException {
    public InsufficientBalanceException(String message)
    {
        super(message);
    }
}
