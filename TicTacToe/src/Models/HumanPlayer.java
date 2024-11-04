package Models;

import Models.Enums.PlayerType;

import java.util.Scanner;

public class HumanPlayer extends Player {
    public HumanPlayer(int id, PlayerType playerType, String name, Symbol symbol) {
        super(id, playerType, name, symbol);
    }

    @Override
    public Move makeMove(Board board) {
        Scanner scr=new Scanner(System.in);
        System.out.println("Enter the row value");
        int row=scr.nextInt();
        System.out.println("Enter the column value");
        int col=scr.nextInt();
        return new Move(new Cell(row,col),this);
    }
}
