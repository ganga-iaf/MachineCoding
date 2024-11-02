package Strategies.WinningStrategy;

import Models.Board;
import Models.Move;

public class DiagonalWinningStrategy implements WinningStrategy{
    @Override
    public boolean checkWinner(Board board, Move lastMove) {
        return false;
    }
}
