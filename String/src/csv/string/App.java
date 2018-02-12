package csv.string;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        String sentence = "Michael Faraday;Edmond Halley;Clair Petterson";

        List<Person> personList = personCreator(sentence);
        for (Person p : personList) {
            System.out.println(p);
        }
    }

    public static List<Person> personCreator(String sentence) {
        String[] s = sentence.split(";");
        ArrayList<Person> personList = new ArrayList<>(3);
        String name = " ";
        String surname = " ";

        for (int i = 0; i < s.length; i++) {
            String[] person = s[i].split(" ");
            name = person[0];
            surname = person[1];
            personList.add(new Person(name, surname));
        }
        return personList;
    }
}
//person table
   /* public static void personCreator(String sentence) {
        String[] s = sentence.split(";");
        Person[] p = new Person[s.length];
        String name = " ";
        String surname = " ";
        for (int i = 0; i < s.length; i++) {
            String[] s2 = s[i].split(" ");
            for (int j = 0; j < 2; j++) {
                name = s2[0];
                surname = s2[1];
                p[i] = new Person(name, surname);
            }
            System.out.println(new Person(name, surname));
            //return new Person(name,surname);
        }

    }*/

// stream
   /* private static void m(String sentence) {
        String[] s = sentence.split(";");
        List<String> names = Arrays.asList(s);
        List<Person> p = names.stream().map(Person::new)
                .collect(Collectors.toList());

        System.out.println(p.get(0));
        System.out.println(p.get(1));
        System.out.println(p.get(2));
    }*/



