package Pr1;

import Pr1.game.GameRunner;
import Pr1.game.GamingConsole;
import Pr1.game.MarioGame;
import Pr1.game.SuperContraGame;

public class AppGaming {
    public static void main(String[] args) {

//        var game = new MarioGame();
                var game = new MarioGame();

//        var game = new SuperContraGame();
        var gameRunner = new GameRunner(game);
        gameRunner.run();

    }
}
