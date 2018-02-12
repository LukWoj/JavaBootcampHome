package wallet;

public class WalettApp {

    public static void main(String[] args) {

        Wallet sonWallet = new Wallet(0, "son");
        Wallet fatherWallet = new Wallet(0, "father");

        sonWallet.addToWallet(10, MoneyType.PLN);
        sonWallet.addToWallet(50, MoneyType.GR);
        sonWallet.addToWallet(0.5, MoneyType.KILO);
        sonWallet.substractFromWallet(100, MoneyType.PLN);

        fatherWallet.addToWallet(10, MoneyType.PLN);
        fatherWallet.addToWallet(50, MoneyType.GR);
        fatherWallet.addToWallet(0.5, MoneyType.KILO);
        fatherWallet.substractFromWallet(100, MoneyType.PLN);

        System.out.println(sonWallet);
        System.out.println(fatherWallet);


    }
}
