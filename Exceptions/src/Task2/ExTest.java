package Task2;

/**
 * Stwórz konto bankowe z metodami deposit,
 * withdraw, konstruktorem. Metoda withdraw
 * powinna obsługiwać własny wyjątek
 * InsufficientFundsException.
 */
public class ExTest {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(20000);

        bankAccount.withdraw(30000);
        System.out.println(bankAccount.getBalance());
    }

}
