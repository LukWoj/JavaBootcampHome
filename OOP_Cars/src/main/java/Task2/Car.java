package Task2;

public class Car {
    private Person driver;
    private Person passenger;

    public Car(Person driver, Person passenger) {
        this.driver = driver;
        this.passenger = passenger;
    }

    public void go(){
        if(driver.getAge()>= 18) {
            System.out.println("GO!!");
            System.out.println("Driver name: " + driver.getName());
            System.out.println("Passenger name: " + passenger.getName());
        } else {
            System.out.println("STOP!!");
            System.out.println("You are not allowed to drive");
        }
    }
}
