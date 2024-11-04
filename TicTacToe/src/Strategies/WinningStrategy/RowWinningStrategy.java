package Strategies.WinningStrategy;

import Models.Board;
import Models.Cell;
import Models.Enums.CellState;
import Models.Move;
import Models.Symbol;

import java.util.HashMap;

public class RowWinningStrategy implements WinningStrategy {
    HashMap<Integer,HashMap<Character,Integer>> rowCount=new HashMap<>();
    @Override
    public boolean checkWinner(Board board, Move lastMove) {
        /*
        // O(1)
        int row=lastMove.getCell().getRow();
        Symbol symbol =lastMove.getCell().getSymbol();
        if(!rowCount.containsKey(row)){
            rowCount.put(row,new HashMap<>());
        }
        HashMap<Character,Integer> counts=rowCount.get(row);
        if(!counts.containsKey(symbol.getCharSymbol())){
            counts.put(symbol.getCharSymbol(),0);
        }
        counts.put(symbol.getCharSymbol(),counts.get(symbol.getCharSymbol())+1);
        int cnt=counts.get(symbol.getCharSymbol());
        if(cnt== board.getSize())
            return true;
        return false;*/
        //O(n)
        int row=lastMove.getCell().getRow();
        char charSymbol= lastMove.getCell().getSymbol().getCharSymbol();
        for(int i=0;i<board.getSize();i++){
              Cell cell=board.getGrid().get(row).get(i);
             if(cell.getCellState().equals(CellState.Empty) || charSymbol!=cell.getSymbol().getCharSymbol())
                   return false;
        }
        return true;
    }
}
