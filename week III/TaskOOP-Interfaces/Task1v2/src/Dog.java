public class Dog implements Voice {

    private String name;

    public Dog(String name) {

        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void giveVoice() {
        System.out.println("Hau Hau");
    }
}
