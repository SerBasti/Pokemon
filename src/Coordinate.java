import java.util.Objects;

public class Coordinate {

    private long x;
    private long y;

    public Coordinate(long x, long y){
        this.x = x;
        this.y = y;
    }

    public void moveUp(){
        ++y;
    }

    public void moveDown(){
        --y;
    }

    public void moveRight(){
        ++x;
    }

    public void moveLeft(){
        --x;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return x == that.x && y == that.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
