package Strategies.BotPlayingStrategy;


import Models.*;

public interface BotPlayingStrategy {
    Move makeMove(Board board, Player player);
}
