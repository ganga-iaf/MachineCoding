package Controllers;

import Models.Enums.GameState;
import Models.Game;
import Models.Player;
import Strategies.WinningStrategy.WinningStrategy;

import java.util.*;

public class GameController {
    private Game game;
    public Game startGame(
            int boardSize,
            List<Player> players,
            List<WinningStrategy> winningStrategies){
         return Game.getBuilder()
                 .setSize(boardSize)
                 .setPlayers(players)
                 .setStrategies(winningStrategies)
                 .Build();
    }

    public void display(Game game){
           game.display();
    }

    public void makeMove(Game game){
        try {
            game.makeMove();
        }catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public void undoMove(Game game){
           game.undoMove();
    }

    public GameState checkGameState(Game game){
        return game.getGameState();
    }

    public Player getWinner(Game game){
          return game.getWinner();
    }
}
