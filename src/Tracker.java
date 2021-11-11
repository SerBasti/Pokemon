import java.util.HashMap;

public class Tracker {

    private long pathSize;

    private Coordinate currentPosition;

    private HashMap<Long, Long> grid;

    public Tracker() {
        pathSize = 1;
        currentPosition = new Coordinate(0,0);
        grid = new HashMap<>();
        grid.put(0L, 0L);
    }

    public void followPath(char direction) {


    }

    public Long getPathSize() {
        return pathSize;
    }

    public void newPath() {
        pathSize = 1;
        currentPosition = new Coordinate(0,0);
        grid.clear();
        grid.put(0L, 0L);
    }
}
