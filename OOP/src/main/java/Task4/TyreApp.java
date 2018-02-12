package Task4;/*Stwórz klasę przechowalniaOpon która będzie służyła do przechowywania opon z zadania numer 3
        a) Dodaj pola : opona, x, y, z (gdzie x ,y ,z są współrzędnymi półek na magazynie)
        b) Zabezpiecz program aby dwóch opon nie było na tej jednej półce. Do 1 opony jedna półka.
        c) Dodaj metodę do programu która po podaniu współrzędnych poda klasę oponę.
        d) Stwórz przykładowy obiekt przechowalni opon i sprawdź jej działanie.*/

public class TyreApp {

    public static void main(String[] args) {
        Tyre t1 = new Tyre("175", "50", "14");
        Tyre t2 = new Tyre("195", "65", "15");

        TireStorage tireStorage = new TireStorage();
        tireStorage.addTyre(t1, 2, 2, 2);
        System.out.println(tireStorage.getTire(2, 2, 2));
        System.out.println(tireStorage.getTire(t1));

    }
}
