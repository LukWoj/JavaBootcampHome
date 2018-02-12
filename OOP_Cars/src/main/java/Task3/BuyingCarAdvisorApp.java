package Task3;

public class BuyingCarAdvisorApp {
    public static void main(String[] args) {
        Car car2 = new Car("Audi", "A3", 90000);
        Car car3 = new Car("Audi", "A4", 120000);
        Car car4 = new Car("Skoda", "Fabia", 60000);
        Car car5 = new Car("Skoda", "Octavia", 75000);
        Car car6 = new Car("Toyota", "Avensis", 100000);
        Car car7 = new Car("Toyota", "Yaris", 60000);
        Car car8 = new Car("Fiat", "Panda", 41000);

        Car[] carOffer1 = {car2, car4};
        Car[] carOffer2 = {car3, car5};
        Car[] carOffer3 = {car6, car7, car8};
        Dealer dealer1 = new Dealer("Scout24", "Łódź, Jana Pawła 16", carOffer1);
        Dealer dealer2 = new Dealer("Auta z Niemiec", "Łódź, Aleksandrowska 21", carOffer2);
        Dealer dealer3 = new Dealer("Leasing Cars", "Warszawa, Ostrobramska 24", carOffer3);
        Dealer[] dealers = {dealer1, dealer2, dealer3};
        BuyingCarAdvisor buyingCar = new BuyingCarAdvisor(dealers);
        BestCar bestOffer = buyingCar.findBestOffer();
        System.out.println("Najtańszy samochód to:");
        System.out.println(bestOffer.getBestCar().getBrand() + " " + bestOffer.getBestCar().getModel());
        System.out.println("Cena: " + bestOffer.getBestCar().getPrice() + " zł");
        System.out.println("Dealer: " + bestOffer.bestDealer.getName());
    }
}

