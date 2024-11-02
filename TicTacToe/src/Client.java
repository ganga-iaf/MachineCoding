import Controllers.GameController;
import Models.*;
import Models.Enums.BotDifficultyLevel;
import Models.Enums.GameState;
import Models.Enums.PlayerType;
import Strategies.WinningStrategy.WinningStrategy;

import java.util.*;
public class Client {
    public static void main(String[] args) {
        GameController gameController=new GameController();
        //Building Players
        List<Player> players=new ArrayList<Player>();
        players.add(new HumanPlayer(1, PlayerType.Human,"Ganga",new Symbol('X',"Red")));
        players.add(new BotPlayer(2, PlayerType.Bot,"Bujji",new Symbol('X',"Red"), BotDifficultyLevel.Easy));

        List<WinningStrategy> strategies=new ArrayList<>();
        Game game = gameController.startGame(3,players,strategies);
        gameController.display(game);

        while(gameController.checkGameState(game).equals(GameState.Inprogess)){
            gameController.makeMove(game);
            gameController.display(game);
        }

        if(gameController.checkGameState(game).equals(GameState.Completed)){
            System.out.println("Winner is :"+gameController.getWinner(game).getName());
        }else{
            System.out.println("Game ends in a Draw");
        }
    }
}
