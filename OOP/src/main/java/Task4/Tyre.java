package Task4;

public class Tyre {
    /**
     * Stwórz klasę Opona.
     * a)Stwórz w niej 3 pola :szerokość, profil, średnica
     * oraz konstruktor 3 parametrowy.
     * b)Stwórz metodę która zwraca String skrót opony. [175/70 R15] legenda:   ["szerokość" / "profil""Średnica " ]
     * c)Stwórz przykładowe obiekty
     */
    private String width;
    private String profile;
    private String diameter;

    public Tyre(String width, String profile, String diameter) {
        this.width = width;
        this.profile = profile;
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        StringBuilder desc = new StringBuilder();
        desc.append("[");
        desc.append(width);
        desc.append("/");
        desc.append(profile);
        desc.append(" R");
        desc.append(diameter);
        desc.append("]");
        desc.append("---> [szerokość/profil R średnica]");
        return desc.toString();
    }
}
