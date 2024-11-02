package Strategies.WinningStrategy;

import Models.Board;
import Models.Move;
import Models.Symbol;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy {
    HashMap<Integer,HashMap<Character,Integer>> rowCount=new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move lastMove) {
        int row=lastMove.getCell().getRow();
        Symbol symbol =lastMove.getCell().getSymbol();
        if(!rowCount.containsKey(row)){
            rowCount.put(row,new HashMap<>());
        }
        HashMap<Character,Integer> counts=rowCount.get(row);
        if(counts.get(symbol.getCharSymbol())== board.getSize())
            return true;
        return false;
    }
}
