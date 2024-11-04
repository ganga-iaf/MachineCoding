package Strategies.BotPlayingStrategy;

import Models.Board;
import Models.Cell;
import Models.Enums.CellState;
import Models.Move;
import Models.Player;


import java.util.*;
public class EasyBotPlayingStrategy implements BotPlayingStrategy {
    @Override
    public Move makeMove(Board board, Player player) {
        int size= board.getSize();
        for(List<Cell> row:board.getGrid()){
            for(Cell cell:row){
                if(cell.getCellState().equals(CellState.Empty)){
                    //cell.setCellState(CellState.Filled);
                    //cell.setSymbol(player.getSymbol());
                    return new Move(cell,player);
                }
            }
        }
        return null;
    }
}
