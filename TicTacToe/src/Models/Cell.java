package Models;

import Models.Enums.CellState;

public class Cell {
    private int row;
    private int col;
    private Symbol symbol;
    private CellState cellState;

    public Cell(int r,int c){
        this.row=r;
        this.col=c;
        this.symbol=null;
        this.cellState=CellState.Empty;
    }
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public CellState getCellState() {
        return cellState;
    }

    public void setCellState(CellState cellState) {
        this.cellState = cellState;
    }

    public void displayCell(){
        if(this.cellState==CellState.Empty)
            System.out.print("|-|");
        else
            System.out.print("|"+this.symbol.getCharSymbol()+"|");
    }
}
