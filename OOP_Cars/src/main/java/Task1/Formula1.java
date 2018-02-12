package Task1;

/**
 * Stworzyć klasę Formula1 zawierającą następujące pola:
 * - brand
 * - driver name
 * Klasa powinna posiadać konstruktor
 * wypełniający te pola oraz metody dostępowe. W metodzie
 * uruchomieniowej main stworzyć dwa bolidy, pobrać z nich informacje kto
 * i w czym siedzi i wypisać szczegółowo.
 *
 * /*
 *
 * //https://edux.pjwstk.edu.pl/mat/205/lec/Wyklad-MAS-nr-05.html#link3
   //https://edux.pjwstk.edu.pl/mat/205/lec/Wyklad-MAS-nr-05.html#link4*/

public class Formula1 {
    private String brand;
    private String driverName;

    public Formula1(String brand, String driverName) {
        this.brand = brand;
        this.driverName = driverName;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public String toString() {
        return "Bolid info: {" +
                brand + "  - " +
                driverName +
                '}';
    }
}
