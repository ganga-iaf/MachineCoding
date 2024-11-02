package Strategies.BotPlayingStrategy.BotPlayingStrategyFactory;

import Models.Enums.BotDifficultyLevel;
import Strategies.BotPlayingStrategy.BotPlayingStrategy;
import Strategies.BotPlayingStrategy.EasyBotPlayingStrategy;
import Strategies.BotPlayingStrategy.HardBotPlayingStrategy;
import Strategies.BotPlayingStrategy.MediumBotPlayingStrategy;

import java.security.InvalidParameterException;

public class BotPlayingStrategyFactory {
    private static BotPlayingStrategy easy=new EasyBotPlayingStrategy();
    private static BotPlayingStrategy medium=new MediumBotPlayingStrategy();
    private static BotPlayingStrategy hard=new HardBotPlayingStrategy();
    public static BotPlayingStrategy getBotPlayingStrategy(BotDifficultyLevel botDifficultyLevel){
          if(botDifficultyLevel.equals(BotDifficultyLevel.Easy))
              return easy;
          else if(botDifficultyLevel.equals(BotDifficultyLevel.Medium))
              return medium;
          else if(botDifficultyLevel.equals(BotDifficultyLevel.Hard))
              return hard;
          else
              throw new InvalidParameterException("");

    }
}
