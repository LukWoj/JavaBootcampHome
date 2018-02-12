package task1;

public class Dog extends Animal{

    public Dog(String name) {
        super(name);
    }

    @Override
    public void giveVoice() {
        System.out.println("Hau Hau");
    }
}
