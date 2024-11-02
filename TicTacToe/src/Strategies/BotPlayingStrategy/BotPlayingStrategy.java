package Strategies.BotPlayingStrategy;

import Models.Board;
import Models.Player;

public interface BotPlayingStrategy {
    void makeMove(Board board, Player player);
}
