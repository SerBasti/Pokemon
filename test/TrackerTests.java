import org.junit.Test;

import static org.junit.Assert.*;

public class TrackerTests {

    @Test
    public void emptyTracker(){
        Tracker tracker = new Tracker();
        assertEquals(1, tracker.getPathSize());
    }

    @Test
    public void simpleTrackerPath(){
        Tracker tracker = new Tracker();
        try{
            tracker.followPath('N');
            tracker.followPath('N');
            tracker.followPath('N');
            tracker.followPath('N');
        }catch (Exception e){
            fail("No exception should be thrown");
        }

        assertEquals(5, tracker.getPathSize());
    }

    @Test
    public void standardTrackerPath(){
        Tracker tracker = new Tracker();
        try{
            tracker.followPath('N');
            tracker.followPath('O');
            tracker.followPath('O');
            tracker.followPath('N');
            tracker.followPath('N');
            tracker.followPath('E');
            tracker.followPath('S');
            tracker.followPath('S');
            tracker.followPath('E');
        }catch (Exception e){
            fail("No exception should be thrown");
        }
        assertEquals(8, tracker.getPathSize());
    }

    @Test
    public void invalidTrackerPath(){
        Tracker tracker = new Tracker();
        try{
            tracker.followPath('Q');
            fail("An exception should be thrown");
        }catch (Exception e){
            assertTrue(e.getMessage().contains("The inserted path had invalid characters. Please use only 'N','S','E' or 'O'"));
        }
    }



}
