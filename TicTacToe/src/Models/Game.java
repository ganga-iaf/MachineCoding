package Models;
import Models.Enums.GameState;
import Strategies.WinningStrategy.WinningStrategy;

import java.util.*;
public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moveHistory;
    private Player winner;
    private int nextPlayerIndex;
    private GameState gameState;
    private List<WinningStrategy> winningStrategies;

    private Game(Builder builder){
        this.board=new Board(builder.size);
        this.players=builder.players;
        this.winningStrategies=builder.strategies;
        this.winner=null;
        this.nextPlayerIndex=0;
        this.moveHistory=new ArrayList<>();
        this.gameState=GameState.Inprogess;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Move> getMoveHistory() {
        return moveHistory;
    }

    public void setMoveHistory(List<Move> moveHistory) {
        this.moveHistory = moveHistory;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public int getNextPlayerIndex() {
        return nextPlayerIndex;
    }

    public void setNextPlayerIndex(int nextPlayerIndex) {
        this.nextPlayerIndex = nextPlayerIndex;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public List<WinningStrategy> getWinningStrategies() {
        return winningStrategies;
    }

    public void setWinningStrategies(List<WinningStrategy> winningStrategies) {
        this.winningStrategies = winningStrategies;
    }

    public void makeMove(){

    }
    public void display(){
        this.board.display();
    }

    public static Builder getBuilder(){
        return new Builder();
    }
    public static class  Builder{
         private int size;
         private List<Player> players;
         private List<WinningStrategy> strategies;

        public Builder setSize(int size) {
            this.size = size;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setStrategies(List<WinningStrategy> strategies) {
            this.strategies = strategies;
            return this;
        }

        public void validate(){
            //validations
            //1. At max 1 Bot in the game
            //2. Players size should be=boardsize-1
            if(players.size()!=size-1){
                throw new RuntimeException("Invalid players count");
            }
            //3. Every player should have seperate symbol
        }
        public Game Build(){
            validate();
            return new Game(this);
        }
    }
}
