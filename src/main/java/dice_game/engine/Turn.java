package dice_game.engine;

import dice_game.model.dice.Die;
import dice_game.model.player.Player;

import java.util.List;

/**
 * handles Turns
 */
public class Turn {

    private Game game;
    private Player activePlayer;

    public void turn() {

        // The active Player rolls dice if he can
        // The active Player selects which dice to keep
        // The active Player switches to next Player
        // when no Players have Rolls remaining, the dice get resolved.

    }

    private void resolveDice(List<Die> diceList) {
        for(Die dieToResolve : diceList) {

        }
    }

}
