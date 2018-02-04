
public class Song {
    String artist;
    String name;

    private static int songQuantity;

    public Song() {
        songQuantity++;
    }

    public static int getSongQuantity() {
        return songQuantity;
    }

    public String getArtist() {
        return artist;
    }

    public String getName() {
        return name;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void getSongdescritpion() {
        System.out.println("Song: " + artist + " - " + name);
    }

}
