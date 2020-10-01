import java.util.ArrayList;

public class board {
    ArrayList<ArrayList<box>> row = new ArrayList<>(8);
    ArrayList<box> collum = new ArrayList<>(8);


    boolean move(int currentRow, int currentCollum, int moveRow, int moveCollum) {

        row.get(currentRow-1).get(currentCollum-1).p.move();

        return false;
    }

}
