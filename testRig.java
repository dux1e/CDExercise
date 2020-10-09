

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class testRig.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class testRig
{
    private Track track1;
    private Track track2;
    private Track track3;
    private Track track4;
    private Track track5;
    private CD cD1;
    private CDCollection cDCollec1;
    private Track tribute;
    private Track beelzeboss;
    private Track theMetal;
    private Track kickapoo;
    private CD tenac;

    
    
    
    
    
    
    
    
    
    
    
    

    
    
    
    
    
    
    

    
    
    
    
    
    

    /**
     * Default constructor for test class testRig
     */
    public testRig()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
        track1 = new Track("New World Torture", 281);
        track2 = new Track("Your Evolution", 288);
        track3 = new Track("Brainwashed", 209);
        track4 = new Track("We Are Alive at Night", 64);
        track5 = new Track("Our Legacy", 248);
        cD1 = new CD(1, "Brainwashed", "2017");
        cD1.addTracks(track1);
        cD1.addTracks(track2);
        cD1.addTracks(track3);
        cD1.addTracks(track4);
        cD1.addTracks(track5);
        cDCollec1 = new CDCollection();
        cDCollec1.addCD(cD1);
        cDCollec1.getAvaragePlayTimeCollection();
        tribute = new Track("Tribute", 248);
        beelzeboss = new Track("Beelzeboss", 335);
        theMetal = new Track("The Metal", 186);
        kickapoo = new Track("Kickapoo", 254);
        tenac = new CD(2, "Tenacious D", "2017");
        tenac.addTracks(tribute);
        tenac.addTracks(beelzeboss);
        tenac.addTracks(theMetal);
        tenac.addTracks(kickapoo);
        tenac.getAvaragePlayTime();
        tenac.getAvaragePlayTime();
        cDCollec1.addCD(tenac);
        cDCollec1.getLognestTrackTitleByCdName("Tenacious D");
        cDCollec1.getLognestTrackTitleByCdName("Tenacious D");
        tenac.getTitle();
        tenac.setTitle("tenac");
        tenac.getTitle();
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
}
