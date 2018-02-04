public class BuyingCarAdvisor {
    private Dealer[] dealerBase;

    public BuyingCarAdvisor(Dealer[] dealerBase) {
        this.dealerBase = dealerBase;
    }

    public BestCar findBestOffer() {
        Car bestCar = null;
        Dealer bestDealer = null;
        double bestPrice = 1000000000;
        for (Dealer dealer : dealerBase) {
            for (Car car : dealer.getCarMagazine()) {
                if (car.getPrice() < bestPrice) {
                    bestPrice = car.getPrice();
                    bestCar = car;
                    bestDealer = dealer;
                }
            }
        }
        return new BestCar(bestDealer, bestCar);
    }
}
