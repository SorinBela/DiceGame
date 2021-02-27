package dice_game.model.player;

import dice_game.model.dice.StdOerloegD6;
import dice_game.model.dice.Symbol;
import dice_game.model.dice.TestDie;

public class PlayerFactory {

    private PlayerFactory() {}

    public static Player createNewPlayer() {
        return new Player(
                new StdOerloegD6(),
                new StdOerloegD6(),
                new StdOerloegD6(),
                new StdOerloegD6(),
                new StdOerloegD6()
        );
    }

    public static Player createTestPlayer() {
        return new Player(
                new TestDie(Symbol.ATK_MELEE, true)
        );
    }
}
