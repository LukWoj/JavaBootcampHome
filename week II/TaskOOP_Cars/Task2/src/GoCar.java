public class GoCar {
    public static void main(String[] args) {
        Person dad = new Person("Janusz", 45);
        Person child = new Person("Wojtek", 12);

        Car gocart = new Car(child, dad);
        gocart.go();

        Car taxiCar = new Car(dad, child);
        taxiCar.go();

    }
}
