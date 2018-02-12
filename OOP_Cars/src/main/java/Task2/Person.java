package Task2;

/**
 * Stworzyć klasę Person zawierającą pola name oraz
 * age i stworzyć obiekty tej klasy: dad oraz child
 * Stworzyć klasę Car (klasa reprezentuje dwuosobowy
 * samochód sportowy z dwoma osobnymi polami dla każdego
 * miejsca: miejsce kierowcy, miejsce pasażera).
 * Klasa Car niech posiada również metodę : go()
 * - która wypisze kto pojechał samochodem i kto prowadził
 * (zajmuje miejsce kierowcy); Klasa powinna posiadać konstrukor
 * przyjmujący dwa obiekty typu Person. Zapakować ojca i dziecko
 * do auta tylko rozsądnie... niech dziecko nie prowadzi samochodu.
 * Napisać logikę w metodzie go() kalsy Car, która nie pozwoli pojechać
 * jeżeli za kółkiem siedzi osoba niepełnoletnia
 * i wypisze odpowiedni komunikat.
 */
public class Person {

    private String name;
    private int age;



    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
