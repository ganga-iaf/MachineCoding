package Models;
import Exceptions.InvalidMoveException;
import Models.Enums.CellState;
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

    private boolean validateMove(Move move){
        int row= move.getCell().getRow();
        int col=move.getCell().getCol();
        if(row<0 || col<0 ||row>board.getSize()-1 || col>board.getSize() || board.getGrid().get(row).get(col).getCellState().equals(CellState.Filled))
            return false;
        return true;
    }
    public void makeMove(){
        Player currPlayer=players.get(nextPlayerIndex);
        System.out.println("Hey,"+currPlayer.getName()+" It's your turn.Please make your move.");
        Move move=currPlayer.makeMove(board);
        if(!validateMove(move))
           throw new InvalidMoveException("Invalid move.");
        int row=move.getCell().getRow();
        int col=move.getCell().getCol();
        Cell cell=board.getGrid().get(row).get(col);
        cell.setCellState(CellState.Filled);
        cell.setSymbol(currPlayer.getSymbol());
        move.setCell(cell);
        moveHistory.add(move);
        nextPlayerIndex++;
        nextPlayerIndex%=players.size();

        if(checkWinner(board,move)){
            setWinner(currPlayer);
            setGameState(GameState.Completed);
        }else if(moveHistory.size()==board.getSize()*board.getSize()){
            setGameState(GameState.Draw);
        }
        
    }
    
    private boolean checkWinner(Board board,Move lastMove){
        for (WinningStrategy winningStrategy: winningStrategies) {
            if(winningStrategy.checkWinner(board,lastMove)){
                return true;
            }
        }
        return false;
    }
    public void display(){
        this.board.display();
    }

    public void undoMove(){
        Move move=moveHistory.remove(moveHistory.size()-1);
        board.undoMove(move);
        if(nextPlayerIndex==0) nextPlayerIndex=players.size()-1;
        else nextPlayerIndex--;
        setWinner(null);
        setGameState(GameState.Inprogess);
        System.out.println("Undoing your last move is successful.");
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
