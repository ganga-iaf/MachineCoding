package Models;
import java.util.*;
public class Board {
    private int size;
    private List<List<Cell>> grid;


    public void setSize(int size){
        this.size=size;
    }

    public int getSize(){
        return this.size;
    }

    public void setGrid(List<List<Cell>> grid){
         this.grid=grid;
    }

    public List<List<Cell>> getGrid(){
        return this.grid;
    }

}
