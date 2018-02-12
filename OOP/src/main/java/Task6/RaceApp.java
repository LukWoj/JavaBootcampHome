package Task6;

public class RaceApp {
    public static void main(String[] args) {
        Race race = new Race();
        Car car = new Car();

        Car car1 = new Car("Opel", "Insignia", 6.2, 2.5);
        Car car2 = new Car("Audi", "A6", 3, 3.5);
        Car car3 = new Car("Toyota", "Avensis", 8.0, 2.0);

        race.addCompetitor(car1);
        race.addCompetitor(car2);
        race.addCompetitor(car3);
        race.printCompetitors();
        race.printWinner();
    }
}

