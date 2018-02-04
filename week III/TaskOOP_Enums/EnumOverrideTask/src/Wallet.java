public class Wallet {
    private double walletBalance;
    private String owner;

    public Wallet(double startingMoney, String owner) {
        this.walletBalance = startingMoney;
        this.owner = owner;
    }

    public void addToWallet(double money, MoneyType moneyType) {
        walletBalance = walletBalance + money * moneyType.getScaler();
    }

    public void substractFromWallet(double moneySpend, MoneyType moneyType) {
        setWalletBalance(getWalletBalance() - moneySpend * moneyType.getScaler());
    }

    public double getWalletBalance() {
        return walletBalance;
    }

    private void setWalletBalance(double walletBalance) {
        this.walletBalance = walletBalance;
    }

    public String getOwner() {
        return owner;
    }

    @Override
    public String toString() {
        return String.format("%s wallet balance:\n\t\t " +
                "KILO = %s\n\t\t PLN = %s\n\t\t GR = %s\n\t\t", getOwner(), walletBalance / 1000, walletBalance * 1.0, walletBalance * 100);
    }


}
