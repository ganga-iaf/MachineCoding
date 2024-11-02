package Models;

import Models.Enums.BotDifficultyLevel;
import Models.Enums.PlayerType;
import Strategies.BotPlayingStrategy.BotPlayingStrategy;
import Strategies.BotPlayingStrategy.BotPlayingStrategyFactory.BotPlayingStrategyFactory;

public class BotPlayer extends Player{
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;
    public BotPlayer(int id, PlayerType playerType, String name, Symbol symbol,BotDifficultyLevel botDifficultyLevel) {
        super(id, playerType, name, symbol);
        this.botDifficultyLevel=botDifficultyLevel;
        this.botPlayingStrategy= BotPlayingStrategyFactory.getBotPlayingStrategy(botDifficultyLevel);
    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }
}
