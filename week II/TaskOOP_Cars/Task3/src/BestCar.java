public class BestCar {
    Dealer bestDealer;
    Car bestCar;

    public BestCar(Dealer bestDealer, Car bestCar) {
        this.bestDealer = bestDealer;
        this.bestCar = bestCar;
    }

    public Dealer getBestDealer() {
        return bestDealer;
    }

    public void setBestDealer(Dealer bestDealer) {
        this.bestDealer = bestDealer;
    }

    public Car getBestCar() {
        return bestCar;
    }

    public void setBestCar(Car bestCar) {
        this.bestCar = bestCar;
    }
}
