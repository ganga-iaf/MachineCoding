package Strategies.WinningStrategy;

import Models.Board;
import Models.Cell;
import Models.Enums.CellState;
import Models.Move;

public class DiagonalWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move lastMove) {
        char charSymbol=lastMove.getCell().getSymbol().getCharSymbol();
        int size=board.getSize();
        boolean result=true;
        for(int i=0;i<size;i++){
            Cell leftDiagonalCell=board.getGrid().get(i).get(i);
            if(leftDiagonalCell.getCellState().equals(CellState.Empty)||charSymbol!=leftDiagonalCell.getSymbol().getCharSymbol()){
              result=false;
              break;
            }
        }
        if(result) return true;
        else result=true;
        for(int i=0;i<size;i++) {
            Cell rightDiagonalCell = board.getGrid().get(i).get(size - 1 - i);
            if (rightDiagonalCell.getCellState().equals(CellState.Empty) || charSymbol != rightDiagonalCell.getSymbol().getCharSymbol()){
                return false;
            }
        }
        return true;
    }
}
