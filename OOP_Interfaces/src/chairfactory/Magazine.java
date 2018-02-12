package chairfactory;

public class Magazine implements ChairsReceiver {
    private int chairsStored;//chairs stored in magazine

    @Override
    public void receiveChairs(int chairs) {
        chairsStored += chairs;
    }

    public void showState() {
        System.out.println("Chairs stored in magazine: " + chairsStored);
    }
}
