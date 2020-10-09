
/**
 * Write a description of class CD here.
 *
 * @author Joakim Christensen
 * @version 01-10-2020)
 */
import java.util.ArrayList;
import java.util.Iterator;
public class CD {
    // Instance Variables
    private int cdNumber;
    private String title;
    private String year;
    private ArrayList<Track> tracks;

    // Constructors
    public CD(int cdNumber, String title, String year) {
        this.cdNumber = cdNumber;
        this.title = title;
        this.year = year;
        tracks = new ArrayList<>();
    }

    // Accessor Functions
    public int getCdNumber() {
        return cdNumber;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }

    public Track getLongestTrack() {
        int maxIndex = 0;
        Track track = tracks.get(0);
        int maxLength = track.getPlayTime();
        int i = 0;
        while(i < tracks.size()) {
            track = tracks.get(i);
            if(track.getPlayTime() > maxLength) {
                maxLength = track.getPlayTime();
                maxIndex = i;
            } else {
                i++;
            }
        }
        track = tracks.get(maxIndex);
        return track;
    }
    
    public double getAvaragePlayTime() {
        // Count total play time of tracks
        double total = 0;
        for(Track t : tracks) {
           total = total + t.getPlayTime();
        }
        // Count number of tracks
        double count = 0; //Her kan man bruge tracks.size();  i stedet for at lave en counter
        for(Track t : tracks) {
            count++;
        }
        // Return the average play time
        double average = total / count;
        return average;
    }
    
    private double getAveragePlayTimeShort() {
        double average = getTotalPlayTime() / tracks.size();
        return average;
    }
    
    public int getAmountOflTracks(int time) {
        int count = 0;
        for(Track t : tracks) {
            if(t.getPlayTime() > time) {
                count++;
            }
        }
        return count;
    }
    
    public int getTotalPlayTime() {
        int total = 0;
        for(Track t : tracks) {
            total += t.getPlayTime();
        }
        return total;
    }

    // Mutator Functions
    public void setCdNumber(int cdNumbere) {
        this.cdNumber = cdNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public void addTracks(Track track) {
        tracks.add(track);
    }
}
