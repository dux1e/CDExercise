
/**
 * Write a description of class Track here.
 *
 * @author Joakim Christensen
 * @version 01-10-2020
 */
public class Track {
    // Instance Variables
    private String title;
    private int playingTime;
    
    // Constructors
    public Track(String title, int playingTime) {
        this.title = title;
        this.playingTime = playingTime;
    }
    
    // Accessor Functions
    public String getTitle() {
        return title;
    }
    
    public int getPlayTime() {
        return playingTime;
    }
    
    // Mutator Functions
    public void setTitle(String title) {
        this.title = title;
    }
    
    public void setPlayingTime(int playingTime) {
        this.playingTime = playingTime;
    }
}
