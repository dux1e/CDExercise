
/**
 * Write a description of class CDCollection here.
 *
 * @author Joakim Christensen
 * @version 01-10-2020
 */
import java.util.ArrayList;
import java.util.Iterator;
public class CDCollection {
    // Instance Variables
    private ArrayList<CD> cds;

    // Constructors
    public CDCollection() {
        this.cds = new ArrayList<>();
    }

    // Accessor Functions
        public int getAmountOfTracksOverFourMinutes() {
        int count = 0;
        for(CD cd : cds) {
            cd.getAmountOflTracks(240);
            count = cd.getAmountOflTracks(240);
        }
        return count;
    }
    
    public void getTotalPlayTimeCdName(String title) {
        Iterator<CD> it = cds.iterator();
        int playTime = 0;
        while(it.hasNext()) {
            CD cd = it.next();
            if(cd.getTitle().equalsIgnoreCase(title)) {
                playTime = cd.getTotalPlayTime();
            }
        }
        System.out.println("The cd " + title + " has a total play time of " + playTime + " seconds");
    }
   
    public double getAvaragePlayTimeCollection() {
        double averageOld = 0;
        for(CD cd : cds) {
            averageOld += cd.getAvaragePlayTime();
        }
        int count = 0;
        for(CD cd : cds) {
            count++;
        }
        double averageNew = averageOld / count;
        return averageNew;
    }
    
    public void getLognestTrackTitleByCdName(String title) {
        CD cd = cds.get(0);
        String trackTitle = cd.getLongestTrack().getTitle();
        int i = 0;
        int maxi = 0;
        while(i < cds.size() ) {
            cds.get(i);
            if(cd.getTitle().equalsIgnoreCase(title)) {
                trackTitle = cd.getLongestTrack().getTitle();
                maxi = i;
            } else {
                i++;
            }
        }
        cd = cds.get(maxi);
        trackTitle = cd.getLongestTrack().getTitle();
        System.out.println("The track with the title: " + trackTitle + " is the longest of: " + title);
    }
    
    // Mutator Functions
    public void addCD(CD cd) {
        cds.add(cd);
    }

    public void removeTrack(String title) {
        Iterator<CD> it = cds.iterator();
        while(it.hasNext()) {
            CD cd = it.next();
            if(cd.getTitle().equalsIgnoreCase(title)) {
                it.remove();
            }
        }
    }
}
