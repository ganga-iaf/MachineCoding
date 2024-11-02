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
           game.makeMove();
    }

    public void undoMove(Game game){

    }

    public GameState checkGameState(Game game){
           return game.getGameState();
    }

    public Player getWinner(Game game){
          return null;
    }
}
