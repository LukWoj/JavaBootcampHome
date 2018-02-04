import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Animal> animalList = new ArrayList<>();
        animalList.add(new Cat("Sphinx"));
        animalList.add(new Dog("Killer"));

        for (Animal animal : animalList) {
           animal.giveVoice();
        }

    }
}
