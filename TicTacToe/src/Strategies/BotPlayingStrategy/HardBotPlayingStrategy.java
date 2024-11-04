package Strategies.BotPlayingStrategy;

import Models.*;
import java.util.Random;
public class HardBotPlayingStrategy implements BotPlayingStrategy{
    private static Random random = new Random();
    @Override
    public Move makeMove(Board board, Player player) {
        int x = 0; // lower bound
        int y = 2; // upper bound
        int row = random.nextInt(y - x + 1) + x;
        int col = random.nextInt(y - x + 1) + x;
        return new Move(new Cell(row,col),player);
    }
}
