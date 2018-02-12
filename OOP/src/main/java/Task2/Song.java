package Task2;

public class Song {
    String artist;
    String name;

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

    public void getSongdescritpion(){
        System.out.println("Song: " + artist + " - " + name );
    }

}
