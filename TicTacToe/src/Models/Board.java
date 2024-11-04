package Models;
import Models.Enums.CellState;

import java.util.*;
public class Board {
    private int size;
    private List<List<Cell>> grid;

    public Board(int size){
        this.size=size;
        this.grid=new ArrayList<>();
        for(int i=0;i<size;i++){
            this.grid.add(new ArrayList<>());
            for(int j=0;j<size;j++){
             this.grid.get(i).add(new Cell(i,j));
            }
        }
    }
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
    public void undoMove(Move move){
        Cell cell=move.getCell();
        int row=cell.getRow();
        int col=cell.getCol();
        this.grid.get(row).get(col).setCellState(CellState.Empty);
        this.grid.get(row).get(col).setSymbol(null);
    }
    public void display(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                this.grid.get(i).get(j).displayCell();
            }
            System.out.println();
        }
    }
}
