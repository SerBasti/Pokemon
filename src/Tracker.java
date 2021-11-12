import java.util.LinkedList;

public class Tracker {

    private long pathSize;

    private Coordinate currentPosition;

    private LinkedList<Coordinate> passedTiles;

    public Tracker() {
        pathSize = 1;
        currentPosition = new Coordinate(0,0);
        passedTiles = new LinkedList<>();
        passedTiles.add(currentPosition);
    }

    public void followPath(char direction) throws InvalidDirectionException {
        switch(direction) {
            case 'N':
                currentPosition.moveUp();
                addNewPassedTile();
                break;
            case 'S':
                currentPosition.moveDown();
                addNewPassedTile();
                break;
            case 'E':
                currentPosition.moveRight();
                addNewPassedTile();
                break;
            case 'O':
                currentPosition.moveLeft();
                addNewPassedTile();
                break;
            default:
                throw new InvalidDirectionException("The inserted path had invalid characters. Please use only 'N','S','E' or 'O'");
                // code block
        }
    }

    private void addNewPassedTile(){
        if(!passedTiles.contains(currentPosition)){
            passedTiles.add(currentPosition);
            ++pathSize;
        }
    }

    public Long getPathSize() {
        return pathSize;
    }

    public void newPath() {
        pathSize = 1;
        currentPosition = new Coordinate(0,0);
        passedTiles.clear();
        passedTiles.add(currentPosition);
    }
}
