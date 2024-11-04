package Strategies.WinningStrategy;

import Models.Board;
import Models.Cell;
import Models.Enums.CellState;
import Models.Move;
import Models.Symbol;

public class ColumnWinningStrategy implements WinningStrategy {
    @Override
    public boolean checkWinner(Board board, Move lastMove) {
        int col=lastMove.getCell().getCol();
        char charSym=lastMove.getCell().getSymbol().getCharSymbol();
        for(int i=0;i<board.getSize();i++){
            Cell colCell=board.getGrid().get(i).get(col);
            if(colCell.getCellState().equals(CellState.Empty)|| charSym!=colCell.getSymbol().getCharSymbol())
                return false;
        }
        return true;
    }
}
