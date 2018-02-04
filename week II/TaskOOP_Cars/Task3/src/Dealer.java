public class Dealer {

    private String name;
    private String address;
    private Car[] carMagazine;

    public Dealer(String name, String address, Car[] cars) {
        this.name = name;
        this.address = address;
        carMagazine = cars;
    }

    public Car[] getCarMagazine() {
        return carMagazine;
    }

    public String getName() {
        return name;
    }
}
