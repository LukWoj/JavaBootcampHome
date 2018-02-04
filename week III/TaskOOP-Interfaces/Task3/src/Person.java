
public class Person {

    private Saving saving;

    public Saving getSaving() {
        return saving;
    }

    public void setSaving(Saving saving) {
        this.saving = saving;
    }

    public void saveData(){
        saving.dataSaving();
    }
    public static void main(String[] args) {
        Database database = new Database();
        Cache cache = new Cache();

        Person p = new Person();

        p.setSaving(database);// referencja do Database
        p.saveData();

        p.setSaving(cache);// referencja do Cache
        p.saveData();
    }
}
