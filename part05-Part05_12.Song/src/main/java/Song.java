
public class Song {

    private String artist;
    private String name;
    private int durationInSeconds;

    public Song(String artist, String name, int durationInSeconds) {
        this.artist = artist;
        this.name = name;
        this.durationInSeconds = durationInSeconds;
    }
    
    public boolean equals(Object song){
        if(this==song){
            return true;
        }
        if(!(song instanceof Song)){
        return false;
        }
        Song song1 = (Song) song;
        if(this.artist==song1.artist && this.name==song1.name && this.durationInSeconds==song1.durationInSeconds){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return this.artist + ": " + this.name + " (" + this.durationInSeconds + " s)";
    }


}
