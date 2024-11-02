package Models;
import Strategies.WinningStrategy.WinningStrategy;

import java.util.*;
public class Game {
    private Board board;
    private List<Player> players;
    private List<Move> moveHistory;
    private Player winner;

    private int nextPlayerIndex;

    private List<WinningStrategy> winningStrategies;


}
