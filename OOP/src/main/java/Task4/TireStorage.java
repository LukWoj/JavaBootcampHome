package Task4;

public class TireStorage {
    //współrzędne półek
    int x = 0;//wiersz
    int y = 0;//kolumna
    int z = 0;//glebokosc
    private Tyre[][][] storage;

    public TireStorage() {
        this.storage = new Tyre[10][10][10];
    }

    public TireStorage(int x, int y, int z) {// połki w magazynie
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public void addTyre(Tyre tyre, int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
        if (storage[x][y][z] == null) {
            storage[x - 1][y - 1][z - 1] = tyre;
            System.out.println("Dodano opone");
        } else {
            System.out.println("Miejsce magazynowe zajęte");
        }
    }

    public Tyre getTire(int x, int y, int z) {
        return storage[x - 1][y - 1][z - 1];
    }

    public Tyre getTire(Tyre tire) {
        return tire;
    }
}
