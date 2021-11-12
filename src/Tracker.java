import java.util.LinkedList;

public class Tracker {

    private long pathSize;

    private Coordinate currentPosition;

    private LinkedList<Coordinate> passedTiles;

    public Tracker() {
        pathSize = 1;
        currentPosition = new Coordinate(0,0);
        passedTiles = new LinkedList<>();
        passedTiles.add(currentPosition.copy());
    }

    public void followPath(char direction) throws InvalidDirectionException {
        switch(direction) {
            case 'N':
                currentPosition.moveUp();
                addNewPassedTile(currentPosition.copy());
                break;
            case 'S':
                currentPosition.moveDown();
                addNewPassedTile(currentPosition.copy());
                break;
            case 'E':
                currentPosition.moveRight();
                addNewPassedTile(currentPosition.copy());
                break;
            case 'O':
                currentPosition.moveLeft();
                addNewPassedTile(currentPosition.copy());
                break;
            default:
                throw new InvalidDirectionException("The inserted path had invalid characters. Please use only 'N','S','E' or 'O'");
                // code block
        }
    }

    private void addNewPassedTile(Coordinate newCoordinate){
        if(!passedTiles.contains(newCoordinate)){
            passedTiles.add(newCoordinate);
            ++pathSize;
        }
    }

    public long getPathSize() {
        return pathSize;
    }

    public void newPath() {
        pathSize = 1;
        currentPosition = new Coordinate(0,0);
        passedTiles.clear();
        passedTiles.add(currentPosition.copy());
    }
}
