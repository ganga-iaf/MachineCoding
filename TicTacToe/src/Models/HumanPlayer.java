package Models;

import Models.Enums.PlayerType;

public class HumanPlayer extends Player {
    public HumanPlayer(int id, PlayerType playerType, String name, Symbol symbol) {
        super(id, playerType, name, symbol);
    }
}
