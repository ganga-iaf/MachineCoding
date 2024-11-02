package Strategies.WinningStrategy;

import Models.Board;
import Models.Move;

public interface WinningStrategy {
    boolean checkWinner(Board board, Move lastMove);
}
