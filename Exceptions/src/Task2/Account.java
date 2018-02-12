package Task2;

public interface Account {
    void deposit(int amount);
    void withdraw(int amount) throws InsufficientFundsException;

}
