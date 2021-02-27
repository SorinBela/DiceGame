package dice_game.engine;

import dice_game.action.GameAction;

public class Game /*implements GameAction*/ {

    enum GameState {
        WAITING_FOR_START,
        RUNNING,
        FINISHED
    }

    private GameState gameState;
}
