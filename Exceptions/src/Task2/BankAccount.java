package Task2;

public class BankAccount implements Account {
    private int amount;//kwota
    private int balance;//stan konta

    public BankAccount(int balance) {
        this.balance = balance;
    }


    @Override
    public void deposit(int amount) {   //wpłata
        if (amount <= 0) {
            throw new IllegalArgumentException("ammount must be > 0");
        }
        balance += amount;
    }


    @Override
    public void withdraw(int amount) throws InsufficientFundsException {  //wypłata
        if (getBalance() < amount) {
            throw new InsufficientFundsException("Not enough money");
        }
        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
