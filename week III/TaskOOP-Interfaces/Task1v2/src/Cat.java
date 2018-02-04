public class Cat implements Voice {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void giveVoice() {
        System.out.println("Miau Miau");
    }
}
