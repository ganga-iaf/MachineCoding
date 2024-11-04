package Strategies.WinningStrategy;

import Models.*;
import Models.Enums.CellState;

public class CornerWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move lastMove) {
        char charSymbol=lastMove.getCell().getSymbol().getCharSymbol();
        int size=board.getSize();
        Cell topLeftCornerCell=board.getGrid().get(0).get(0);
        Cell topRightCornerCell=board.getGrid().get(0).get(size-1);
        Cell bottomLeftCornerCell=board.getGrid().get(size-1).get(0);
        Cell bottomRightCornerCell=board.getGrid().get(size-1).get(size-1);
        if(topLeftCornerCell.getCellState().equals(CellState.Empty)
        || topRightCornerCell.getCellState().equals(CellState.Empty)
        || bottomLeftCornerCell.getCellState().equals(CellState.Empty)
        || bottomRightCornerCell.getCellState().equals(CellState.Empty)
        || topLeftCornerCell.getSymbol().getCharSymbol()!=charSymbol
        || topRightCornerCell.getSymbol().getCharSymbol()!=charSymbol
        || bottomLeftCornerCell.getSymbol().getCharSymbol()!=charSymbol
        || bottomRightCornerCell.getSymbol().getCharSymbol()!=charSymbol)
            return false;
        return true;
    }
}
