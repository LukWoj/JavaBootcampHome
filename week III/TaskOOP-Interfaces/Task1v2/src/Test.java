import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        List<Voice> animalList = new ArrayList<>();
        animalList.add(new Cat("Sphinx"));
        animalList.add(new Dog("Killer"));

        for (Voice animal : animalList) {
            animal.giveVoice();
        }
    }
}
